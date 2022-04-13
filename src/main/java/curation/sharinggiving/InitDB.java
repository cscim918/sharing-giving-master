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
            Organization organization = createOrganization("Save the Children", "zxczxcxzczc", "sadads", "wqewqdasdada");
            em.persist(organization);

            Hashtag hashtag = createHashtag("교육 후원");
            em.persist(hashtag);

            Campaign campaign = Campaign.createCampaign("campaign1", "dsdasdsa", "Sharing", "2016-02-23", "2016-03-23", "hi", organization, hashtag);
            em.persist(campaign);
        }

//        private Campaign createCampaign(String title, String startDate, String closingDate, String campThumbnail, Category category, String description) {
//            Campaign campaign = new Campaign();
//            campaign.setTitle(title);
//            campaign.setStartDate(startDate);
//            campaign.setClosingDate(closingDate);
//            campaign.setCampThumbnail(campThumbnail);
//            campaign.setCategory(category);
//            campaign.setDescription(description);
//            return campaign;
//        }

        private Organization createOrganization(String name, String orgThumbnail, String description, String link) {
            Organization organization = new Organization();
            organization.setName(name);
            organization.setOrgThumbnail(orgThumbnail);
            organization.setDescription(description);
            organization.setLink(link);
            return organization;
        }

        private Hashtag createHashtag(String tagName) {
            Hashtag hashtag = new Hashtag();
            hashtag.setTagName(tagName);
            return hashtag;
        }
    }
}
