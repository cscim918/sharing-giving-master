package curation.sharinggiving.repository;

import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    @Query("select c from Campaign c") // 메인페이지 - 캠페인 전체 조회
    List<Campaign> findAllCampaigns();

    @Query(value="select c from Campaign c join c.organization o where c.title LIKE %:title%") // 캠페인 검색
    List<Campaign> findByTitle(@Param("title") String title);

    @Query(value="select c from Campaign c join c.hashtag h where h.tagName LIKE %:tagName%") // 캠페인 해시태그 조회
    List<Campaign> findByHashtag(@Param("tagName") String tagName);
}
