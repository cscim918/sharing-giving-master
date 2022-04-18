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

    @Transactional(readOnly = true) // 조회 속도 개선
    public List<CampaignListResponseDto> findByTitle(String keyword) {
        return campaignRepository.findByTitle(keyword)
                .stream()
                .map(CampaignListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<CampaignListResponseDto> findByHashtag(String hashtag) {
        return campaignRepository.findByHashtag(hashtag)
                .stream()
                .map(CampaignListResponseDto::new)
                .collect(Collectors.toList());
    }
}
