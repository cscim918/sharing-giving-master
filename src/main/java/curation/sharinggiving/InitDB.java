package curation.sharinggiving;

import curation.sharinggiving.domain.Campaign;
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
    }

    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService {

        private final EntityManager em;

        public void dbInit1() {
            Organization organization = new Organization("Save the Children", "zxczxcxzczc", "sadads", "wqewqdasdada");
            em.persist(organization);

            Hashtag hashtag = new Hashtag("교육 후원");
            em.persist(hashtag);

            Campaign campaign = new Campaign("campaign1", "dsdasdsa", "Sharing", "2016-02-23", "2016-03-23", "hi", organization, hashtag);
            em.persist(campaign);
        }
    }
}
