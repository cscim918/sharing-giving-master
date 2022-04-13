package curation.sharinggiving.service;

import curation.sharinggiving.domain.Organization;
import curation.sharinggiving.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    // 기부 단체 등록
    @Transactional
    public Long join(Organization organization){
        organizationRepository.save(organization);
        return organization.getId();
    }

    // 기부 단체 전체 조회
    public List<Organization> findOrganizations() {
        return organizationRepository.findAll();
    }

    // 기부 단체 개별 조회
    public Organization findOne(Long organizationId){
        return organizationRepository.findOne(organizationId);
    }
}
