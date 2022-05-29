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
public class OrganizationHashtag {

    @Id
    @GeneratedValue
    @Column(name = "organization_hashtag_id")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "organization_id")
    private Organization organization;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "hashtag_id")
    private Hashtag hashtag;

    // 생성 메서드
    public static OrganizationHashtag createOrganizationHashtag(Hashtag hashtag){
        OrganizationHashtag organizationHashtag = new OrganizationHashtag();
        organizationHashtag.setHashtag(hashtag);
        return organizationHashtag;
    }
}
