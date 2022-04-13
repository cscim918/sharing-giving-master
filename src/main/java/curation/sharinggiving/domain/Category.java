package curation.sharinggiving.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Category {
    SHARING("나누기"),
    GIVING("곱하기");

    private final String value;
}
