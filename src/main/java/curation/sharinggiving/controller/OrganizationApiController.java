package curation.sharinggiving.controller;

import curation.sharinggiving.controller.dto.OrganizationResponseDto;
import curation.sharinggiving.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrganizationApiController {

    private final OrganizationService organizationService;

    @GetMapping("api/v1/organizations") // 기부단체 전체 조회
    public List<OrganizationResponseDto> organizations() { return organizationService.findAllOrganizations(); }

    @GetMapping("api/v1/organizations/{id}") // 기부단체 개별 조회
    public OrganizationResponseDto findById(@PathVariable Long id){
        return organizationService.findById(id);
    }
}
