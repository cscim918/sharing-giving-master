package curation.sharinggiving.repository;

import curation.sharinggiving.domain.Campaign;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    @Query("select c from Campaign c join c.organization")
    List<Campaign> findAllDesc();

    @Query(value="select c from Campaign c join c.organization o where c.title LIKE %:title%")
    List<Campaign> findByTitle(@Param("title") String keyword);

//    @Query(value = "select h from Hashtag h join Campaign h on c.hashtag = h.id where h.tagName = %:tagName%")
//    List<Campaign> findByTitle(String tagName);

//
//    public void save(Campaign campaign){ // 등록
//        em.persist(campaign);
//    }
//
//    public Campaign findOne(Long id){ // 조회
//        return em.find(Campaign.class, id);
//    }
//
//    public List<Campaign> findAll() { // 다수 조회
//        return em.createQuery("select c from Campaign c", Campaign.class) // jpql
//                .getResultList();
//    }
//
//    public List<Campaign> findByTitle(String title) { // 이름으로 검색해서 조회
//        return em.createQuery("select c from Campaign c join c.organization o where c.title LIKE %:title%", Campaign.class)
//                .setParameter("title", title)
//                .getResultList();
//    }
}
