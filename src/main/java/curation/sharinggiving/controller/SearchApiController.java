package curation.sharinggiving.controller;

import curation.sharinggiving.repository.dto.CampResponseDto;
import curation.sharinggiving.repository.dto.OrgResponseDto;
import curation.sharinggiving.service.CampaignService;
import curation.sharinggiving.service.OrganizationService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class SearchApiController {

    private final CampaignService campaignService;
    private final OrganizationService organizationService;

    @CrossOrigin("*")
    @GetMapping("/api/v1/search")
    public Result findByCampaign(@RequestParam(value = "keyword") String keyword){
        List<CampResponseDto> searchCampaign = campaignService.searchCampaign(keyword);
        List<OrgResponseDto> searchOrganization = organizationService.searchOrganization(keyword);
        return new Result(searchCampaign, searchOrganization);
    }

    @Data
    @AllArgsConstructor
    static class Result<T> {
        private T campaign;
        private T organization;
    }
}
