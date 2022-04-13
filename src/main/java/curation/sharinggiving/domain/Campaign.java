package curation.sharinggiving.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "campaigns")
@Getter @Setter
@NoArgsConstructor
public class Campaign extends BaseTimeEnitiy{
    @Id @GeneratedValue // GeneratedValue 세팅 시 id 값이 항상 생성 보장
    @Column(name = "camp_id")
    private Long id;

    private String title;

    private String startDate;

    private String closingDate;

    private String campThumbnail;

    private String category;

    private String description;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name="org_id")
    private Organization organization;

    @OneToOne(cascade = CascadeType.ALL, fetch = EAGER)
    @JoinColumn(name = "tag_id")
    private Hashtag hashtag;

    // 연관관계 메서드
    public void setOrganization(Organization organization){
        this.organization = organization;
        organization.getCampaigns().add(this);
    }

    // 생성 메서드
    public static Campaign createCampaign(String title, String campThumbnail, String category, String startDate, String closingDate, String description, Organization organization, Hashtag hashtag){
        Campaign campaign = new Campaign();
        campaign.setTitle(title);
        campaign.setCampThumbnail(campThumbnail);
        campaign.setCategory(category);
        campaign.setStartDate(startDate);
        campaign.setClosingDate(closingDate);
        campaign.setDescription(description);
        campaign.setOrganization(organization);
        campaign.setHashtag(hashtag);
        return campaign;
    }
}
