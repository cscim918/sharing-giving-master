package curation.sharinggiving.repository;

import curation.sharinggiving.domain.CampaignHashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Set;

public interface CampHashtagRepository extends JpaRepository<CampaignHashtag, Long> {

    @Query("select ch from CampaignHashtag ch") // 캠페인 해시태그 전체 조회
    List<CampaignHashtag> findAllCampHashtags();

//    select distinct new CampaignHashtag(h.tagName) from CampaignHashtag ch join ch.hashtag h

    @Query("select ch from CampaignHashtag ch join ch.hashtag h where h.tagName = :tagName") // 캠페인 해시태그 검색
    List<CampaignHashtag> findByCampHashtag(@Param("tagName") String tagName);
}
