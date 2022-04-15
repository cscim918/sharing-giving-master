package curation.sharinggiving.controller;

import curation.sharinggiving.controller.dto.CampaignListResponseDto;
import curation.sharinggiving.controller.dto.CampaignSaveRequestDto;
import curation.sharinggiving.repository.CampaignRepository;
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

    @GetMapping("/api/v1/search")
    public List<CampaignListResponseDto> findByCampaign(@RequestParam(value = "keyword") String keyword){
        List<CampaignListResponseDto> all = campaignService.findByTitle(keyword);
        return all;
    }

//    @PostMapping("/api/v1/campaigns")
//    public Long save(@RequestBody CampaignSaveRequestDto requestDto) {
//        return campaignService.save(requestDto);
//    }
}
