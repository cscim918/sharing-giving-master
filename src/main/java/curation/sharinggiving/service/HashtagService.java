package curation.sharinggiving.service;

import curation.sharinggiving.repository.CampHashtagRepository;
import curation.sharinggiving.repository.HashtagRepository;
import curation.sharinggiving.repository.OrgHashtagRepository;
import curation.sharinggiving.repository.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class HashtagService {

    private final OrgHashtagRepository orgHashtagRepository;
    private final CampHashtagRepository campHashtagRepository;
    private final HashtagRepository hashtagRepository;

    @Transactional(readOnly = true)
    public List<CampHashtagResponseDto> findAllCampHashtags() { // 캠페인 해시태그 전체 조회
        return campHashtagRepository.findAllCampHashtags().stream()
                .map(CampHashtagResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<OrgHashtagResponseDto> findAllOrgHashtags() { // 기부단체 해시태그 전체 조회
        return orgHashtagRepository.findAllOrgHashtags()
                .stream()
                .map(OrgHashtagResponseDto::new)
                .collect(Collectors.toList());
    }

    // 캠페인/기부단체 해시태그 검색
    @Transactional(readOnly = true)
    public List<CampHashtagSearchResponseDto> findByCampHashtag(String hashtag) { // 캠페인 해시태그 검색
        return campHashtagRepository.findByCampHashtag(hashtag)
                .stream()
                .map(CampHashtagSearchResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<OrgHashtagSearchResponseDto> findByOrgHashtag(String hashtag) { // 기부단체 해시태그 검색
        return orgHashtagRepository.findByOrgHashtag(hashtag)
                .stream()
                .map(OrgHashtagSearchResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<HashtagResponseDto> findAllHashtags() { // 해시태그 전체 조회
        return hashtagRepository.findAllHashtags().stream()
                .map(HashtagResponseDto::new)
                .collect(Collectors.toList());
    }
}
