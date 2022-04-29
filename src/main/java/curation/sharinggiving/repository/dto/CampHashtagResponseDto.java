package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.CampaignHashtag;
import lombok.Getter;

@Getter
public class CampHashtagResponseDto {
    private String tagName;


    public CampHashtagResponseDto(CampaignHashtag campaignHashtag) {
        this.tagName = campaignHashtag.getHashtag().getTagName();

    }
}