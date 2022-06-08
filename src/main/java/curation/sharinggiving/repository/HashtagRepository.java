package curation.sharinggiving.repository;

import curation.sharinggiving.domain.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface HashtagRepository extends JpaRepository<Hashtag, Long> {

    @Query("select h from Hashtag h")// 해시태그 전체 조회
    List<Hashtag> findAllHashtags();

    @Query(value = "select distinct(hashtag.hashtag_id), hashtag.created_date, hashtag.modified_date, hashtag.tag_name from hashtag join campaign_hashtag on campaign_hashtag.hashtag_id = hashtag.hashtag_id", nativeQuery = true) // 캠페인 해시태그 전체 조회
    List<Hashtag> findAllCampHashtags();

    @Query(value = "select distinct(hashtag.hashtag_id), hashtag.created_date, hashtag.modified_date, hashtag.tag_name from hashtag join organization_hashtag on organization_hashtag.hashtag_id = hashtag.hashtag_id", nativeQuery = true) // 기부단체 해시태그 전체 조회
    List<Hashtag> findAllOrgHashtags();
}
