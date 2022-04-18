package curation.sharinggiving.repository;

import curation.sharinggiving.domain.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    @Query("select c from Campaign c")
    List<Campaign> findAllDesc();

    @Query(value="select c from Campaign c join c.organization o where c.title LIKE %:title%")
    List<Campaign> findByTitle(@Param("title") String title);

    @Query(value="select c from Campaign c join c.hashtag h where h.tagName LIKE %:tagName%")
    List<Campaign> findByHashtag(@Param("tagName") String tagName);
}
