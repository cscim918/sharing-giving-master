package curation.sharinggiving.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3Client;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;
import curation.sharinggiving.config.AmazonS3Config;
import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.domain.CampaignHashtag;
import curation.sharinggiving.domain.Hashtag;
import curation.sharinggiving.repository.CampHashtagRepository;
import curation.sharinggiving.repository.CampaignRepository;
import curation.sharinggiving.repository.dto.CampResponseDto;
import curation.sharinggiving.repository.dto.CampSaveRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class CampaignService {
    private final CampaignRepository campaignRepository;
    private final CampHashtagRepository campHashtagRepository;
    private final S3Uploader s3Uploader;

    @Value("${cloud.aws.s3.bucket}")
    public String bucket; // S3 버킷 이름

    private final AmazonS3 amazonS3;

    @Transactional(readOnly = true)
    public List<CampResponseDto> findAllCampaigns() { // 캠페인 전체 조회
        return campaignRepository.findAllCampaigns().stream()
                .map(CampResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public CampResponseDto findById(Long id) { // 캠페인 개별 조회
        Campaign entity = campaignRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new CampResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<CampResponseDto> searchCampaign(String keyword) { // 캠페인 검색
        return campaignRepository.searchCampaign(keyword, keyword)
                .stream()
                .map(CampResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public Long saveCampaign(CampSaveRequestDto campSaveRequestDto, MultipartFile multipartFile, Hashtag... tags) throws IOException {
        Campaign campaign = new Campaign();
        campaign.setTitle(campSaveRequestDto.getTitle());
        campaign.setStartDate(campSaveRequestDto.getStartDate());
        campaign.setClosingDate(campSaveRequestDto.getClosingDate());
        campaign.setCategory(campSaveRequestDto.getCategory());
        campaign.setContent(campSaveRequestDto.getContent());
        campaign.setCampThumbnail(s3Uploader.upload(multipartFile, "campaign"));
        campaign.setCampLink(campSaveRequestDto.getCampLink());
        campaign.setOrganization(campSaveRequestDto.getOrganization());
        campaignRepository.save(campaign);
        for (Hashtag tag : tags) {
            CampaignHashtag campaignHashtag = new CampaignHashtag();
            campaignHashtag.setCampaign(campaign);
            campaignHashtag.setHashtag(tag);
            campHashtagRepository.save(campaignHashtag);
        }
        return campaign.getId();
    }

    @Transactional
    public boolean deleteById(long id) {
        Optional <Campaign> campaign = campaignRepository.findById(id);
        if (campaign.isPresent()){
            this.campaignRepository.deleteById(campaign.get().getId());
            s3Uploader.deleteFile(campaign.get().getCampThumbnail());
            return true;
        }
        return false;
    }

    @Transactional
    public boolean updateCampaignImage(Long id, MultipartFile multipartFile) throws IOException {
        Campaign campaign = campaignRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 캠페인이 없습니다. id =" + id));
        campaign.setCampThumbnail(s3Uploader.upload(multipartFile, "campaign"));
        return true;
    }
}
