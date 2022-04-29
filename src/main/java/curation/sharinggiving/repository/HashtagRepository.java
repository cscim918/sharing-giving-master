package curation.sharinggiving.repository;

import curation.sharinggiving.domain.Hashtag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface HashtagRepository extends JpaRepository<Hashtag, Long> {

    @Query("select h from Hashtag h")// 해시태그 전체 조회
    List<Hashtag> findAllHashtags();

}
