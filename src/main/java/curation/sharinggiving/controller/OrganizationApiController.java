package curation.sharinggiving.controller;

import curation.sharinggiving.domain.Hashtag;
import curation.sharinggiving.repository.dto.OrgResponseDto;
import curation.sharinggiving.repository.dto.OrgSaveRequestDto;
import curation.sharinggiving.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrganizationApiController {

    private final OrganizationService organizationService;

    @CrossOrigin("*")
    @GetMapping("/api/v1/organizations") // 기부단체 전체 조회
    public List<OrgResponseDto> organizations() {
        return organizationService.findAllOrganizations();
    }

    @CrossOrigin("*")
    @GetMapping("/api/v1/organizations/{id}") // 기부단체 개별 조회
    public OrgResponseDto findById(@PathVariable Long id) {
        return organizationService.findById(id);
    }

    @CrossOrigin("*")
    @PostMapping("/api/v1/organizations") // 기부단체 등록
    public Long saveOrganization(@RequestPart(value = "orgSaveRequestDto") OrgSaveRequestDto orgSaveRequestDto,
                                 @RequestPart(value = "file") MultipartFile multipartFile,
                                 @RequestPart(value = "tags") Hashtag... tags) throws IOException {
        return organizationService.saveOrganization(orgSaveRequestDto, multipartFile, tags);
    }

    @CrossOrigin("*")
    @DeleteMapping("/api/v1/organizations/{id}") // 기부단체 삭제
    public boolean deleteOrganization(@PathVariable Long id) {
        return organizationService.deleteById(id);
    }

    @CrossOrigin("*")
    @PutMapping("/api/v1/organizations/{id}") // 기부단체 이미지 채우는 용
    public boolean updateOrganization(@PathVariable Long id, @RequestPart(value = "file") MultipartFile multipartFile)throws IOException{
        return organizationService.updateOrganizationImage(id, multipartFile);
    }

}
