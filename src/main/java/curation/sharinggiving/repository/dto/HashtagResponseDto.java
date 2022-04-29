package curation.sharinggiving.repository.dto;

import curation.sharinggiving.domain.Hashtag;
import lombok.Getter;

@Getter
public class HashtagResponseDto {
    private String tagName;

    public HashtagResponseDto(Hashtag hashtag){
        this.tagName = hashtag.getTagName();
    }
}