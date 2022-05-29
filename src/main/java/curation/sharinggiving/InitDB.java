//package curation.sharinggiving;
//
//import curation.sharinggiving.domain.*;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.annotation.PostConstruct;
//import javax.persistence.EntityManager;
//
//@Component
//@RequiredArgsConstructor
//public class InitDB {
//
//    private final InitService initService;
//
//    @PostConstruct
//    public void init() {
//        initService.dbInit();
//    }
//
//    @Component
//    @Transactional
//    @RequiredArgsConstructor
//    static class InitService {
//
//        private final EntityManager em;
//
//        public void dbInit() {
//            // 해시태그
//            Hashtag hashtag1 = new Hashtag("아동");
//            em.persist(hashtag1);
//
//            Hashtag hashtag2 = new Hashtag("빈곤");
//            em.persist(hashtag2);
//
//            Hashtag hashtag3 = new Hashtag("의료");
//            em.persist(hashtag3);
//
//            Hashtag hashtag4 = new Hashtag("긴급구호");
//            em.persist(hashtag4);
//
//            Hashtag hashtag5 = new Hashtag("대북지원");
//            em.persist(hashtag5);
//
//            Hashtag hashtag6 = new Hashtag("식수");
//            em.persist(hashtag6);
//
//            Hashtag hashtag7 = new Hashtag("보건");
//            em.persist(hashtag7);
//
//            Hashtag hashtag8 = new Hashtag("기독교");
//            em.persist(hashtag8);
//
//            Hashtag hashtag9 = new Hashtag("해외후원");
//            em.persist(hashtag9);
//
//            Hashtag hashtag10 = new Hashtag("국내후원");
//            em.persist(hashtag10);
//
//            Hashtag hashtag11 = new Hashtag("교육");
//            em.persist(hashtag11);
//
//            Hashtag hashtag12 = new Hashtag("난민");
//            em.persist(hashtag12);
//
//            Hashtag hashtag13 = new Hashtag("양육");
//            em.persist(hashtag13);
//
//            Hashtag hashtag14 = new Hashtag("주거환경");
//            em.persist(hashtag14);
//
//            Hashtag hashtag15 = new Hashtag("봉사");
//            em.persist(hashtag15);
//
//            Hashtag hashtag16 = new Hashtag("저소득층");
//            em.persist(hashtag16);
//
//            Hashtag hashtag17 = new Hashtag("노인");
//            em.persist(hashtag17);
//
//            Hashtag hashtag18 = new Hashtag("마라톤");
//            em.persist(hashtag18);
//
//            Hashtag hashtag19 = new Hashtag("구호활동");
//            em.persist(hashtag19);
//
//            Hashtag hashtag20 = new Hashtag("1:1결연");
//            em.persist(hashtag20);
//
//            Hashtag hashtag21 = new Hashtag("정기후원");
//            em.persist(hashtag21);
//
//            Hashtag hashtag22 = new Hashtag("환경");
//            em.persist(hashtag22);
//
//            Hashtag hashtag23 = new Hashtag("선물");
//            em.persist(hashtag23);
//
//            Hashtag hashtag24 = new Hashtag("일시후원");
//            em.persist(hashtag24);
//
//            Hashtag hashtag25 = new Hashtag("난민");
//            em.persist(hashtag25);
//
//            Hashtag hashtag26 = new Hashtag("사이클링");
//            em.persist(hashtag26);
//
//            Hashtag hashtag27 = new Hashtag("독립유공자");
//            em.persist(hashtag27);
//
//            Hashtag hashtag28 = new Hashtag("굿즈몰");
//            em.persist(hashtag28);
//
//            Hashtag hashtag29 = new Hashtag("아동권리");
//            em.persist(hashtag29);
//
//            Hashtag hashtag30 = new Hashtag("기후위기");
//            em.persist(hashtag30);
//
//            Hashtag hashtag31 = new Hashtag("위기가정");
//            em.persist(hashtag31);
//
//            Hashtag hashtag32 = new Hashtag("장애");
//            em.persist(hashtag32);
//
//            Hashtag hashtag33 = new Hashtag("지구촌");
//            em.persist(hashtag33);
//
//            Hashtag hashtag34 = new Hashtag("식수");
//            em.persist(hashtag34);
//
//            Hashtag hashtag35 = new Hashtag("구호물품");
//            em.persist(hashtag35);
//
//            Hashtag hashtag36 = new Hashtag("행사");
//            em.persist(hashtag36);
//
//            Hashtag hashtag37 = new Hashtag("합창단");
//            em.persist(hashtag37);
//
//            Hashtag hashtag38 = new Hashtag("공연");
//            em.persist(hashtag38);
//
//            Hashtag hashtag39 = new Hashtag("소녀");
//            em.persist(hashtag39);
//
//            Hashtag hashtag40 = new Hashtag("권리");
//            em.persist(hashtag40);
//
//            Hashtag hashtag41 = new Hashtag("참여활동");
//            em.persist(hashtag41);
//
//            Hashtag hashtag42 = new Hashtag("결식아동");
//            em.persist(hashtag42);
//
//            Hashtag hashtag43 = new Hashtag("일사후원");
//            em.persist(hashtag43);
//
//            Hashtag hashtag44 = new Hashtag("자원봉사");
//            em.persist(hashtag44);
//
//            Hashtag hashtag45 = new Hashtag("밴드");
//            em.persist(hashtag45);
//
//            Hashtag hashtag46 = new Hashtag("재능기부");
//            em.persist(hashtag46);
//
//            Hashtag hashtag47 = new Hashtag("번역");
//            em.persist(hashtag47);
//
//            Hashtag hashtag48 = new Hashtag("비전트립");
//            em.persist(hashtag48);
//
//            Hashtag hashtag49 = new Hashtag("현장방문");
//            em.persist(hashtag49);
//
//            Hashtag hashtag50 = new Hashtag("집짓기");
//            em.persist(hashtag50);
//
//            Hashtag hashtag51 = new Hashtag("지지서명");
//            em.persist(hashtag51);
//
//            Hashtag hashtag52 = new Hashtag("기념일후원");
//            em.persist(hashtag52);
//
//            Hashtag hashtag53 = new Hashtag("고독");
//            em.persist(hashtag53);
//
//            Hashtag hashtag54 = new Hashtag("질병");
//            em.persist(hashtag54);
//
//            Hashtag hashtag55 = new Hashtag("소외");
//            em.persist(hashtag55);
//
//            Hashtag hashtag56 = new Hashtag("차별");
//            em.persist(hashtag56);
//
//            Hashtag hashtag57 = new Hashtag("복지");
//            em.persist(hashtag57);
//
//            Hashtag hashtag58 = new Hashtag("지구보건");
//            em.persist(hashtag58);
//
//            Hashtag hashtag59 = new Hashtag("하이킹");
//            em.persist(hashtag59);
//
//            OrganizationHashtag orgHashtag1 = OrganizationHashtag.createOrganizationHashtag(hashtag1);
//            OrganizationHashtag orgHashtag2 = OrganizationHashtag.createOrganizationHashtag(hashtag2);
//
//            OrganizationHashtag orgHashtag3 = OrganizationHashtag.createOrganizationHashtag(hashtag3);
//            OrganizationHashtag orgHashtag4 = OrganizationHashtag.createOrganizationHashtag(hashtag4);
//
//            OrganizationHashtag orgHashtag5 = OrganizationHashtag.createOrganizationHashtag(hashtag29);
//            OrganizationHashtag orgHashtag6 = OrganizationHashtag.createOrganizationHashtag(hashtag4);
//            OrganizationHashtag orgHashtag7 = OrganizationHashtag.createOrganizationHashtag(hashtag5);
//            OrganizationHashtag orgHashtag8 = OrganizationHashtag.createOrganizationHashtag(hashtag6);
//            OrganizationHashtag orgHashtag9 = OrganizationHashtag.createOrganizationHashtag(hashtag7);
//            OrganizationHashtag orgHashtag10 = OrganizationHashtag.createOrganizationHashtag(hashtag3);
//
//            OrganizationHashtag orgHashtag11 = OrganizationHashtag.createOrganizationHashtag(hashtag8);
//            OrganizationHashtag orgHashtag12 = OrganizationHashtag.createOrganizationHashtag(hashtag1);
//            OrganizationHashtag orgHashtag13 = OrganizationHashtag.createOrganizationHashtag(hashtag9);
//            OrganizationHashtag orgHashtag14 = OrganizationHashtag.createOrganizationHashtag(hashtag4);
//
//            OrganizationHashtag orgHashtag15 = OrganizationHashtag.createOrganizationHashtag(hashtag1);
//            OrganizationHashtag orgHashtag16 = OrganizationHashtag.createOrganizationHashtag(hashtag10);
//            OrganizationHashtag orgHashtag17 = OrganizationHashtag.createOrganizationHashtag(hashtag2);
//            OrganizationHashtag orgHashtag18 = OrganizationHashtag.createOrganizationHashtag(hashtag11);
//
//            OrganizationHashtag orgHashtag19 = OrganizationHashtag.createOrganizationHashtag(hashtag12);
//            OrganizationHashtag orgHashtag20 = OrganizationHashtag.createOrganizationHashtag(hashtag1);
//            OrganizationHashtag orgHashtag21 = OrganizationHashtag.createOrganizationHashtag(hashtag9);
//
//            OrganizationHashtag orgHashtag22 = OrganizationHashtag.createOrganizationHashtag(hashtag12);
//            OrganizationHashtag orgHashtag23 = OrganizationHashtag.createOrganizationHashtag(hashtag2);
//
//            OrganizationHashtag orgHashtag24 = OrganizationHashtag.createOrganizationHashtag(hashtag1);
//            OrganizationHashtag orgHashtag25 = OrganizationHashtag.createOrganizationHashtag(hashtag2);
//            OrganizationHashtag orgHashtag26 = OrganizationHashtag.createOrganizationHashtag(hashtag13);
//            OrganizationHashtag orgHashtag27 = OrganizationHashtag.createOrganizationHashtag(hashtag8);
//
//            OrganizationHashtag orgHashtag28 = OrganizationHashtag.createOrganizationHashtag(hashtag14);
//            OrganizationHashtag orgHashtag29 = OrganizationHashtag.createOrganizationHashtag(hashtag10);
//            OrganizationHashtag orgHashtag30 = OrganizationHashtag.createOrganizationHashtag(hashtag9);
//            OrganizationHashtag orgHashtag31 = OrganizationHashtag.createOrganizationHashtag(hashtag15);
//
//            OrganizationHashtag orgHashtag32 = OrganizationHashtag.createOrganizationHashtag(hashtag16);
//            OrganizationHashtag orgHashtag33 = OrganizationHashtag.createOrganizationHashtag(hashtag17);
//
//            // 기부단체
//            Organization organization1 = new Organization("세이브 더 칠드런", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , "세계의 미래는 아이들에게 달려 있습니다.\n" +
//                    "세이브더칠드런 창립자 에글렌타인 젭의 말입니다.\n" +
//                    "우리의 미래인 아이들이 더 나은 세상에서 살 수 있게 해주는 것,\n" +
//                    "세이브더칠드런이 지난 한 세기 동안 해온 일입니다.\n", "https://www.sc.or.kr/", orgHashtag1, orgHashtag2);
//            em.persist(organization1);
//
//            Organization organization2 = new Organization("국경없는 의사회", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , "전쟁, 기아, 질병, 자연재해등 생존을 위협받는 이들을 치료하는 국경없는의사회", "https://msf.or.kr/", orgHashtag3, orgHashtag4);
//            em.persist(organization2);
//
//            Organization organization3 = new Organization("굿네이버스", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , "아동권리보호 및 해외구호개발사업, 해외아동결연, 긴급구호, 후원방법 안내", "https://www.goodneighbors.kr/", orgHashtag5, orgHashtag6, orgHashtag7, orgHashtag8, orgHashtag9, orgHashtag10);
//            em.persist(organization3);
//
//            Organization organization4 = new Organization("월드비전", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , "가난과 불의의 문제를 극복하기 위해 어린이, 가정, 지역사회와 함께 일하는 기독교 국제구호 개발 옹호기구", "https://www.worldvision.or.kr/", orgHashtag11, orgHashtag12, orgHashtag13, orgHashtag14);
//            em.persist(organization4);
//
//            Organization organization5 = new Organization("위스타트", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , "국내 빈곤가정 아동 교육, 복지, 건강 통합적 지원, 공부방 운영, 기부 안내", "https://westart.or.kr/", orgHashtag15, orgHashtag16, orgHashtag17, orgHashtag18);
//            em.persist(organization5);
//
//            Organization organization6 = new Organization("유니세프 한국위원회", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg", "세계의 미래는 아이들에게 달려 있습니다.\n" +
//                    "적과 인종, 성별, 종교의 벽을 넘어 '차별 없는 구호의 정신'으로 전 세계 모든 어린이를 도와 주는 국제단체", "https://www.unicef.or.kr/"
//                    , orgHashtag19, orgHashtag20, orgHashtag21);
//            em.persist(organization6);
//
//            Organization organization7 = new Organization("유엔난민기구", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , "UNHCR은 모든 사람이 비호를 신청할 수 있고, 타국에서 안전한 피난처를 찾 으며, 자발적으로 귀환할 권리를 누릴 수 있도록 보장 하고자 지원", "https://www.unhcr.or.kr/unhcr/main/index.jsp"
//                    , orgHashtag22, orgHashtag23);
//            em.persist(organization7);
//
//            Organization organization8 = new Organization("국제어린이양육기구 한국컴패션", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , "꿈을 잃은 어린이들에게 그리스도의 사랑을, 세상 모든 어린이는 사랑받기에 마땅한 ‘소중한 존재’입니다", "https://www.goodneighbors.kr/"
//                    , orgHashtag24, orgHashtag25, orgHashtag26, orgHashtag27);
//            em.persist(organization8);
//
//            Organization organization9 = new Organization("한국해비타트", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , "해비타트(Habitat for Humanity)는 ‘모든 사람에게 안락한 집이 있는 세상’이라는 비전을 가지고 1976년 미국에서 시작한 국제비영리단체로 열악한 주거환경으로 고통 받는 사람들을 위해 집과 마을을 짓고 희망을 전하고 있습니다.", "https://www.habitat.or.kr/"
//                    , orgHashtag28, orgHashtag29, orgHashtag30, orgHashtag31);
//            em.persist(organization9);
//
//            Organization organization10 = new Organization("한국헬프에이지", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , "저소득 독거노인 복지서비스제공, 노인공동체 지원 및 노인인권 옹호사업, 해외 빈곤국 노인을 위한 복지모델 전수", "https://www.helpage.or.kr/"
//                    , orgHashtag32, orgHashtag33);
//            em.persist(organization10);
//
//            // 캠페인
//            CampaignHashtag campaignHashtag1 = CampaignHashtag.createCampaignHashtag(hashtag1);
//            CampaignHashtag campaignHashtag2 = CampaignHashtag.createCampaignHashtag(hashtag18);
//            CampaignHashtag campaignHashtag3 = CampaignHashtag.createCampaignHashtag(hashtag9);
//
//            CampaignHashtag campaignHashtag4 = CampaignHashtag.createCampaignHashtag(hashtag3);
//            CampaignHashtag campaignHashtag5 = CampaignHashtag.createCampaignHashtag(hashtag19);
//
//            CampaignHashtag campaignHashtag6 = CampaignHashtag.createCampaignHashtag(hashtag1);
//            CampaignHashtag campaignHashtag7 = CampaignHashtag.createCampaignHashtag(hashtag20);
//            CampaignHashtag campaignHashtag8 = CampaignHashtag.createCampaignHashtag(hashtag21);
//
//            CampaignHashtag campaignHashtag9 = CampaignHashtag.createCampaignHashtag(hashtag1);
//            CampaignHashtag campaignHashtag10 = CampaignHashtag.createCampaignHashtag(hashtag22);
//
//            CampaignHashtag campaignHashtag11 = CampaignHashtag.createCampaignHashtag(hashtag1);
//            CampaignHashtag campaignHashtag12 = CampaignHashtag.createCampaignHashtag(hashtag23);
//
//            CampaignHashtag campaignHashtag13 = CampaignHashtag.createCampaignHashtag(hashtag1);
//            CampaignHashtag campaignHashtag14 = CampaignHashtag.createCampaignHashtag(hashtag24);
//
//            CampaignHashtag campaignHashtag15 = CampaignHashtag.createCampaignHashtag(hashtag25);
//            CampaignHashtag campaignHashtag16 = CampaignHashtag.createCampaignHashtag(hashtag4);
//
//            CampaignHashtag campaignHashtag17 = CampaignHashtag.createCampaignHashtag(hashtag1);
//            CampaignHashtag campaignHashtag18 = CampaignHashtag.createCampaignHashtag(hashtag26);
//            CampaignHashtag campaignHashtag19 = CampaignHashtag.createCampaignHashtag(hashtag9);
//
//            CampaignHashtag campaignHashtag20 = CampaignHashtag.createCampaignHashtag(hashtag27);
//            CampaignHashtag campaignHashtag21 = CampaignHashtag.createCampaignHashtag(hashtag14);
//
//            CampaignHashtag campaignHashtag22 = CampaignHashtag.createCampaignHashtag(hashtag17);
//            CampaignHashtag campaignHashtag23 = CampaignHashtag.createCampaignHashtag(hashtag16);
//            CampaignHashtag campaignHashtag24 = CampaignHashtag.createCampaignHashtag(hashtag2);
//
//            CampaignHashtag campaignHashtag25 = CampaignHashtag.createCampaignHashtag(hashtag16);
//            CampaignHashtag campaignHashtag26 = CampaignHashtag.createCampaignHashtag(hashtag1);
//            CampaignHashtag campaignHashtag27 = CampaignHashtag.createCampaignHashtag(hashtag21);
//
//            CampaignHashtag campaignHashtag28 = CampaignHashtag.createCampaignHashtag(hashtag28);
//            CampaignHashtag campaignHashtag29 = CampaignHashtag.createCampaignHashtag(hashtag29);
//
//            CampaignHashtag campaignHashtag30 = CampaignHashtag.createCampaignHashtag(hashtag58);
//            CampaignHashtag campaignHashtag31 = CampaignHashtag.createCampaignHashtag(hashtag4);
//
//            CampaignHashtag campaignHashtag32 = CampaignHashtag.createCampaignHashtag(hashtag58);
//            CampaignHashtag campaignHashtag33 = CampaignHashtag.createCampaignHashtag(hashtag22);
//            CampaignHashtag campaignHashtag34 = CampaignHashtag.createCampaignHashtag(hashtag30);
//            CampaignHashtag campaignHashtag35 = CampaignHashtag.createCampaignHashtag(hashtag3);
//
//            CampaignHashtag campaignHashtag36 = CampaignHashtag.createCampaignHashtag(hashtag4);
//            CampaignHashtag campaignHashtag37 = CampaignHashtag.createCampaignHashtag(hashtag1);
//            CampaignHashtag campaignHashtag38 = CampaignHashtag.createCampaignHashtag(hashtag12);
//
//            CampaignHashtag campaignHashtag39 = CampaignHashtag.createCampaignHashtag(hashtag31);
//            CampaignHashtag campaignHashtag40 = CampaignHashtag.createCampaignHashtag(hashtag32);
//
//            CampaignHashtag campaignHashtag41 = CampaignHashtag.createCampaignHashtag(hashtag33);
//            CampaignHashtag campaignHashtag42 = CampaignHashtag.createCampaignHashtag(hashtag34);
//            CampaignHashtag campaignHashtag43 = CampaignHashtag.createCampaignHashtag(hashtag1);
//            CampaignHashtag campaignHashtag44 = CampaignHashtag.createCampaignHashtag(hashtag35);
//            CampaignHashtag campaignHashtag45 = CampaignHashtag.createCampaignHashtag(hashtag23);
//
//            CampaignHashtag campaignHashtag46 = CampaignHashtag.createCampaignHashtag(hashtag36);
//            CampaignHashtag campaignHashtag47 = CampaignHashtag.createCampaignHashtag(hashtag15);
//            CampaignHashtag campaignHashtag48 = CampaignHashtag.createCampaignHashtag(hashtag37);
//            CampaignHashtag campaignHashtag49 = CampaignHashtag.createCampaignHashtag(hashtag38);
//
//            CampaignHashtag campaignHashtag50 = CampaignHashtag.createCampaignHashtag(hashtag59);
//            CampaignHashtag campaignHashtag51 = CampaignHashtag.createCampaignHashtag(hashtag6);
//            CampaignHashtag campaignHashtag52 = CampaignHashtag.createCampaignHashtag(hashtag9);
//
//            CampaignHashtag campaignHashtag53 = CampaignHashtag.createCampaignHashtag(hashtag39);
//            CampaignHashtag campaignHashtag54 = CampaignHashtag.createCampaignHashtag(hashtag40);
//            CampaignHashtag campaignHashtag55 = CampaignHashtag.createCampaignHashtag(hashtag41);
//
//            CampaignHashtag campaignHashtag56 = CampaignHashtag.createCampaignHashtag(hashtag10);
//            CampaignHashtag campaignHashtag57 = CampaignHashtag.createCampaignHashtag(hashtag42);
//
//            CampaignHashtag campaignHashtag58 = CampaignHashtag.createCampaignHashtag(hashtag34);
//            CampaignHashtag campaignHashtag59 = CampaignHashtag.createCampaignHashtag(hashtag43);
//            CampaignHashtag campaignHashtag60 = CampaignHashtag.createCampaignHashtag(hashtag21);
//            CampaignHashtag campaignHashtag61 = CampaignHashtag.createCampaignHashtag(hashtag9);
//
//            CampaignHashtag campaignHashtag62 = CampaignHashtag.createCampaignHashtag(hashtag44);
//            CampaignHashtag campaignHashtag63 = CampaignHashtag.createCampaignHashtag(hashtag45);
//            CampaignHashtag campaignHashtag64 = CampaignHashtag.createCampaignHashtag(hashtag9);
//
//            CampaignHashtag campaignHashtag65 = CampaignHashtag.createCampaignHashtag(hashtag44);
//            CampaignHashtag campaignHashtag66 = CampaignHashtag.createCampaignHashtag(hashtag47);
//
//            CampaignHashtag campaignHashtag67 = CampaignHashtag.createCampaignHashtag(hashtag48);
//            CampaignHashtag campaignHashtag68 = CampaignHashtag.createCampaignHashtag(hashtag49);
//            CampaignHashtag campaignHashtag69 = CampaignHashtag.createCampaignHashtag(hashtag1);
//
//            CampaignHashtag campaignHashtag70 = CampaignHashtag.createCampaignHashtag(hashtag10);
//            CampaignHashtag campaignHashtag71 = CampaignHashtag.createCampaignHashtag(hashtag44);
//            CampaignHashtag campaignHashtag72 = CampaignHashtag.createCampaignHashtag(hashtag50);
//
//            CampaignHashtag campaignHashtag73 = CampaignHashtag.createCampaignHashtag(hashtag51);
//            CampaignHashtag campaignHashtag74 = CampaignHashtag.createCampaignHashtag(hashtag14);
//            CampaignHashtag campaignHashtag75 = CampaignHashtag.createCampaignHashtag(hashtag1);
//
//            CampaignHashtag campaignHashtag76 = CampaignHashtag.createCampaignHashtag(hashtag14);
//            CampaignHashtag campaignHashtag77 = CampaignHashtag.createCampaignHashtag(hashtag52);
//
//            CampaignHashtag campaignHashtag78 = CampaignHashtag.createCampaignHashtag(hashtag17);
//            CampaignHashtag campaignHashtag79 = CampaignHashtag.createCampaignHashtag(hashtag16);
//            CampaignHashtag campaignHashtag80 = CampaignHashtag.createCampaignHashtag(hashtag2);
//            CampaignHashtag campaignHashtag81 = CampaignHashtag.createCampaignHashtag(hashtag53);
//            CampaignHashtag campaignHashtag82 = CampaignHashtag.createCampaignHashtag(hashtag54);
//            CampaignHashtag campaignHashtag83 = CampaignHashtag.createCampaignHashtag(hashtag55);
//            CampaignHashtag campaignHashtag84 = CampaignHashtag.createCampaignHashtag(hashtag56);
//
//            CampaignHashtag campaignHashtag85 = CampaignHashtag.createCampaignHashtag(hashtag17);
//            CampaignHashtag campaignHashtag86 = CampaignHashtag.createCampaignHashtag(hashtag57);
//            CampaignHashtag campaignHashtag87 = CampaignHashtag.createCampaignHashtag(hashtag21);
//
//            Campaign campaign1 = new Campaign("R:untact 국제어린이마라톤", "2022-03-24", null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "국제어린이마라톤 참가비는 베트남 소수민족 산모와 신생아의 건강한 삶을 위해 사용됩니다. 베트남 손라 및 닥락 성의 신생아와 산모의 사망률이 줄어들 수 있도록 함께 해주세요.\n", "https://www.sc.or.kr/marathon/"
//                    , organization1, campaignHashtag1, campaignHashtag2, campaignHashtag3);
//            em.persist(campaign1);
//
//            Campaign campaign2 = new Campaign("구호활동가, 지금 바로 지원하세요", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "우리의 1분 1초가, 누군가에게는 ‘평생’이라는 시간을 선물한다고 믿습니다.\n" +
//                    "우리는 국경없는의사회 구호활동가입니다.\n", "https://msf.or.kr/work-field"
//                    , organization2, campaignHashtag4, campaignHashtag5);
//            em.persist(campaign2);
//
//            Campaign campaign3 = new Campaign("너의 마음과 내 마음이 닿는 순간, 같이여행", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "해외아동 1:1결연 캠페인\n" +
//                    "당신이 바꿀 하나\n" +
//                    "모든 것이 바뀔 아이\n" +
//                    "태어나자 마자 정해져 버린 연약한 아이들의 삶.\n" +
//                    "당신의 시작이 한 아이의 세상을 바꿀 수 있습니다.\n" +
//                    "지금, 한 아이와 결연을 시작해주세요.", "https://www.goodneighbors.kr/campaign/with21b"
//                    , organization3, campaignHashtag6, campaignHashtag7, campaignHashtag8);
//            em.persist(campaign3);
//
//            Campaign campaign4 = new Campaign("2022년 월드비전 꿈 엽서그리기대회", "2022-02-15", "2022-05-31", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "내가 꿈꾸는 세상을 엽서에 그려 마음껏 꿈꿀 수 없는\n" +
//                    "지구마을 친구들에게 희망을 전해요!", "https://www.worldvision.or.kr/campaign/2022/postcard/index.asp"
//                    , organization4, campaignHashtag9, campaignHashtag10);
//            em.persist(campaign4);
//
//            Campaign campaign5 = new Campaign("어린이날, 추억이 없는 아이들", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "보내주신 후원금은 어린이날 선물 지원 사업을 위해 우선 사용되며, 이후 모인 후원금은 현아와 같은 국내 저소득 및 취약계층 아동을 지원하는데 사용될 예정입니다. - 선물 구입, 행사 비용, 사례 관리", "https://westart.or.kr/archives/43224"
//                    , organization5, campaignHashtag11, campaignHashtag12);
//            em.persist(campaign5);
//
//            Campaign campaign6 = new Campaign("UNICEF TEAM 팔찌 받기", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "\"유니세프팀 팔찌는 어린이를 지켜주는 멋진 상징이에요\"\n" +
//                    "유니세프 팀이 되는 건 어린이를 지키는\n" +
//                    "가장 멋진 방법이자 가치 있는 일이죠.\n" +
//                    "함께하는 사람들이 많아질수록 더 많은\n" +
//                    "어린이의 현실을 바꿀 수 있어요.", "https://www.unicef.or.kr/event/unicef-team2-3/?trackcode=19team_ec3"
//                    , organization6, campaignHashtag13, campaignHashtag14);
//            em.persist(campaign6);
//
//            Campaign campaign7 = new Campaign("전 세계 긴급구호 캠페인", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "지금 이 순간에도 수많은 이웃들이 목숨을 걸고 고향을 떠나고 있습니다\n" +
//                    "전 세계 인구 100명 중 1명이\n" +
//                    "강제로 고향을 떠나 피난길에 오릅니다\n" +
//                    "전쟁, 박해, 폭력, 자연재해로 인해 삶의 터전을 잃은 사람은\n" +
//                    "우리나라 인구수보다 많은 7,950만 명\n" +
//                    "이 중 약 절반은 18세 미만의 어린이입니다", "https://www.unhcr.or.kr/unhcr/program/donate/support01.jsp"
//                    , organization7, campaignHashtag15, campaignHashtag16);
//            em.persist(campaign7);
//
//            Campaign campaign8 = new Campaign("2022 컴패션 버츄얼 사이클링", "2022-03-14", "2022-03-31", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "자전거 타고 자전거 선물하자!\n" +
//                    "- 스페셜 라이더 (1:1 어린이 양육)\n" +
//                    "\"1명의 어린이를 후원하고 대회에 참여하기\"\n" +
//                    "매월 45,000원의 정기 후원으로 1명의 어린이를 후원합니다.\n" +
//                    "- 드림 라이더\n" +
//                    "\"어린이들에게 자전거를 선물하고 대회에 참여하기\"\n" +
//                    "일시후원으로 케냐 컴패션 어린이들을 위한 통학용 자전거 구입 및 교육 비용으로 사용됩니다.\n", "https://www.compassion.or.kr/participation/event/view?eventNumber=132&campaignId="
//                    , organization8, campaignHashtag17, campaignHashtag18, campaignHashtag19);
//            em.persist(campaign8);
//
//            Campaign campaign9 = new Campaign("독립유공자 후손 주거개선 캠페인", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "[독립운동가 후손 지지 선언문]\n" +
//                    "하나, 장기적이고 체계적인 국가지원이 필요합니다.\n" +
//                    "둘, 지금은 숨겨진 독립운동가 후손들을 찾아내기 위한 적극적인 지원이 필요합니다.\n" +
//                    "셋, 무엇보다도 독립운동가 후손들이 편하게 여생을 보낼 수 있는 집과 환경이 필요합니다.", "https://www.habitat.or.kr/pages/index2.php?wm_id=122"
//                    , organization9, campaignHashtag20, campaignHashtag21);
//            em.persist(campaign9);
//
//            Campaign campaign10 = new Campaign("89세 박명순 어르신이 폐지를 줍는 이유", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "한국헬프에이지는 박명순 어르신과 같은 저소득 노인을 돕습니다. \n" +
//                    "경제적으로 어렵고, 소외되어 힘든 하루를 보내는\n" +
//                    "저소득 어르신께 따뜻한 마음을 전해주세요.\n" +
//                    "- 노인복지서비스 제공, 소외감 극복, 노인인권 향상", "https://www.helpage.or.kr/support_campaign/old-people-campaign/"
//                    , organization10, campaignHashtag22, campaignHashtag23, campaignHashtag24);
//            em.persist(campaign10);
//
//            Campaign campaign11 = new Campaign("추위를 참는 게 익숙한, 7살 민규의 겨울", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "민규에게 겨울옷을 선물하고 싶어요\n" +
//                    "민규와 외할아버지는 올 겨울도 작은 난로와 서로의 온기로 \n" +
//                    "추위를 견뎌내야만 합니다.\n" +
//                    "지독한 추위만큼, 더 차가운 세상에서 민규와 할아버지가\n" +
//                    "온전히 살아갈 수 있도록 힘을 보태 주세요.", "https://www.sc.or.kr/goods_redspirit/?_C_=4140"
//                    , organization1, campaignHashtag25, campaignHashtag26, campaignHashtag27);
//            em.persist(campaign11);
//
//            Campaign campaign12 = new Campaign("REDVOICE 우리가 이야기하는 아동권리", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "아동의 권리를 최초로 주창한 세이브더칠드런은 한 세기, \n" +
//                    "오직 아동권리를 지켜왔습니다.\n" +
//                    "모든 아동이 권리를 온전히 누리는 세상을 꿈꾸며\n" +
//                    "Red Voice를 널리 알리기 위해 끊임없이 달려가려 합니다.\n" +
//                    "\n" +
//                    "세이브더칠드런의 굿즈몰 savethegood#\n" +
//                    "당신의 Good한 소비가 모여, 세상의 가치가 더해집니다.", "https://www.sc.or.kr/goods_redspirit/?_C_=4140"
//                    , organization1, campaignHashtag28, campaignHashtag29);
//            em.persist(campaign12);
//
//            Campaign campaign13 = new Campaign("생명을 살리는 지도 만들기", "2022-03-21", "2022-04-05", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "4월 7일 목요일 '세계 보건의 날'을 맞이해 국경없는의사회가 지구보건 매파톤을 개최합니다. 국경없는의사회가 긴급 구호 활동을 진행하고 있는 지역 중에는 아직 지도에 표시되어 있지 않은 곳이 많습니다.  <생명을 살리는 지도 만들기> 프로젝트는 오픈 소스 지도 서비스인 \"오픈스트리트맵(OpenStreetMap, OSM)\"을 활용해 위성사진을 보고 지도를 그리는 봉사활동입니다. \n" +
//                    "\n" +
//                    "여러분의 매파톤 참여로 국경없는의사회가 더욱 신속히 기후위기대응 활동을 전개할 수 있도록 도와주세요!", "https://msf.or.kr/article/5892"
//                    , organization2, campaignHashtag30, campaignHashtag31);
//            em.persist(campaign13);
//
//            Campaign campaign14 = new Campaign("병든 지구에서는 우리도 건강할 수 없습니다", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "\"2022 지구의 날\"\n" +
//                    "국경없는의사회는 전 세계 구호 현장에서 기후위기로 고통받는 사람들을 목격하고 있습니다.\n" +
//                    "그렇기 때문에 우리는 기후변화가 야기할 인도적 위기를 예상하고 선제적으로 대응하고자 합니다.\n" +
//                    "기후변화는 사람들의 건강과 안전을 위협합니다.\n" +
//                    "기후위기는 의료 위기입니다.", "https://msf.or.kr/campaigns/planetary-health/"
//                    , organization2, campaignHashtag32, campaignHashtag33, campaignHashtag34, campaignHashtag35);
//            em.persist(campaign14);
//
//            Campaign campaign15 = new Campaign("우크라이나 긴급구호", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "한국에서 시작된 글로벌 NGO 굿네이버스의 현장 기록\n" +
//                    "언제 끝날지 모르는 분쟁의 공포…\n" +
//                    "\n" +
//                    "“현재 난민들이 머물 수 있는 숙소, 음식이나 옷가지를 제공하고 있지만\n" +
//                    "여전히 지원하는 데 있어 부족함이 있는 상황입니다.\n" +
//                    "우크라이나 아동과 난민들을 향한 지속적인 관심과 지원이 필요합니다”\n" +
//                    "- 굿네이버스 우크라이나 긴급구호 현장 활동가 -", "https://www.goodneighbors.kr/campaign/emergency22a"
//                    , organization3, campaignHashtag36, campaignHashtag37, campaignHashtag38);
//            em.persist(campaign15);
//
//            Campaign campaign16 = new Campaign("엄마니까 포기하지 않아", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "1.5kg의 작은 몸으로 한날한시에 \n" +
//                    "엄마에게 찾아온 새별이와 새봄이.\n" +
//                    "\n" +
//                    "지적장애를 가진 엄마에게 하루하루가 버거운 육아지만\n" +
//                    "‘엄마’이기에 포기하지 않습니다.\n" +
//                    "\n" +
//                    "쌍둥이가 어려움을 극복하고\n" +
//                    "건강하게 성장할 수 있도록 여러분이 함께해 주세요!", "https://www.goodneighbors.kr/campaign/children2204"
//                    , organization3, campaignHashtag39, campaignHashtag40);
//            em.persist(campaign16);
//
//            Campaign campaign17 = new Campaign("지구촌 어린이들의 생명을 살리는 구호물품", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "모든 어린이가 건강하게 자라고 학교에 다니며\n" +
//                    "깨끗한 물을 마실 수 있도록\n" +
//                    "구호물품으로 특별한 선물을 전해보세요" +
//                    "우리는 국경없는의사회 구호활동가입니다.\n", "https://www.unicef.or.kr/involve/individual/ig"
//                    , organization6, campaignHashtag41, campaignHashtag42, campaignHashtag43, campaignHashtag44, campaignHashtag45);
//            em.persist(campaign17);
//
//            Campaign campaign18 = new Campaign("유니세프 후원자 합창단", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "해외아동 1:1결연 캠페인\n" +
//                    "유니세프한국위원회는 2016년 유니세프 창립 70주년을 맞아 후원자 합창단을 창단했습니다. 모든 어린이가 행복한 세상을 만들기 위해 후원자 합창단은 아름다운 하모니로 노래합니다.", "https://www.unicef.or.kr/involve/donors/story/"
//                    , organization6, campaignHashtag46, campaignHashtag47, campaignHashtag48, campaignHashtag49);
//            em.persist(campaign18);
//
//            Campaign campaign19 = new Campaign("GLOBAL 6K FOR WATER: HIKING", "2022-04-01", "2022-04-17", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "너와 나를 위한 하이킹\n" +
//                    "\"깨끗한 물을 위해 함께 달릴 히어로를 찾습니다\"\n" +
//                    "6km는 아프리카 아이들이 물을 얻기 위해 매일 걷는 평균 거리입니다.\n" +
//                    "Global 6K for Water에 참가해 6km를 대신 달리고 깨끗한 물을 선물하는 히어로가 되어 보세요!\n" +
//                    "\n" +
//                    "정상석에서 찍은 사진을 SNS에 인증하면 노스페이스에디션에서 \n" +
//                    "1좌당 1만원의 후원금을 아프리카 어린이들을 위한 식수사업에 후원합니다.", "https://global6kforwater.com:446/information/place_hiking.asp?place=2022Hiking&utm_source=web&utm_medium=WV_campaign&utm_campaign=22Hiking6K"
//                    , organization4, campaignHashtag50, campaignHashtag51, campaignHashtag52);
//            em.persist(campaign19);
//
//            Campaign campaign20 = new Campaign("Basic for Girls 면생리대 만들기 캠페인", "2021-05-28", "2022-05-27", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "전 세계 소녀들의 기본 권리를 내 손으로 지키는 가장 쉬운 방법!\n" +
//                    "베이직포걸스는 직접 바느질하여 보내주신 면생리대로\n" +
//                    "소녀들의 가장 기본적인 권리를 지켜주는 시민참여 캠페인입니다.", "https://www.worldvision.or.kr/campaign/2021/basic-for-girls/basic-for-girls.asp"
//                    , organization4, campaignHashtag53, campaignHashtag54, campaignHashtag55);
//            em.persist(campaign20);
//
//            Campaign campaign21 = new Campaign("기울어진 밥상 앞 아이들", "2019-09-06", "2022-05-31", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "지금 아이들에게 사랑 가득한 밥상을 선물해주세요\n" +
//                    "하루의 한끼, 종현이가 먹을 수 있는 유일한 밥상, 급식.\n" +
//                    "몸도 마음도 불균형하게 기울어진 종현이의 배고픈 하루.", "https://www.worldvision.or.kr/campaign/2019/bapsang.asp"
//                    , organization4, campaignHashtag56, campaignHashtag57);
//            em.persist(campaign21);
//
//            Campaign campaign22 = new Campaign("Good water project! 물지킴이", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "더 많은 물을 지킬 수 있도록 지금 여러분이 물지킴이를 보내주세요!\n" +
//                    "주민들이 직접 입력한 데이터를 기반으로\n" +
//                    "작동에 문제가 있거나 점검이 필요한 곳으로 달려가\n" +
//                    "오래된 파이프를 교체하고, 깨끗하게 청소하고, 관리하는 방법까지 알려주는\n" +
//                    "\"물지킴이 프로젝트\"", "https://www.goodneighbors.kr/campaign/water22"
//                    , organization3, campaignHashtag58, campaignHashtag59, campaignHashtag60, campaignHashtag61);
//            em.persist(campaign22);
//
//            Campaign campaign23 = new Campaign("Compassion Band 컴패션밴드", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "어린이들의 희망을 노래하는 컴패션밴드\n" +
//                    "컴패션밴드는 국제어린이양육기구 한국컴패션의 후원자 중 공연과 관련된 재능을 가진 사람들이 모여 더 많은 어린이들이 사랑으로 양육될 수 있도록, 공연과 여러가지 봉사활동으로 재능을 나누는 100% 자원봉사 모임입니다.", "https://www.compassion.or.kr/advocate/about/"
//                    , organization8, campaignHashtag62, campaignHashtag63, campaignHashtag64);
//            em.persist(campaign23);
//
//            Campaign campaign24 = new Campaign("Compassion Mate 컴패션메이트", "2022-02-15", "2022-05-31", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "후원자님과 후원 어린이가 주고 받는 편지를 번역하는 봉사 활동입니다.", "https://www.compassion.or.kr/fo/mate/home"
//                    , organization8, campaignHashtag65, campaignHashtag66);
//            em.persist(campaign24);
//
//            Campaign campaign25 = new Campaign("Compassion Vision Trip 컴패션비전트립", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "후원하고 있는 어린이를 만납니다.\n" +
//                    "편지와 기도로 마음을 나누었던 어린이를\n" +
//                    "직접 만날 수 있는 감동의 시간입니다.\n" +
//                    "\n" +
//                    "먼 곳에서부터 어린이를 만나러 와주신 후원자님의\n" +
//                    "사랑의 마음은 어린이와 가족에게 아름다운 선물이 되며,\n" +
//                    "후원자님의 사랑으로 더 밝게 자라가는 어린이와의 만남은 \n" +
//                    "후원자님에게도 평생 잊지 못할 소중한 시간이 될 것입니다.", "https://www.compassion.or.kr/participation/visiontrip/intro/"
//                    , organization8, campaignHashtag67, campaignHashtag68, campaignHashtag69);
//            em.persist(campaign25);
//
//            Campaign campaign26 = new Campaign("희망의 집짓기", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "여러분의 땀과 열정으로 집과 희망을 짓습니다.\n" +
//                    "\n" +
//                    "국내 주거환경의 개선을 위해\n" +
//                    "새로운 주택을 짓습니다.\n" +
//                    "해비타트가 짓는 주택은 입주가정의 자립과 건강한 공동체의 기반이 됩니다.\n" +
//                    "자원봉사자들은 희망의 집짓기 현장에서 땀과 열정을 나누는 데 직접 참여할 수 있습니다.", "https://www.habitat.or.kr/welfare/domestic"
//                    , organization9, campaignHashtag70, campaignHashtag71, campaignHashtag72);
//            em.persist(campaign26);
//
//            Campaign campaign27 = new Campaign("아동 주거권 지지 캠페인", "2020-12-20", null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.GIVING, "\"어린이들을 위해 목소리를 내줄 책임감 있는 어른이 되어 주세요\"\n" +
//                    "\n" +
//                    "1. 어린이들이 건강하게 자랄 수 있는 최소한의 주거 환경의 기준을 도입하고 엄격히 적용할 것을 촉구합니다.\n" +
//                    "2. 주거 빈곤 사각지대에 놓인 어린이들이 최소 주거 환경 기준을 충족한 집에서 성장할 수 있도록 실질적 주거 지원 대첵을 마련할 것을 촉구합니다.", "https://www.habitat.or.kr/pages/index2.php?wm_id=170 "
//                    , organization9, campaignHashtag73, campaignHashtag74, campaignHashtag75);
//            em.persist(campaign27);
//
//            Campaign campaign28 = new Campaign("날마다 기념일", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "기념일을 기억하고 기록하는 특별한 기부  프로젝트\n" +
//                    "생일, 최애 셀럽의 데뷔일, 결혼기념일 등 가장 소중한 순간을 기념하며 기부를 시작하세요.\n" +
//                    "주거 취약 이웃과 행복을 나누는 뜻깊은 날이 될 거예요.", "https://www.habitat.or.kr/landing/2021/everyday/index.html"
//                    , organization9, campaignHashtag76, campaignHashtag77);
//            em.persist(campaign28);
//
//            Campaign campaign29 = new Campaign("노인복지사업", "2022-02-15", "2022-05-31", "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "저소득 노인이 겪는 어려움을 해소합니다.\n" +
//                    "노인이 겪는 어려움은 경제적 빈곤, 고독, 질병, 소외, 차별 등 다양합니다.\n" +
//                    "노인복지사업은 노인이 겪는 어려움을 해소하고 건강하고 안정적인 삶을 살아갈 수 있도록 저소득 노인의 특성에 맞춘 서비스를 제공하는 사업입니다. 전국 노인을 대상으로 최소한의 생활을 위한 복지서비스 지원, 생필품 키트 지원, 명절 지원, 사회적 이슈에 따른 긴급 지원도 진행합니다.", "https://www.helpage.or.kr/business/welfare/"
//                    , organization10, campaignHashtag78, campaignHashtag79, campaignHashtag80, campaignHashtag81, campaignHashtag82, campaignHashtag83, campaignHashtag84);
//            em.persist(campaign29);
//
//            Campaign campaign30 = new Campaign("사랑의 지팡이 캠페인", null, null, "/sharing-giving/profileImg/220425/cb646447-74f2-44c7-9c44-a00192755f5e.jpg"
//                    , Category.SHARING, "\"지금, 저소득 노인이 서로 돕는 공동체 활동을 후원으로 지지해주세요\"\n" +
//                    "\n" +
//                    "사랑의 지팡이 캠페인을 통한 저소득 어르신이 지역사회의 구성원으로\n" +
//                    "참여하고 나눔으로써 사회에 이바지할 수 있는 건강한 어르신이 될 수 있도록 지원합니다.", "https://www.helpage.or.kr/support_campaign/cane-campaign/"
//                    , organization10, campaignHashtag85, campaignHashtag86, campaignHashtag87);
//            em.persist(campaign30);
//        }
//    }
//}
