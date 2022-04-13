package curation.sharinggiving.repository;

import curation.sharinggiving.domain.Organization;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class OrganizationRepository {

    private final EntityManager em;

    public void save(Organization organization) { // 등록
        em.persist(organization);
    }

    public Organization findOne(Long id) { // 조회
        return em.find(Organization.class, id);
    }

    public List<Organization> findAll() { // 다수 조회
        return em.createQuery("select o from Organization o", Organization.class)
                .getResultList();
    }

    public List<Organization> findByName(String name) {// 이름으로 검색 조회
        return em.createQuery("select o from Organization o where o.name = :name", Organization.class)
                .setParameter("name", name)
                .getResultList();
    }
}
