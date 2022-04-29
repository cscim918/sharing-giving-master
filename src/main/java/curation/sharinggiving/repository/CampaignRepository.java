package curation.sharinggiving.repository;

import curation.sharinggiving.domain.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    @Query("select c from Campaign c") // 메인페이지 - 캠페인 전체 조회
    List<Campaign> findAllCampaigns();

    @Query(value="select c from Campaign c where c.title LIKE %:title% OR c.content LIKE %:content%") // 캠페인 검색
    List<Campaign> searchCampaign(@Param("title") String title, @Param("content") String content);
}
