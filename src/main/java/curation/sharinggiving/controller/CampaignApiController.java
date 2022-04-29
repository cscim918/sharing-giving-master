package curation.sharinggiving.controller;

import curation.sharinggiving.repository.dto.CampResponseDto;
import curation.sharinggiving.repository.dto.CampSaveRequestDto;
import curation.sharinggiving.service.CampaignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CampaignApiController {

    private final CampaignService campaignService;

    @GetMapping("/api/v1/campaigns") // 캠페인 전체 조회
    public List<CampResponseDto> findAllCampaigns() {
        return campaignService.findAllCampaigns();
    }

    @GetMapping("/api/v1/campaigns/{id}") // 캠페인 개별 조회
    public CampResponseDto findById(@PathVariable Long id) {
        return campaignService.findById(id);
    }

    @PostMapping("/api/v1/campaigns")
    public Long join(@RequestPart(value = "requestDto") CampSaveRequestDto requestDto,
                     @RequestPart(value = "file", required = false) MultipartFile multipartFile) {
        return campaignService.join(requestDto, multipartFile);
    }
}