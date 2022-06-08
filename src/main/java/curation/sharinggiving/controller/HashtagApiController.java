package curation.sharinggiving.controller;

import curation.sharinggiving.repository.dto.*;
import curation.sharinggiving.service.HashtagService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HashtagApiController {
    private final HashtagService hashtagService;

    @GetMapping("/api/v1/hashtags/campaign") // 캠페인 해시태그 전체 조회
    public List<HashtagResponseDto> findAllCampHashtags(){
        List<HashtagResponseDto> all = hashtagService.findAllCampHashtags();
        return all;
    }

    @GetMapping("/api/v1/hashtags/organization") // 기부단체 해시태그 전체 조회
    public List<HashtagResponseDto> findAllOrgHashtags(){
        List<HashtagResponseDto> all = hashtagService.findAllOrgHashtags();
        return all;
    }

    @GetMapping("/api/v1/hashtags") // 전체 해시태그 조회
    public List<HashtagResponseDto> findAllHashtags() {
        List<HashtagResponseDto> all = hashtagService.findAllHashtags();
        return all;
    }

    @GetMapping("/api/v1/hashtag") // 캠페인, 기부단체 해시태그 검색
    public Result findByHashtag(@RequestParam(value = "tag") String tag) {
        List<CampHashtagSearchResponseDto> campHashtag = hashtagService.findByCampHashtag(tag);
        List<OrgHashtagSearchResponseDto> orgHashtag = hashtagService.findByOrgHashtag(tag);
        return new Result(campHashtag, orgHashtag);
    }

    @PostMapping("/api/v1/hashtag") // 해시태그 생성
    public Long saveHashtag(@RequestParam(value = "tag") String tag){
        return hashtagService.saveHashtag(tag);
    }

    @Data
    @AllArgsConstructor
    static class Result<T> {
        private T campaign;
        private T organization;
    }
}
