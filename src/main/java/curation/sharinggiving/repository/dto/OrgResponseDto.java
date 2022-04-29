package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.Organization;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class OrgResponseDto {
    private Long id;
    private String name;
    private String orgThumbnail;
    private String description;
    private String orgLink;

    private List<OrgHashtagResponseDto> hashtags;

    public OrgResponseDto(Organization organization) {
        this.id = organization.getId();
        this.name = organization.getName();
        this.orgThumbnail = organization.getOrgThumbnail();
        this.description = organization.getDescription();
        this.orgLink = organization.getOrgLink();
        this.hashtags = organization.getOrganizationHashtags().stream().map(OrgHashtagResponseDto::new).collect(Collectors.toList());
    }
}