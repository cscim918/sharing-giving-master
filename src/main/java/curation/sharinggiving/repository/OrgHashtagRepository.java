package curation.sharinggiving.repository;

import curation.sharinggiving.domain.OrganizationHashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrgHashtagRepository extends JpaRepository<OrganizationHashtag, Long> {

//    @Query(value = "select distinct(hashtag.hashtag_id), hashtag.created_date, hashtag.modified_date, hashtag.tag_name from hashtag join campaign_hashtag on campaign_hashtag.hashtag_id = hashtag.hashtag_id", nativeQuery = true) // 기부단체 해시태그 전체 조회
//    List<OrganizationHashtag> findAllOrgHashtags();

    //value = "select distinct(hashtag.hashtag_id), hashtag.created_date, hashtag.modified_date, hashtag.tag_name from hashtag join campaign_hashtag on campaign_hashtag.hashtag_id = hashtag.hashtag_id", nativeQuery = true

    @Query("select oh from OrganizationHashtag oh join oh.hashtag h where h.tagName = :tagName") // 기부단체 해시태그 검색
    List<OrganizationHashtag> findByOrgHashtag(@Param("tagName") String tagName);
}
