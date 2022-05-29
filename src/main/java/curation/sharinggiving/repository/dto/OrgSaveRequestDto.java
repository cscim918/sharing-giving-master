package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.OrganizationHashtag;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class OrgSaveRequestDto {
    private String name;
    private String orgThumbnail;
    private String description;
    private String orgLink;
    private List<OrganizationHashtag> organizationHashtags;

    @Builder
    public OrgSaveRequestDto(String name, String orgThumbnail, String description, String orgLink, List<OrganizationHashtag> organizationHashtags) {
        this.name = name;
        this.orgThumbnail = orgThumbnail;
        this.description = description;
        this.orgLink = orgLink;
        this.organizationHashtags = organizationHashtags;
    }
}
