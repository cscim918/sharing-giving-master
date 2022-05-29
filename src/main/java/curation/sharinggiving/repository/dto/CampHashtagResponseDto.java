package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.CampaignHashtag;
import lombok.Getter;

@Getter
public class CampHashtagResponseDto {
    private Long id;
    private String tagName;

    public CampHashtagResponseDto(CampaignHashtag campaignHashtag) {
        this.id = campaignHashtag.getHashtag().getId();
        this.tagName = campaignHashtag.getHashtag().getTagName();

    }
}