package curation.sharinggiving.repository;

import curation.sharinggiving.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

    @Query("select o from Organization o") // 기부단체 전체 조회
    List<Organization> findAllOrganizations();

    @Query(value="select o from Organization o where o.name LIKE %:name% OR o.description LIKE %:description%") // 기부단체 검색
    List<Organization> searchOrganization(@Param("name") String name, @Param("description") String description);
}
