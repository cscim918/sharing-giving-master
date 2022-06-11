package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.Organization;
import curation.sharinggiving.domain.OrganizationHashtag;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class OrgHashtagSearchResponseDto {
    private Long id;
    private String orgName;
    private String orgThumbnail;
    private String description;
    private String orgLink;

    private List<OrgHashtagResponseDto> hashtags;


    public OrgHashtagSearchResponseDto(OrganizationHashtag organizationHashtag) {
        this.id = organizationHashtag.getOrganization().getId();
        this.orgName = organizationHashtag.getOrganization().getName();
        this.orgThumbnail = organizationHashtag.getOrganization().getOrgThumbnail();
        this.description = organizationHashtag.getOrganization().getDescription();
        this.orgLink = organizationHashtag.getOrganization().getOrgLink();
        this.hashtags = organizationHashtag.getOrganization().getOrganizationHashtags().stream().map(OrgHashtagResponseDto::new).collect(Collectors.toList());
    }
}