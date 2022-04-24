package curation.sharinggiving.domain;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;

@Getter @Setter
@NoArgsConstructor
@Entity
public class Campaign extends BaseTimeEnitiy {
    @Id @GeneratedValue // GeneratedValue 세팅 시 id 값이 항상 생성 보장
    @Column(name = "camp_id")
    private Long id;

    private String title;

    private String startDate;

    private String closingDate;

    private String campThumbnail;

    private Category category;

    private String content;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name="org_id")
    private Organization organization;

    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "tag_id")
    private Hashtag hashtag;

    //연관관계 & 생성 메서드
    @Builder
    public Campaign(String title, String startDate, String closingDate, String campThumbnail, Category category, String content, Organization organization, Hashtag hashtag) {
        this.title = title;
        this.startDate = startDate;
        this.closingDate = closingDate;
        this.campThumbnail = campThumbnail;
        this.category = category;
        this.content = content;
        this.organization = organization;
        this.hashtag = hashtag;
    }
}
