package curation.sharinggiving.repository;

import curation.sharinggiving.domain.OrganizationHashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrgHashtagRepository extends JpaRepository<OrganizationHashtag, Long> {

    @Query("select oh from OrganizationHashtag oh") // 기부단체 해시태그 전체 조회
    List<OrganizationHashtag> findAllOrgHashtags();

    @Query("select oh from OrganizationHashtag oh join oh.hashtag h where h.tagName = :tagName") // 기부단체 해시태그 검색
    List<OrganizationHashtag> findByOrgHashtag(@Param("tagName") String tagName);
}
