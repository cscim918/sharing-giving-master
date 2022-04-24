package curation.sharinggiving.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.EAGER;

@Getter
@NoArgsConstructor
@Entity
public class Hashtag extends BaseTimeEnitiy {

    @Id @GeneratedValue
    @Column(name = "tag_id")
    private Long id;

    private String tagName;

    @JsonIgnore
    @OneToMany(mappedBy = "hashtag")
    private List<Campaign> campaigns = new ArrayList<>();

    //생성 메서드
    @Builder
    public Hashtag(String tagName) {
        this.tagName = tagName;
    }
}
