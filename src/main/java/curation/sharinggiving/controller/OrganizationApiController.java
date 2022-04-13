package curation.sharinggiving.controller;

import curation.sharinggiving.domain.Organization;
import curation.sharinggiving.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrganizationApiController {

    private final OrganizationService organizationService;

    @GetMapping("api/v1/organizations")
    public List<Organization> organizations() { return organizationService.findOrganizations(); }
}
