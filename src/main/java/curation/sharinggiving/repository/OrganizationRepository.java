package curation.sharinggiving.repository;

import curation.sharinggiving.domain.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
import java.util.Optional;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {

//    Optional<Organization> findByOrganizationName(String name);

    @Query("select o from Organization o") // 기부 단체 전체 조회
    List<Organization> findAllOrganizations();
}
