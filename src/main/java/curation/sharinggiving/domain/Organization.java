package curation.sharinggiving.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Organization extends BaseTimeEnitiy {

    @Id
    @GeneratedValue
    @Column(name = "organization_id")
    private Long id;

    private String name;

    @Column(length = 1000)
    private String orgThumbnail;

    @Column(length = 1000)
    private String description;

    @Column(length = 1000)
    private String orgLink;

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<Campaign> campaigns = new ArrayList<>();

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<OrganizationHashtag> organizationHashtags = new ArrayList<>();

    // 연관관계 메서드
    public void addOrganizationHashtag(OrganizationHashtag organizationHashtag) {
        organizationHashtags.add(organizationHashtag);
        organizationHashtag.setOrganization(this);
    }

    //생성 메서드
    @Builder
    public Organization(String name, String orgThumbnail, String description, String orgLink, OrganizationHashtag... organizationHashtags){
            this.name = name;
            this.orgThumbnail = orgThumbnail;
            this.description = description;
            this.orgLink = orgLink;
            for (OrganizationHashtag organizationHashtag : organizationHashtags) {
                this.addOrganizationHashtag(organizationHashtag);
            }
        }
    }
