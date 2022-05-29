package curation.sharinggiving.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;

@Getter @Setter
@NoArgsConstructor
@Entity
public class Hashtag extends BaseTimeEnitiy {

    @Id @GeneratedValue
    @Column(name = "hashtag_id")
    private Long id;

    private String tagName;

    //생성 메서드
    @Builder
    public Hashtag(String tagName) {
        this.tagName = tagName;
    }
}
