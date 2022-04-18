package curation.sharinggiving.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@Entity
public class Organization extends BaseTimeEnitiy{

    @Id @GeneratedValue
    @Column(name = "org_id")
    private Long id;

    private String name;

    private String orgThumbnail;

    private String description;

    private String link;

    @JsonIgnore
    @OneToMany(mappedBy = "organization")
    private List<Campaign> campaigns = new ArrayList<>();

    //생성 메서드
    @Builder
    public Organization(String name, String orgThumbnail, String description, String link){
        this.name = name;
        this.orgThumbnail = orgThumbnail;
        this.description = description;
        this.link = link;
    }
}
