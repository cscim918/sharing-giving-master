package curation.sharinggiving.controller.dto;

import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.domain.Category;
import curation.sharinggiving.domain.Hashtag;
import curation.sharinggiving.domain.Organization;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class CampaignSaveRequestDto {
    private String title;
    private String startDate;
    private String closingDate;
    private String campThumbnail;
    private Category category;
    private String content;
    private Organization organization;
    private Hashtag hashtag;

    @Builder
    public CampaignSaveRequestDto(String title, String startDate, String closingDate, String campThumbnail, Category category, String content, Organization organization, Hashtag hashtag) {
        this.title = title;
        this.startDate = startDate;
        this.closingDate = closingDate;
        this.campThumbnail = campThumbnail;
        this.category = category;
        this.content = content;
        this.organization = organization;
        this.hashtag = hashtag;
    }

    public Campaign toEntity() {
        return Campaign.builder()
                .title(title)
                .startDate(startDate)
                .closingDate(closingDate)
                .campThumbnail(campThumbnail)
                .category(category)
                .content(content)
                .organization(organization)
                .hashtag(hashtag)
                .build();
    }
}
