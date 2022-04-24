package curation.sharinggiving.service;

import curation.sharinggiving.controller.dto.OrganizationResponseDto;
import curation.sharinggiving.domain.Organization;
import curation.sharinggiving.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrganizationService {

    private final OrganizationRepository organizationRepository;

    @Transactional // 기부 단체 등록
    public Long join(Organization organization){
        organizationRepository.save(organization);
        return organization.getId();
    }

    @Transactional(readOnly = true)
    public List<OrganizationResponseDto> findAllOrganizations() { // 기부단체 전체 조회
        return organizationRepository.findAllOrganizations().stream()
                .map(OrganizationResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public OrganizationResponseDto findById(Long id){ // 기부단체 개별 조회
        Organization entity = organizationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 기부 단체가 없습니다. id=" + id));
        return new OrganizationResponseDto(entity);
    }
}
