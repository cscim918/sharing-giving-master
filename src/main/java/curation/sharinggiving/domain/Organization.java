package curation.sharinggiving.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@NoArgsConstructor
@Entity
public class Organization extends BaseTimeEnitiy{

    @Id @GeneratedValue
    @Column(name = "org_id")
    private Long id;

    private String name;

    private String orgThumbnail;

    private String description;

    private String orgLink;

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<Campaign> campaigns = new ArrayList<>();

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<OrgHashtag> orgHashtags = new ArrayList<>();

    // 연관관계 메서드
    public void addOrgHashtag(OrgHashtag orgHashtag){
        orgHashtags.add(orgHashtag);
        orgHashtag.setOrganization(this);
    }

    //생성 메서드
    @Builder
    public Organization(String name, String orgThumbnail, String description, String orgLink, OrgHashtag... orgHashtags){
        this.name = name;
        this.orgThumbnail = orgThumbnail;
        this.description = description;
        this.orgLink = orgLink;
        for (OrgHashtag orgHashtag : orgHashtags) {
            this.addOrgHashtag(orgHashtag);
        }
    }
}
