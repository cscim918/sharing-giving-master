package curation.sharinggiving.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;

@Getter
@Entity
@NoArgsConstructor
public class Hashtag extends BaseTimeEnitiy{

    @Id @GeneratedValue
    @Column(name = "tag_id")
    private Long id;

    private String tagName;

    @JsonIgnore
    @OneToOne(mappedBy = "hashtag", fetch = EAGER)
    private Campaign campaign;

    //생성 메서드
    @Builder
    public Hashtag(String tagName) {
        this.tagName = tagName;
    }
}
