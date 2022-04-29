package curation.sharinggiving.domain;

import lombok.*;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.EAGER;

@Entity
@Getter @Setter
@NoArgsConstructor
public class Campaign extends BaseTimeEnitiy {
    @Id
    @GeneratedValue // GeneratedValue 세팅 시 id 값이 항상 생성 보장
    @Column(name = "campaign_id")
    private Long id;

    private String title;

    private String startDate;

    private String closingDate;

    private String campThumbnail;

    private Category category;

    @Column(length=1000)
    private String content;

    private String campLink;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "org_id")
    private Organization organization;

    @OneToMany(mappedBy = "campaign", cascade = CascadeType.ALL)
    private List<CampaignHashtag> campaignHashtags = new ArrayList<>();

    //연관관계 메서드
    public void addCampaignHashtag(CampaignHashtag campaignHashtag) {
        campaignHashtags.add(campaignHashtag);
        campaignHashtag.setCampaign(this);
    }

    //생성 메서드
    @Builder
    public Campaign(String title, String startDate, String closingDate, String campThumbnail, Category category, String content, String campLink, Organization organization, CampaignHashtag... campaignHashtags) {
        this.title = title;
        this.startDate = startDate;
        this.closingDate = closingDate;
        this.campThumbnail = campThumbnail;
        this.category = category;
        this.content = content;
        this.campLink = campLink;
        this.organization = organization;
        for (CampaignHashtag campaignHashtag : campaignHashtags) {
            this.addCampaignHashtag(campaignHashtag);
        }
    }
}