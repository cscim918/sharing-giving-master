package curation.sharinggiving.service;

import curation.sharinggiving.controller.dto.CampaignListResponseDto;
import curation.sharinggiving.controller.dto.CampaignSaveRequestDto;
import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.repository.CampaignRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CampaignService {
    private final CampaignRepository campaignRepository;

    @Transactional(readOnly = true)
    public List<CampaignListResponseDto> findAllDesc() {
        return campaignRepository.findAllDesc().stream()
                .map(CampaignListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public Long save(CampaignSaveRequestDto requestDto){
        return campaignRepository.save(requestDto.toEntity()).getId();
    }

    public CampaignListResponseDto findById(Long id) {
        Campaign entity = campaignRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
        return new CampaignListResponseDto(entity);
    }

    public List<CampaignListResponseDto> findByTitle(String keyword) {
        return campaignRepository.findByTitleContaining(keyword)
                .stream()
                .map(CampaignListResponseDto::new)
                .collect(Collectors.toList());
    }

    // 캠페인 카드 등록
//    @Transactional
//    public Long join(Campaign campaign){
//        campaignRepository.save(campaign);
//        return campaign.getId();
//    }
//    // 캠페인 전체 조회
//    public List<Campaign> findCampaings() {
//        return campaignRepository.findAll();
//    }
//
//    // 캠페인 개별 조회
//    public Campaign findOne(Long campaignId) {
//        return campaignRepository.findOne(campaignId);
//    }
}
