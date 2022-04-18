package curation.sharinggiving.controller;

import curation.sharinggiving.controller.dto.CampaignListResponseDto;
import curation.sharinggiving.service.CampaignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CampaignApiController {

    private final CampaignService campaignService;

    @GetMapping("/api/v1/campaigns")
    public List<CampaignListResponseDto> findAllDesc(){
        return campaignService.findAllDesc();
    }

//    @PostMapping("/api/v1/campaigns")
//    public Long save(@RequestBody CampaignSaveRequestDto requestDto) {
//        return campaignService.save(requestDto);
//    }
}