package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.Hashtag;
import curation.sharinggiving.domain.Organization;
import curation.sharinggiving.domain.OrganizationHashtag;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class OrgHashtagResponseDto {
    private String tagName;

    public OrgHashtagResponseDto(OrganizationHashtag organizationHashtag) {
        this.tagName = organizationHashtag.getHashtag().getTagName();
    }
}