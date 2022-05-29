package curation.sharinggiving.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
@NoArgsConstructor
public class CampaignHashtag {

    @Id
    @GeneratedValue
    @Column(name = "campaign_hashtag_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "campaign_id")
    private Campaign campaign;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "hashtag_id")
    private Hashtag hashtag;

    // 생성 메서드
    public static CampaignHashtag createCampaignHashtag(Hashtag hashtag){
        CampaignHashtag campaignHashtag = new CampaignHashtag();
        campaignHashtag.setHashtag(hashtag);
        return campaignHashtag;
    }
}
