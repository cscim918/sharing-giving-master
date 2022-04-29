package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.domain.Category;
import lombok.Getter;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class CampResponseDto {
    private Long id;
    private String title;
    private String startDate;
    private String closingDate;
    private String campThumbnail;
    private Category category;
    private String content;
    private String campLink;

    private Long orgId;
    private String orgName;

    private List<CampHashtagResponseDto> hashtags;

    public CampResponseDto(Campaign campaign){
        this.id = campaign.getId();
        this.title = campaign.getTitle();
        this.startDate = campaign.getStartDate();
        this.closingDate = campaign.getClosingDate();
        this.campThumbnail = campaign.getCampThumbnail();
        this.category = campaign.getCategory();
        this.content = campaign.getContent();
        this.campLink = campaign.getCampLink();
        this.orgId = campaign.getOrganization().getId();
        this.orgName = campaign.getOrganization().getName();
        this.hashtags = campaign.getCampaignHashtags().stream().map(CampHashtagResponseDto::new).collect(Collectors.toList());
    }
}
