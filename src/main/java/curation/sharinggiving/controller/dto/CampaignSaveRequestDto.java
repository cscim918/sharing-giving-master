package curation.sharinggiving.controller.dto;

import curation.sharinggiving.domain.Campaign;
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
    private String category;
    private String description;

    @Builder
    public CampaignSaveRequestDto(String title, String startDate, String closingDate, String campThumbnail, String category, String description) {
        this.title = title;
        this.startDate = startDate;
        this.closingDate = closingDate;
        this.campThumbnail = campThumbnail;
        this.category = category;
        this.description = description;
    }

    public Campaign toEntity() {
        return Campaign.builder()
                .title(title)
                .startDate(startDate)
                .closingDate(closingDate)
                .campThumbnail(campThumbnail)
                .category(category)
                .description(description)
                .build();
    }
}
