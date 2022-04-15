package curation.sharinggiving.controller;

import curation.sharinggiving.controller.dto.CampaignListResponseDto;
import curation.sharinggiving.controller.dto.CampaignSaveRequestDto;
import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.repository.CampaignRepository;
import curation.sharinggiving.service.CampaignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CampaignApiController {

    private final CampaignService campaignService;
    private final CampaignRepository campaignRepository;

//    @GetMapping("/api/v1/campaigns")
//    public List<Campaign> campaignsV1() {
//        return campaignService.findCampaings();
//    }

//    @GetMapping("/api/v2/campaigns")
//    public List<Campaign> campaignsV2() {
//        return campaignRepository.findAllByString(new Search());
//    }

//    @GetMapping("/api/v3/campaigns")
//    public List<Campaign> campaignsV3(@RequestParam(value = "title") String title) {
//        List<Campaign> all = campaignRepository.findByTitleContaining(title);
//        return all;
//    }

    @GetMapping("/api/v4/campaigns")
    public List<Campaign> findByCampaign(@RequestParam(value = "keyword") String keyword){
        List<Campaign> all = campaignRepository.findByTitleContaining(keyword);
        return all;
    }

    @PostMapping("/api/v1/campaigns")
    public Long save(@RequestBody CampaignSaveRequestDto requestDto) {
        return campaignService.save(requestDto);
    }

    @GetMapping("/api/v3/campaigns")
    public List<CampaignListResponseDto> findAllDesc(){
        return campaignService.findAllDesc();
    }

}
