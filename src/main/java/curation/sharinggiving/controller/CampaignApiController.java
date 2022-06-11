package curation.sharinggiving.controller;

import curation.sharinggiving.domain.Hashtag;
import curation.sharinggiving.repository.dto.CampResponseDto;
import curation.sharinggiving.repository.dto.CampSaveRequestDto;
import curation.sharinggiving.service.CampaignService;
import curation.sharinggiving.service.S3Uploader;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CampaignApiController {

    private final CampaignService campaignService;
    private final S3Uploader s3Uploader;

    @CrossOrigin("*")
    @GetMapping("/api/v1/campaigns") // 캠페인 전체 조회
    public List<CampResponseDto> findAllCampaigns() {
        return campaignService.findAllCampaigns();
    }

    @CrossOrigin("*")
    @GetMapping("/api/v1/campaigns/{id}") // 캠페인 개별 조회
    public CampResponseDto findById(@PathVariable Long id) {
        return campaignService.findById(id);
    }

    @CrossOrigin("*")
    @PostMapping("/api/v1/campaigns") // 캠페인 등록
    public Long saveCampaign(@RequestPart(value = "campSaveRequestDto") CampSaveRequestDto campSaveRequestDto,
                             @RequestPart(value = "file") MultipartFile multipartFile,
                             @RequestPart(value = "tags") Hashtag... tags) throws IOException {
        return campaignService.saveCampaign(campSaveRequestDto, multipartFile, tags);
    }

    @CrossOrigin("*")
    @DeleteMapping("/api/v1/campaigns/{id}") // 캠페인 삭제
    public boolean deleteCampaign(@PathVariable Long id) {
        return campaignService.deleteById(id);
    }

    @CrossOrigin("*")
    @PutMapping("/api/v1/campaigns/{id}") // 캠페인 이미지 채우는 용
    public boolean updateCampaign(@PathVariable Long id, @RequestPart(value = "file") MultipartFile multipartFile)throws IOException{
        return campaignService.updateCampaignImage(id, multipartFile);
    }

}