package curation.sharinggiving.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Organization {

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
}
