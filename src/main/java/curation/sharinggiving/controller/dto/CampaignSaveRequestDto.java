package curation.sharinggiving.controller.dto;

import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.domain.Category;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class CampaignSaveRequestDto {
    private String title;
    private String startDate;
    private String closingDate;
    private String campThumbnail;
    private Category category;
    private String content;

    @Builder
    public CampaignSaveRequestDto(String title, String startDate, String closingDate, String campThumbnail, Category category, String content) {
        this.title = title;
        this.startDate = startDate;
        this.closingDate = closingDate;
        this.campThumbnail = campThumbnail;
        this.category = category;
        this.content = content;
    }

    public Campaign toEntity() {
        return Campaign.builder()
                .title(title)
                .startDate(startDate)
                .closingDate(closingDate)
                .campThumbnail(campThumbnail)
                .category(category)
                .content(content)
                .build();
    }
}
