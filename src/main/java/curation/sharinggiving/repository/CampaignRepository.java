package curation.sharinggiving.repository;

import curation.sharinggiving.domain.Campaign;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
//@RequiredArgsConstructor
public interface CampaignRepository extends JpaRepository<Campaign, Long> {

    @Query("SELECT c FROM Campaign c ORDER BY c.id DESC")
    List<Campaign> findAllDesc();

//    private final EntityManager em;
//
//    @Query("select c from Campaign c join c.organization o")
//    List<Campaign> findAllDesc();
//
//    @Query(value="select c from Campaign c join c.organization o where c.title LIKE %:title%")
//    List<Campaign> findAllSearchContaining(String keyword);
//
    List<Campaign> findByTitleContaining(String keyword);
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

//    public List<Campaign> findAllByString(Search search){
//
//        String jpql = "select c from Campaign c join c.organization o";
//        boolean isFirstCondition = true;
//
//        // 캠페인 이름 검색
//        if (StringUtils.hasText(search.getCampName())){
//            if (isFirstCondition) {
//                jpql += " where";
//                isFirstCondition = false;
//            } else {
//                jpql += " and";
//            }
//            jpql += " c.title like :title";
//        }
//
//        // 기부단체 이름 검색
//        if (StringUtils.hasText(search.getOrgName())){
//            if (isFirstCondition) {
//                jpql += " where";
//                isFirstCondition = false;
//            } else {
//                jpql += " and";
//            }
//            jpql += " o.name like :name";
//        }
//
//        TypedQuery<Campaign> query = em.createQuery(jpql, Campaign.class)
//                .setMaxResults(1000);
//
//        if (StringUtils.hasText(search.getCampName())) {
//            query = query.setParameter("title", search.getCampName());
//        }
//
//        if (StringUtils.hasText(search.getOrgName())) {
//            query = query.setParameter("name", search.getOrgName());
//        }
//
//        return query.getResultList();
//    }
}
