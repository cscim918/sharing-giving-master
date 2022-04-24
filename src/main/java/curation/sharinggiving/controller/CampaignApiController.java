package curation.sharinggiving.controller;

import curation.sharinggiving.controller.dto.CampaignResponseDto;
import curation.sharinggiving.controller.dto.CampaignSaveRequestDto;
import curation.sharinggiving.controller.dto.OrganizationHashtagResponseDto;
import curation.sharinggiving.service.CampaignService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CampaignApiController {

    private final CampaignService campaignService;

    @GetMapping("/api/v1/campaigns") // 캠페인 전체 조회
    public List<CampaignResponseDto> findAllCampaigns() {
        return campaignService.findAllCampaigns();
    }

    @GetMapping("/api/v1/campaigns/{id}") // 캠페인 개별 조회
    public CampaignResponseDto findById(@PathVariable Long id) {
        return campaignService.findById(id);
    }

    @GetMapping("/api/v1/campaigns/hashtag") // 캠페인 해시태그 조회
    public List<CampaignResponseDto> findByCampaignHashtag(@RequestParam(value = "hashtag") String hashtag) {
        List<CampaignResponseDto> all = campaignService.findByCampaignHashtag(hashtag);
        return all;
    }

    @GetMapping("/api/v1/organizations/hashtag") // 기부단체 해시태그 조회
    public List<OrganizationHashtagResponseDto> findByOrganizationHashtag(@RequestParam(value = "hashtag") String hashtag) {
        List<OrganizationHashtagResponseDto> all = campaignService.findByOrganizationHashtag(hashtag);
        return all;
    }

    @PostMapping("/api/v1/campaigns")
    public Long save(@RequestPart(value = "file") MultipartFile multipartFile,
                     @RequestPart(value = "requestDto") CampaignSaveRequestDto requestDto) {
        return campaignService.save(requestDto, multipartFile);
    }
}