package curation.sharinggiving.service;

import curation.sharinggiving.domain.*;
import curation.sharinggiving.repository.OrgHashtagRepository;
import curation.sharinggiving.repository.dto.OrgResponseDto;
import curation.sharinggiving.repository.OrganizationRepository;
import curation.sharinggiving.repository.dto.OrgSaveRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class OrganizationService {

    private final OrganizationRepository organizationRepository;
    private final OrgHashtagRepository orgHashtagRepository;
    private final S3Uploader s3Uploader;

    @Transactional(readOnly = true)
    public List<OrgResponseDto> findAllOrganizations() { // 기부단체 전체 조회
        return organizationRepository.findAllOrganizations().stream()
                .map(OrgResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public OrgResponseDto findById(Long id){ // 기부단체 개별 조회
        Organization entity = organizationRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 기부 단체가 없습니다. id=" + id));
        return new OrgResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<OrgResponseDto> searchOrganization(String keyword) { // 기부단체 검색
        return organizationRepository.searchOrganization(keyword,keyword)
                .stream()
                .map(OrgResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public Long saveOrganization(OrgSaveRequestDto orgSaveRequestDto, MultipartFile multipartFile, Hashtag... tags) throws IOException {
        Organization organization = new Organization();
        organization.setName(orgSaveRequestDto.getName());
        organization.setDescription(orgSaveRequestDto.getDescription());
        organization.setOrgThumbnail(s3Uploader.upload(multipartFile, "organization"));
        organization.setOrgLink(orgSaveRequestDto.getOrgLink());
        organizationRepository.save(organization);
        for (Hashtag tag : tags) {
            OrganizationHashtag organizationHashtag = new OrganizationHashtag();
            organizationHashtag.setOrganization(organization);
            organizationHashtag.setHashtag(tag);
            orgHashtagRepository.save(organizationHashtag);
        }
        return organization.getId();
    }

    @Transactional
    public boolean deleteById(long id) {
        Optional<Organization> organization = organizationRepository.findById(id);
        if (organization.isPresent()){
            this.organizationRepository.deleteById(organization.get().getId());
            s3Uploader.deleteFile(organization.get().getOrgThumbnail());
            return true;
        }
        return false;
    }

    @Transactional
    public boolean updateOrganizationImage(Long id, MultipartFile multipartFile) throws IOException {
        Organization organization = organizationRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 캠페인이 없습니다. id =" + id));
        organization.setOrgThumbnail(s3Uploader.upload(multipartFile, "organization"));
        return true;
    }
}
