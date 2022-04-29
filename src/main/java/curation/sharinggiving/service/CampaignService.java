package curation.sharinggiving.service;

import curation.sharinggiving.repository.dto.CampResponseDto;
import curation.sharinggiving.repository.dto.CampSaveRequestDto;
import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.repository.CampaignRepository;
import curation.sharinggiving.repository.OrgHashtagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CampaignService {
    private final CampaignRepository campaignRepository;

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
    public Long join(CampSaveRequestDto requestDto, MultipartFile multipartFile) {
        try {
            // 이미지 업로드 부분
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
            // 이미지 파일 위치 저장
            campaign.setCampThumbnail(filePath);
            // 캠페인 데이터 저장
            return campaignRepository.save(campaign).getId();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
