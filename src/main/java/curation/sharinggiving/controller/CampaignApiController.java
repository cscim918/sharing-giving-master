package curation.sharinggiving.controller;

import curation.sharinggiving.controller.dto.CampaignListResponseDto;
import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.repository.CampaignRepository;
import curation.sharinggiving.service.CampaignService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/api/v4/campaigns/{id}")
    public CampaignListResponseDto findByCampaign(@PathVariable Long id){
        return campaignService.findById(id);
    }

}
