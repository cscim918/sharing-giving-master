package curation.sharinggiving.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;

@Getter @Setter
@NoArgsConstructor
@Entity
public class CampHashtag extends BaseTimeEnitiy {

    @Id @GeneratedValue
    @Column(name = "tag_id")
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = EAGER)
    @JoinColumn(name = "camp_id")
    private Campaign campaign;

    private String tagName;

    //생성 메서드
    @Builder
    public CampHashtag(String tagName) {
        this.tagName = tagName;
    }
}
