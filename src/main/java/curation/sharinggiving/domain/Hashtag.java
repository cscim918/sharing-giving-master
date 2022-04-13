package curation.sharinggiving.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.EAGER;

@Entity
@Getter @Setter
public class Hashtag extends BaseTimeEnitiy{

    @Id @GeneratedValue
    @Column(name = "tag_id")
    private Long id;

    private String tagName;

    @JsonIgnore
    @OneToOne(mappedBy = "hashtag", fetch = EAGER)
    private Campaign campaign;
}
