package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.CampaignHashtag;
import curation.sharinggiving.domain.Category;
import curation.sharinggiving.domain.OrganizationHashtag;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class CampHashtagSearchResponseDto {
    private Long id;
    private String campTitle;
    private String campStartDate;
    private String campClosingDate;
    private String campThumbnail;
    private Category category;
    private String content;
    private String campLink;

    private List<CampHashtagResponseDto> hashtags;


    public CampHashtagSearchResponseDto(CampaignHashtag campaignHashtag) {
        this.id = campaignHashtag.getCampaign().getId();
        this.campTitle = campaignHashtag.getCampaign().getTitle();
        this.campStartDate = campaignHashtag.getCampaign().getStartDate();
        this.campClosingDate = campaignHashtag.getCampaign().getClosingDate();
        this.campThumbnail = campaignHashtag.getCampaign().getCampThumbnail();
        this.category = campaignHashtag.getCampaign().getCategory();
        this.content = campaignHashtag.getCampaign().getContent();
        this.campLink = campaignHashtag.getCampaign().getCampLink();
        this.hashtags = campaignHashtag.getCampaign().getCampaignHashtags().stream().map(CampHashtagResponseDto::new).collect(Collectors.toList());
    }
}