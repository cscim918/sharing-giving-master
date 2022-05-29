package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.Hashtag;
import lombok.Getter;

@Getter
public class HashtagResponseDto {
    private Long id;
    private String tagName;

    public HashtagResponseDto(Hashtag hashtag){
        this.id = hashtag.getId();
        this.tagName = hashtag.getTagName();
    }
}