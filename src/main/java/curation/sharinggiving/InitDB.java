package curation.sharinggiving;

import curation.sharinggiving.domain.Campaign;
import curation.sharinggiving.domain.Category;
import curation.sharinggiving.domain.Hashtag;
import curation.sharinggiving.domain.Organization;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;

@Component
@RequiredArgsConstructor
public class InitDB {

    private final InitService initService;

    @PostConstruct
    public void init() {
        initService.dbInit1();
        initService.dbInit2();
        initService.dbInit3();
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;

        public void dbInit1() {
            Organization organization = new Organization("세이브 더 칠드런", "zxczxcxzczc", "sadads", "wqewqdasdada");
            em.persist(organization);

            Hashtag hashtag = new Hashtag("아동 지원");
            em.persist(hashtag);

            Campaign campaign = new Campaign("국내 저소득가정 아동 지원", "dsdasdsa", "Sharing", "2016-02-23", Category.SHARING, "hi", organization, hashtag);
            em.persist(campaign);
        }

        public void dbInit2() {
            Organization organization = new Organization("푸르메재단", "zxczxcxzczc", "sadads", "wqewqdasdada");
            em.persist(organization);

            Hashtag hashtag = new Hashtag("재해 지원");
            em.persist(hashtag);

            Campaign campaign = new Campaign("우크라이나 긴급구호", "dsdasdsa", "Sharing", "2016-02-23", Category.SHARING, "bye", organization, hashtag);
            em.persist(campaign);
        }

        public void dbInit3() {
            Organization organization = new Organization("적십자", "zxczxcxzczc", "sadads", "wqewqdasdada");
            em.persist(organization);

            Hashtag hashtag = new Hashtag("긴급 구호");
            em.persist(hashtag);

            Campaign campaign = new Campaign("랜선긴급구호", "dsdasdsa", "Sharing", "2016-02-23", Category.GIVING, "bye", organization, hashtag);
            em.persist(campaign);
        }
    }
}
