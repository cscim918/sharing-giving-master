package curation.sharinggiving.service;

import curation.sharinggiving.controller.dto.CampaignResponseDto;
import curation.sharinggiving.controller.dto.CampaignSaveRequestDto;
import curation.sharinggiving.controller.dto.OrganizationHashtagResponseDto;
import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.repository.CampaignRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class CampaignService {
    private final CampaignRepository campaignRepository;

    @Transactional
    public Long save(CampaignSaveRequestDto requestDto, MultipartFile multipartFile) {
        try {
            String separ = File.separator;
            String today = new SimpleDateFormat("yyMMdd").format(new Date());

            File file = new File("");
            String rootPath = file.getAbsolutePath().split("src")[0];

            String savePath = rootPath + separ + "profileImg" + separ + today;
            if (!new File(savePath).mkdirs()) {
                try {
                    new File(savePath).mkdirs();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            String originFileName = multipartFile.getOriginalFilename();
            String saveFileName = UUID.randomUUID().toString() + originFileName.substring(originFileName.lastIndexOf("."));

            String filePath = savePath + separ + saveFileName;
            multipartFile.transferTo(new File(filePath));
            Campaign campaign = requestDto.toEntity();
            campaign.setCampThumbnail(filePath);

            return campaignRepository.save(campaign).getId();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Transactional(readOnly = true)
    public List<CampaignResponseDto> findAllCampaigns() { // 캠페인 전체 조회
        return campaignRepository.findAllCampaigns().stream()
                .map(CampaignResponseDto::new)
                .collect(Collectors.toList());
    }

    public CampaignResponseDto findById(Long id) { // 캠페인 개별 조회
        Campaign entity = campaignRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new CampaignResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<CampaignResponseDto> findByTitle(String keyword) { // 캠페인 검색
        return campaignRepository.findByTitle(keyword)
                .stream()
                .map(CampaignResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<CampaignResponseDto> findByCampaignHashtag(String hashtag) { // 캠페인 해시태그 조회
        return campaignRepository.findByHashtag(hashtag)
                .stream()
                .map(CampaignResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<OrganizationHashtagResponseDto> findByOrganizationHashtag(String hashtag) { // 기부단체 해시태그 조회
        return campaignRepository.findByHashtag(hashtag)
                .stream()
                .map(OrganizationHashtagResponseDto::new)
                .collect(Collectors.toList());
    }
}
