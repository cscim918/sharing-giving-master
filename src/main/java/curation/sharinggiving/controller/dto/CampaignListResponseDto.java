package curation.sharinggiving.controller.dto;

import curation.sharinggiving.domain.Campaign;
import lombok.Getter;

@Getter
public class CampaignListResponseDto {
    private Long id;
    private String title;
    private String startDate;
    private String closingDate;
    private String campThumbnail;
    private String category;
    private String description;

    public CampaignListResponseDto(Campaign campaign){
        this.id = campaign.getId();
        this.title = campaign.getTitle();
        this.startDate = campaign.getStartDate();
        this.closingDate = campaign.getClosingDate();
        this.campThumbnail = campaign.getCampThumbnail();
        this.category = campaign.getCategory();
        this.description = campaign.getDescription();
    }
}
