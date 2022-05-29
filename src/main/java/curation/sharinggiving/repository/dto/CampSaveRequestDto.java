package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.CampaignHashtag;
import curation.sharinggiving.domain.Category;
import curation.sharinggiving.domain.Organization;
import lombok.*;

import java.util.List;

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
    private List<CampaignHashtag> campaignHashtags;

    @Builder
    public CampSaveRequestDto(String title, String startDate, String closingDate, String campThumbnail, Category category, String content, String campLink, Organization organization, List<CampaignHashtag> campaignHashtags){
        this.title = title;
        this.startDate = startDate;
        this.closingDate = closingDate;
        this.campThumbnail = campThumbnail;
        this.category = category;
        this.content = content;
        this.campLink = campLink;
        this.organization = organization;
        this.campaignHashtags = campaignHashtags;
    }

//    public Campaign toEntity() {
//        return Campaign.builder()
//                .title(title)
//                .startDate(startDate)
//                .closingDate(closingDate)
//                .category(category)
//                .content(content)
//                .campLink(campLink)
//                .organization(organization)
//                .build();
//    }
}
