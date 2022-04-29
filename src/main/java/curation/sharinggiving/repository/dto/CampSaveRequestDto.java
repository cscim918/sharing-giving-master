package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.domain.Category;
import curation.sharinggiving.domain.Organization;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class CampSaveRequestDto {
    private String title;
    private String startDate;
    private String closingDate;
    private String campThumbnail;
    private Category category;
    private String content;
    private String campLink;
    private Organization organization;

    @Builder
    public CampSaveRequestDto(String title, String startDate, String closingDate, String campThumbnail, Category category, String content, String campLink, Organization organization) {
        this.title = title;
        this.startDate = startDate;
        this.closingDate = closingDate;
        this.campThumbnail = campThumbnail;
        this.category = category;
        this.content = content;
        this.campLink = campLink;
        this.organization = organization;
    }

    public Campaign toEntity() {
        return Campaign.builder()
                .title(title)
                .startDate(startDate)
                .closingDate(closingDate)
                .campThumbnail(campThumbnail)
                .category(category)
                .content(content)
                .campLink(campLink)
                .organization(organization)
                .build();
    }
}
