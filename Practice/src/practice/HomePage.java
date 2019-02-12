package practice;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private Map<String, String> data;
    private WebDriver driver;
    private int timeout = 15;

    
    @FindBy(css = "a.action.showcart")
    @CacheLookup
    private WebElement _0;

    @FindBy(css = "a[href='https://app.targetbay.com/api/v1/webhooks/site-review-widget?page=10']")
    @CacheLookup
    private WebElement _10;

    @FindBy(css = "a[href='https://app.targetbay.com/api/v1/webhooks/site-review-widget?page=11']")
    @CacheLookup
    private WebElement _11;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(21) div:nth-of-type(1) ul.pagination li:nth-of-type(3) a.page-link")
    @CacheLookup
    private WebElement _2;

    @FindBy(css = "a[href='https://app.targetbay.com/api/v1/webhooks/site-review-widget?page=3']")
    @CacheLookup
    private WebElement _3;

    @FindBy(css = "a[href='https://app.targetbay.com/api/v1/webhooks/site-review-widget?page=4']")
    @CacheLookup
    private WebElement _4;

    @FindBy(css = "a[href='https://app.targetbay.com/api/v1/webhooks/site-review-widget?page=5']")
    @CacheLookup
    private WebElement _5;

    @FindBy(css = "a[href='https://app.targetbay.com/api/v1/webhooks/site-review-widget?page=6']")
    @CacheLookup
    private WebElement _6;

    @FindBy(css = "a[href='https://app.targetbay.com/api/v1/webhooks/site-review-widget?page=7']")
    @CacheLookup
    private WebElement _7;

    @FindBy(css = "a[href='https://app.targetbay.com/api/v1/webhooks/site-review-widget?page=8']")
    @CacheLookup
    private WebElement _8;

    @FindBy(css = "a[href='https://app.targetbay.com/api/v1/webhooks/site-review-widget?page=9']")
    @CacheLookup
    private WebElement _9;

    @FindBy(css = "a[href='https://www.streetstrider.com/accessories/']")
    @CacheLookup
    private WebElement accessories;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(2) a")
    @CacheLookup
    private WebElement accessoriesKits;

    @FindBy(css = "a[href='#main-Accountcontent']")
    @CacheLookup
    private WebElement account;

    @FindBy(id = "toggleCatSearch")
    @CacheLookup
    private WebElement allCategories1;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(1) a")
    @CacheLookup
    private WebElement allCategories2;

    @FindBy(css = "#social-form-create div.actions-toolbar div:nth-of-type(2) a.action.back")
    @CacheLookup
    private WebElement back;

    @FindBy(css = "#mainMenu li:nth-of-type(4) a.level0")
    @CacheLookup
    private WebElement benefits;

    @FindBy(css = "a[href='https://www.streetstrider.com/accessories/accessory-bundles.html']")
    @CacheLookup
    private WebElement bundles1;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(8) a")
    @CacheLookup
    private WebElement bundles2;

    @FindBy(id = "tbSiteReviews-FormCancelButton")
    @CacheLookup
    private WebElement cancel;

    @FindBy(css = "a[href='https://www.streetstrider.com/streetstriders.html']")
    @CacheLookup
    private WebElement compareModels;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img section:nth-of-type(4) div.container div.row div.col-lg-12.col-md-12. div.row div:nth-of-type(2) div.model-content div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement compareModels1;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img section:nth-of-type(4) div.container div.row div.col-lg-12.col-md-12. div.row div:nth-of-type(3) div.model-content div:nth-of-type(2) a:nth-of-type(2)")
    @CacheLookup
    private WebElement compareModels2;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img header.header.header2 div:nth-of-type(2) div.container div.row div:nth-of-type(2) div.top-next-header-right ul.header-login li div.dropdown.dropdown-toplinks div.dropdown-menu ul.links li:nth-of-type(1) a.action.compare.no-display")
    @CacheLookup
    private WebElement compareProducts1;

    @FindBy(css = "#main-Accountcontent div.top-links ul.links li:nth-of-type(1) a.action.compare.no-display")
    @CacheLookup
    private WebElement compareProducts2;

    @FindBy(id = "password-confirmation-social")
    @CacheLookup
    private WebElement confirmPassword;

    @FindBy(css = "a[href='https://www.streetstrider.com/contact/']")
    @CacheLookup
    private WebElement contactUs;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img header.header.header2 div:nth-of-type(2) div.container div.row div:nth-of-type(2) div.top-next-header-right ul.header-login li div.dropdown.dropdown-toplinks div.dropdown-menu ul.links li:nth-of-type(4) a")
    @CacheLookup
    private WebElement createAnAccount1;

    @FindBy(css = "#main-Accountcontent div.top-links ul.links li:nth-of-type(4) a")
    @CacheLookup
    private WebElement createAnAccount2;

    @FindBy(css = "button.action.create.primary")
    @CacheLookup
    private WebElement createAnAccount3;

    @FindBy(css = "a.action.create")
    @CacheLookup
    private WebElement createNewAccount;

    @FindBy(id = "targetbaySiteEmail")
    @CacheLookup
    private WebElement email1;

    @FindBy(id = "email")
    @CacheLookup
    private WebElement email2;

    @FindBy(id = "email_address")
    @CacheLookup
    private WebElement email3;

    @FindBy(id = "email_address")
    @CacheLookup
    private WebElement email4;

    @FindBy(css = "button.olark-launch-button.olark-chat-tab.olark-size-sm")
    @CacheLookup
    private WebElement envelopeIconsmallPictureOfAnEnvelope;

    @FindBy(css = "#mainMenu li:nth-of-type(8) a.level0")
    @CacheLookup
    private WebElement faq1;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img footer.footer.footer1 div:nth-of-type(2) div:nth-of-type(1) div.container div.row div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) ul.menu li:nth-of-type(2) a")
    @CacheLookup
    private WebElement faq2;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img footer.footer.footer1 div:nth-of-type(2) div:nth-of-type(1) div.container div.row div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(3) ul.menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement financing;

    @FindBy(css = "a.action.remind")
    @CacheLookup
    private WebElement forgotYourPassword;

    @FindBy(css = "#social-form-password-forget div.actions-toolbar div:nth-of-type(2) a.action.back")
    @CacheLookup
    private WebElement goBack;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(13) a")
    @CacheLookup
    private WebElement healthBenefits;

    @FindBy(css = "#tbactive-site-div li:nth-of-type(3) a")
    @CacheLookup
    private WebElement highestRating;

    @FindBy(css = "#mobile-menu-3-1 li div.level0-wrap ul.level0 li:nth-of-type(1) a")
    @CacheLookup
    private WebElement i3;

    @FindBy(css = "#mobile-menu-3-1 li div.level0-wrap ul.level0 li:nth-of-type(2) a")
    @CacheLookup
    private WebElement i7;

    @FindBy(css = "a[href='https://www.streetstrider.com/indoor-trainer-stand.html']")
    @CacheLookup
    private WebElement indoorTrainer1;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(9) a")
    @CacheLookup
    private WebElement indoorTrainer2;

    @FindBy(css = "#btnwhiteglov a")
    @CacheLookup
    private WebElement learnMore1;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img section:nth-of-type(4) div.container div.row div.col-lg-12.col-md-12. div.row div:nth-of-type(2) div.model-content div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement learnMore2;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img section:nth-of-type(4) div.container div.row div.col-lg-12.col-md-12. div.row div:nth-of-type(3) div.model-content div:nth-of-type(2) a:nth-of-type(1)")
    @CacheLookup
    private WebElement learnMore3;

    @FindBy(css = "a[href='https://www.streetstrider.com/accessories/indoor-trainer-stand-mat-5.html/']")
    @CacheLookup
    private WebElement learnMore4;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img section:nth-of-type(6) div.no-padding.container-fluid div.row div:nth-of-type(2) div.row div.panel-block-row.col-md-12.health-benefits-content div:nth-of-type(2) p a.but-black-full")
    @CacheLookup
    private WebElement learnMore5;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img section:nth-of-type(7) div.no-padding.container-fluid div.row div:nth-of-type(1) div.row div.panel-block-row.col-md-12.services-left div:nth-of-type(2) p:nth-of-type(2) a.but-black-full")
    @CacheLookup
    private WebElement learnMore6;

    @FindBy(css = "a[href='https://www.streetstrider.com/compare-to-other-exercises/']")
    @CacheLookup
    private WebElement learnMore7;

    @FindBy(css = "a[href='https://www.streetstrider.com/accessories/lights-and-bells.html']")
    @CacheLookup
    private WebElement lightsBells1;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(4) a")
    @CacheLookup
    private WebElement lightsBells2;

    @FindBy(css = "a[href='https://www.streetstrider.com/streetstrider-brand-heavy-duty-coil-cable-lock-p-194.html']")
    @CacheLookup
    private WebElement locks1;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(7) a")
    @CacheLookup
    private WebElement locks2;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img header.header.header2 div:nth-of-type(2) div.container div.row div:nth-of-type(2) div.top-next-header-right ul.header-login li div.dropdown.dropdown-toplinks div.dropdown-menu ul.links li:nth-of-type(5) a.social-login")
    @CacheLookup
    private WebElement logIn1;

    @FindBy(css = "#main-Accountcontent div.top-links ul.links li:nth-of-type(5) a.social-login")
    @CacheLookup
    private WebElement logIn2;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img header.header.header2 div:nth-of-type(2) div.container div.row div:nth-of-type(2) div.top-next-header-right ul.header-login li div.dropdown.dropdown-toplinks button.dropdown-toggle")
    @CacheLookup
    private WebElement login1;

    @FindBy(id = "bnt-social-login-authentication")
    @CacheLookup
    private WebElement login;

    @FindBy(css = "#tbactive-site-div li:nth-of-type(4) a")
    @CacheLookup
    private WebElement lowestRating;

    @FindBy(css = "a[href='https://www.streetstrider.com/watch-videos.html/']")
    @CacheLookup
    private WebElement media;

    @FindBy(css = "a[href='https://www.streetstrider.com/mediarelation/']")
    @CacheLookup
    private WebElement mediaRelations;

    @FindBy(css = "a[href='#main-Menucontent']")
    @CacheLookup
    private WebElement menu;

    @FindBy(css = "a[href='https://www.youtube.com/watch?v=Q2HBRrI5RUE']")
    @CacheLookup
    private WebElement mobilebannernew;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img header.header.header2 div:nth-of-type(2) div.container div.row div:nth-of-type(2) div.top-next-header-right ul.header-login li div.dropdown.dropdown-toplinks div.dropdown-menu ul.links li:nth-of-type(2) a")
    @CacheLookup
    private WebElement myAccount1;

    @FindBy(css = "#main-Accountcontent div.top-links ul.links li:nth-of-type(2) a")
    @CacheLookup
    private WebElement myAccount2;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img footer.footer.footer1 div:nth-of-type(2) div:nth-of-type(1) div.container div.row div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(3) ul.menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement myAccount3;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img header.header.header2 div:nth-of-type(2) div.container div.row div:nth-of-type(2) div.top-next-header-right ul.header-login li div.dropdown.dropdown-toplinks div.dropdown-menu ul.links li:nth-of-type(3) a")
    @CacheLookup
    private WebElement myWishList1;

    @FindBy(css = "#main-Accountcontent div.top-links ul.links li:nth-of-type(3) a")
    @CacheLookup
    private WebElement myWishList2;

    @FindBy(id = "targetbaySiteUsername")
    @CacheLookup
    private WebElement name;

    @FindBy(id = "tbactive-site")
    @CacheLookup
    private WebElement newest1;

    @FindBy(css = "#tbactive-site-div li:nth-of-type(1) a")
    @CacheLookup
    private WebElement newest2;

    @FindBy(css = "a.right.carousel-control")
    @CacheLookup
    private WebElement next;

    @FindBy(css = "#tbactive-site-div li:nth-of-type(2) a")
    @CacheLookup
    private WebElement oldest;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(1) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement on3i;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(4) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider3i1;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(18) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider3i10;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(5) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider3i2;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(8) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider3i3;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(11) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider3i4;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(12) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider3i5;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(13) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider3i6;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(15) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider3i7;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(16) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider3i8;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(17) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider3i9;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(2) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider3iBlue;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(3) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider7i1;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(6) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider7i2;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(7) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider7i3;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(9) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider7i4;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(10) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider7i5;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(14) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider7i6;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(19) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider7i7;

    @FindBy(css = "#targetbay-product-reviews div:nth-of-type(20) div.tbrow div:nth-of-type(2) div:nth-of-type(3) a")
    @CacheLookup
    private WebElement onStreetstrider7i8;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img header.header.header2 div:nth-of-type(2) div.container div.row div:nth-of-type(2) div.top-next-header-right div.top_next_header ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement orderOnline;

    @FindBy(css = "a[href='https://www.streetstrider.com/sales/guest/form/']")
    @CacheLookup
    private WebElement orderStatus;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img footer.footer.footer1 div:nth-of-type(2) div:nth-of-type(1) div.container div.row div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) ul.menu li:nth-of-type(1) a")
    @CacheLookup
    private WebElement ourStory1;

    @FindBy(css = "#mainMenu li:nth-of-type(7) a.level0")
    @CacheLookup
    private WebElement ourStory;

    private final String pageLoadedText = "In just minutes a day, you get an exhilarating low impact workout that tones, shapes and sculpts your entire body while burning up to 1,000 calories an hour";

    private final String pageUrl = "/";

    @FindBy(id = "pass")
    @CacheLookup
    private WebElement password1;

    @FindBy(id = "password-social")
    @CacheLookup
    private WebElement password2;

    @FindBy(name = "targetbaySiteRating")
    @CacheLookup
    private List<WebElement> pleaseGiveRatingToThisSite1;

    @FindBy(name = "targetbaySiteRating")
    @CacheLookup
    private List<WebElement> pleaseGiveRatingToThisSite2;

    @FindBy(name = "targetbaySiteRating")
    @CacheLookup
    private List<WebElement> pleaseGiveRatingToThisSite3;

    @FindBy(name = "targetbaySiteRating")
    @CacheLookup
    private List<WebElement> pleaseGiveRatingToThisSite4;

    @FindBy(name = "targetbaySiteRating")
    @CacheLookup
    private List<WebElement> pleaseGiveRatingToThisSite5;

    private final String pleaseGiveRatingToThisSiteValue1 = "5";

    private final String pleaseGiveRatingToThisSiteValue2 = "2";

    private final String pleaseGiveRatingToThisSiteValue3 = "3";

    private final String pleaseGiveRatingToThisSiteValue4 = "1";

    private final String pleaseGiveRatingToThisSiteValue = "4";

    @FindBy(id = "olark-form-input-body")
    @CacheLookup
    private WebElement pleaseSendUsYourQuestionsOr;

    @FindBy(css = "#olark-container div:nth-of-type(3) a")
    @CacheLookup
    private WebElement poweredByOlark;

    @FindBy(css = "a.left.carousel-control")
    @CacheLookup
    private WebElement previous;

    @FindBy(css = "a[href='https://www.streetstrider.com/privacy-policy/']")
    @CacheLookup
    private WebElement privacyPolicy;

    @FindBy(css = "#tbSiteReviews div:nth-of-type(2) div:nth-of-type(2) ul li:nth-of-type(2) a")
    @CacheLookup
    private WebElement productReviews;

    @FindBy(css = "a[href='https://www.streetstrider.com/accessories/racks-bags-carriers.html']")
    @CacheLookup
    private WebElement rackBagsCarrier1;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(5) a")
    @CacheLookup
    private WebElement rackBagsCarrier2;

    @FindBy(css = "#carousel-example-generic div.carousel-inner div:nth-of-type(1) div.col-sm-12.carousel-main a.but-black-full")
    @CacheLookup
    private WebElement readMoreReviews1;

    @FindBy(css = "#carousel-example-generic div.carousel-inner div:nth-of-type(2) div.col-sm-12.carousel-main a.but-black-full")
    @CacheLookup
    private WebElement readMoreReviews2;

    @FindBy(css = "#carousel-example-generic div.carousel-inner div:nth-of-type(3) div.col-sm-12.carousel-main a.but-black-full")
    @CacheLookup
    private WebElement readMoreReviews3;

    @FindBy(css = "#carousel-example-generic div.carousel-inner div:nth-of-type(4) div.col-sm-12.carousel-main a.but-black-full")
    @CacheLookup
    private WebElement readMoreReviews4;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(12) a")
    @CacheLookup
    private WebElement refurbishedStreetstriders;

    @FindBy(css = "a[href='https://www.streetstrider.com/return-policy/']")
    @CacheLookup
    private WebElement returnPolicy;

    @FindBy(id = "targetbaySiteReview")
    @CacheLookup
    private WebElement review;

    @FindBy(css = "#mainMenu li:nth-of-type(3) a.level0")
    @CacheLookup
    private WebElement reviews;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img footer.footer.footer1 div:nth-of-type(2) div:nth-of-type(1) div.container div.row div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(3) ul.menu li:nth-of-type(5) a")
    @CacheLookup
    private WebElement reviews1;

    @FindBy(css = "button.tbSiteReviews-openButton.tbSiteDefaultButton.tbSiteDefaultButtonColor")
    @CacheLookup
    private WebElement reviews2;

    @FindBy(css = "a[href='https://www.streetstrider.com/accessories/roll-on-hitch-rack.html']")
    @CacheLookup
    private WebElement rollonHitchRack1;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(10) a")
    @CacheLookup
    private WebElement rollonHitchRack2;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img footer.footer.footer1 div:nth-of-type(2) div:nth-of-type(1) div.container div.row div:nth-of-type(2) div.row ul:nth-of-type(1) li:nth-of-type(1) a")
    @CacheLookup
    private WebElement sales18003480998;

    @FindBy(css = "#tbSiteReviews-reviewContainer div:nth-of-type(1) div:nth-of-type(9) div.tbrow div:nth-of-type(2) button.tbSiteDefaultButton.tbSiteDefaultButtonColor.tbPullRight")
    @CacheLookup
    private WebElement send1;

    @FindBy(css = "button.olark-form-send-button")
    @CacheLookup
    private WebElement send2;

    @FindBy(css = "a[href='https://www.streetstrider.com/shipping-information/']")
    @CacheLookup
    private WebElement shippingInformation;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img header.header.header2 div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(2) div.col-lg-10.col-md-12.col-md-offset-0.col-lg-offset-2 div.flash-sale div.row div:nth-of-type(4) a.but-white")
    @CacheLookup
    private WebElement shopNow;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img section:nth-of-type(1) div.no-padding.container-fluid div.row div.col-lg-12.col-md-12. div.row div:nth-of-type(1) div.video-banner div:nth-of-type(2) p.text-center a:nth-of-type(2)")
    @CacheLookup
    private WebElement shopNow1;

    @FindBy(css = "a.btn.but-black-fulE")
    @CacheLookup
    private WebElement shopNow2;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img section:nth-of-type(9) div.no-padding.container-fluid div.row div.col-lg-12.col-md-12. div.row div.panel-block-row.col-md-12.text-center p a.but-white")
    @CacheLookup
    private WebElement shopNow3;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img footer.footer.footer1 div:nth-of-type(1) div.success-shop-now p a.but-white")
    @CacheLookup
    private WebElement shopNow4;

    @FindBy(id = "firstname")
    @CacheLookup
    private WebElement signUpForNewsletter1;

    @FindBy(id = "lastname")
    @CacheLookup
    private WebElement signUpForNewsletter2;

    @FindBy(id = "is_subscribed")
    @CacheLookup
    private WebElement signUpForNewsletter3;

    @FindBy(css = "#tbSiteReviews div:nth-of-type(2) div:nth-of-type(2) ul li:nth-of-type(1) a")
    @CacheLookup
    private WebElement siteReviews;

    @FindBy(id = "live-chat")
    @CacheLookup
    private WebElement startALiveChat;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img footer.footer.footer1 div:nth-of-type(2) div:nth-of-type(1) div.container div.row div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) ul.menu li:nth-of-type(4) a")
    @CacheLookup
    private WebElement streetstrider3i;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img footer.footer.footer1 div:nth-of-type(2) div:nth-of-type(1) div.container div.row div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(1) ul.menu li:nth-of-type(5) a")
    @CacheLookup
    private WebElement streetstrider7i;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(15) a")
    @CacheLookup
    private WebElement streetstriders;

    @FindBy(css = "#mainMenu li:nth-of-type(1) a.level0.dropdown-toggle")
    @CacheLookup
    private WebElement streetstriders1;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(11) a")
    @CacheLookup
    private WebElement streetstriders2;

    @FindBy(css = "button.action.send.primary")
    @CacheLookup
    private WebElement submit;

    @FindBy(css = "#mainMenu li:nth-of-type(5) a.level0")
    @CacheLookup
    private WebElement successStories;

    @FindBy(css = "a.underline-none")
    @CacheLookup
    private WebElement support;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img footer.footer.footer1 div:nth-of-type(2) div:nth-of-type(1) div.container div.row div:nth-of-type(1) div:nth-of-type(1) div:nth-of-type(3) ul.menu li:nth-of-type(3) a")
    @CacheLookup
    private WebElement support1;

    @FindBy(css = ".cms-home.cms-index-index.page-layout-1column.wide main div.page-wrapper.lazy-loading-img footer.footer.footer1 div:nth-of-type(2) div:nth-of-type(1) div.container div.row div:nth-of-type(2) div.row ul:nth-of-type(1) li:nth-of-type(3) a")
    @CacheLookup
    private WebElement supportCenter;

    @FindBy(css = "#targetbay-site-reviews div:nth-of-type(20) div:nth-of-type(2) a")
    @CacheLookup
    private WebElement targetbayCloseIcon;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(3) a")
    @CacheLookup
    private WebElement tiresEtc;

    @FindBy(css = "a[href='https://www.streetstrider.com/accessories/tires-tubes.html']")
    @CacheLookup
    private WebElement tiresTubesEtc;

    @FindBy(id = "targetbaySiteTitle")
    @CacheLookup
    private WebElement title;

    @FindBy(id = "olark-form-input-email")
    @CacheLookup
    private WebElement typeYourEmail;

    @FindBy(id = "olark-form-input-fname")
    @CacheLookup
    private WebElement typeYourName;

    @FindBy(id = "olark-form-input-phone")
    @CacheLookup
    private WebElement typeYourPhoneOptional;

    @FindBy(css = "a[href='https://www.streetstrider.com/warranty-information/']")
    @CacheLookup
    private WebElement warrantyInformation;

    @FindBy(css = "a[href='https://youtu.be/BTgOQTFwXoc']")
    @CacheLookup
    private WebElement watchVideo1;

    @FindBy(css = "a[href='https://youtu.be/s_96SzuZJVk']")
    @CacheLookup
    private WebElement watchVideo2;

    @FindBy(css = "a[href='https://youtu.be/AXzRbljEhg0']")
    @CacheLookup
    private WebElement watchVideo3;

    @FindBy(css = "a[href='https://youtu.be/CDS_Czqi6DA']")
    @CacheLookup
    private WebElement watchVideo4;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(14) a")
    @CacheLookup
    private WebElement watchvideos;

    @FindBy(css = "#select-cat-dropdown li:nth-of-type(6) a")
    @CacheLookup
    private WebElement waterBottleCage;

    @FindBy(css = "a[href='https://www.streetstrider.com/accessories/water-bottle-cage.html']")
    @CacheLookup
    private WebElement waterBottleCages;

    @FindBy(id = "tbSiteReviews-FormButton")
    @CacheLookup
    private WebElement writeAReview;

    @FindBy(id = "search")
    @CacheLookup
    private WebElement youHaveNoItemsInYour;

    
//----------------------------------------------------------Methods----------------------------------------------------
    
    
    public HomePage() {
    }

    public HomePage(WebDriver driver) {
        this();
        this.driver = driver;
    }

    public HomePage(WebDriver driver, Map<String, String> data) {
        this(driver);
        this.data = data;
    }

    public HomePage(WebDriver driver, Map<String, String> data, int timeout) {
        this(driver, data);
        this.timeout = timeout;
    }

    /**
     * Click on Accessories Kits Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAccessoriesKitsLink() {
        accessoriesKits.click();
        return this;
    }

    /**
     * Click on Accessories Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAccessoriesLink() {
        accessories.click();
        return this;
    }

    /**
     * Click on Account Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAccountLink() {
        account.click();
        return this;
    }

    /**
     * Click on All Categories Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAllCategories1Link() {
        allCategories1.click();
        return this;
    }

    /**
     * Click on All Categories Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickAllCategories2Link() {
        allCategories2.click();
        return this;
    }

    /**
     * Click on Back Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBackLink() {
        back.click();
        return this;
    }

    /**
     * Click on Benefits Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBenefitsLink() {
        benefits.click();
        return this;
    }

    /**
     * Click on Bundles Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBundles1Link() {
        bundles1.click();
        return this;
    }

    /**
     * Click on Bundles Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickBundles2Link() {
        bundles2.click();
        return this;
    }

    /**
     * Click on Cancel Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCancelButton() {
        cancel.click();
        return this;
    }

    /**
     * Click on Compare Models Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCompareModels1Link() {
        compareModels1.click();
        return this;
    }

    /**
     * Click on Compare Models Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCompareModels2Link() {
        compareModels2.click();
        return this;
    }

    /**
     * Click on Compare Models Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCompareModelsLink() {
        compareModels.click();
        return this;
    }

    /**
     * Click on Compare Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCompareProducts1Link() {
        compareProducts1.click();
        return this;
    }

    /**
     * Click on Compare Products Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCompareProducts2Link() {
        compareProducts2.click();
        return this;
    }

    /**
     * Click on Contact Us Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickContactUsLink() {
        contactUs.click();
        return this;
    }

    /**
     * Click on Create An Account Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCreateAnAccount1Link() {
        createAnAccount1.click();
        return this;
    }

    /**
     * Click on Create An Account Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCreateAnAccount2Link() {
        createAnAccount2.click();
        return this;
    }

    /**
     * Click on Create An Account Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCreateAnAccount3Button() {
        createAnAccount3.click();
        return this;
    }

    /**
     * Click on Create New Account Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickCreateNewAccountLink() {
        createNewAccount.click();
        return this;
    }

    /**
     * Click on Envelope Iconsmall Picture Of An Envelope Signifying Email0click Here To Ask Us A Question. Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickEnvelopeIconsmallPictureOfAnEnvelopeButton() {
        envelopeIconsmallPictureOfAnEnvelope.click();
        return this;
    }

    /**
     * Click on Faq Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFaq1Link() {
        faq1.click();
        return this;
    }

    /**
     * Click on Faq Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFaq2Link() {
        faq2.click();
        return this;
    }

    /**
     * Click on Financing Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickFinancingLink() {
        financing.click();
        return this;
    }

    /**
     * Click on Forgot Your Password Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickForgotYourPasswordLink() {
        forgotYourPassword.click();
        return this;
    }

    /**
     * Click on Go Back Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickGoBackLink() {
        goBack.click();
        return this;
    }

    /**
     * Click on Health Benefits Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHealthBenefitsLink() {
        healthBenefits.click();
        return this;
    }

    /**
     * Click on Highest Rating Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickHighestRatingLink() {
        highestRating.click();
        return this;
    }

    /**
     * Click on 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickILink3() {
        i3.click();
        return this;
    }

    /**
     * Click on 7i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickILink7() {
        i7.click();
        return this;
    }

    /**
     * Click on Indoor Trainer Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickIndoorTrainer1Link() {
        indoorTrainer1.click();
        return this;
    }

    /**
     * Click on Indoor Trainer Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickIndoorTrainer2Link() {
        indoorTrainer2.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore1Link() {
        learnMore1.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore2Link() {
        learnMore2.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore3Link() {
        learnMore3.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore4Link() {
        learnMore4.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore5Link() {
        learnMore5.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore6Link() {
        learnMore6.click();
        return this;
    }

    /**
     * Click on Learn More Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLearnMore7Link() {
        learnMore7.click();
        return this;
    }

    /**
     * Click on Lights Bells Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLightsBells1Link() {
        lightsBells1.click();
        return this;
    }

    /**
     * Click on Lights Bells Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLightsBells2Link() {
        lightsBells2.click();
        return this;
    }

    /**
     * Click on 0 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink0() {
        _0.click();
        return this;
    }

    /**
     * Click on 10 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink10() {
        _10.click();
        return this;
    }

    /**
     * Click on 11 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink11() {
        _11.click();
        return this;
    }

    /**
     * Click on 2 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink2() {
        _2.click();
        return this;
    }

    /**
     * Click on 3 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink3() {
        _3.click();
        return this;
    }

    /**
     * Click on 4 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink4() {
        _4.click();
        return this;
    }

    /**
     * Click on 5 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink5() {
        _5.click();
        return this;
    }

    /**
     * Click on 6 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink6() {
        _6.click();
        return this;
    }

    /**
     * Click on 7 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink7() {
        _7.click();
        return this;
    }

    /**
     * Click on 8 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink8() {
        _8.click();
        return this;
    }

    /**
     * Click on 9 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLink9() {
        _9.click();
        return this;
    }

    /**
     * Click on Locks Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLocks1Link() {
        locks1.click();
        return this;
    }

    /**
     * Click on Locks Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLocks2Link() {
        locks2.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLogIn1Link() {
        logIn1.click();
        return this;
    }

    /**
     * Click on Log In Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLogIn2Link() {
        logIn2.click();
        return this;
    }

    /**
     * Click on Login Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLoginButton1() {
        login1.click();
        return this;
    }

    /**
     * Click on Login Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLoginButton() {
        login1.click();
        return this;
    }

    /**
     * Click on Lowest Rating Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickLowestRatingLink() {
        lowestRating.click();
        return this;
    }

    /**
     * Click on Media Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMediaLink() {
        media.click();
        return this;
    }

    /**
     * Click on Media Relations Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMediaRelationsLink() {
        mediaRelations.click();
        return this;
    }

    /**
     * Click on Menu Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMenuLink() {
        menu.click();
        return this;
    }

    /**
     * Click on Mobilebannernew Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMobilebannernewLink() {
        mobilebannernew.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyAccount1Link() {
        myAccount1.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyAccount2Link() {
        myAccount2.click();
        return this;
    }

    /**
     * Click on My Account Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyAccount3Link() {
        myAccount3.click();
        return this;
    }

    /**
     * Click on My Wish List Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyWishList1Link() {
        myWishList1.click();
        return this;
    }

    /**
     * Click on My Wish List Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickMyWishList2Link() {
        myWishList2.click();
        return this;
    }

    /**
     * Click on Newest Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickNewest1Link() {
        newest1.click();
        return this;
    }

    /**
     * Click on Newest Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickNewest2Link() {
        newest2.click();
        return this;
    }

    /**
     * Click on Next Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickNextLink() {
        next.click();
        return this;
    }

    /**
     * Click on Oldest Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOldestLink() {
        oldest.click();
        return this;
    }

    /**
     * Click on On 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOn3iLink() {
        on3i.click();
        return this;
    }

    /**
     * Click on On Streetstrider 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider3i10Link() {
        onStreetstrider3i10.click();
        return this;
    }

    /**
     * Click on On Streetstrider 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider3i1Link() {
        onStreetstrider3i1.click();
        return this;
    }

    /**
     * Click on On Streetstrider 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider3i2Link() {
        onStreetstrider3i2.click();
        return this;
    }

    /**
     * Click on On Streetstrider 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider3i3Link() {
        onStreetstrider3i3.click();
        return this;
    }

    /**
     * Click on On Streetstrider 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider3i4Link() {
        onStreetstrider3i4.click();
        return this;
    }

    /**
     * Click on On Streetstrider 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider3i5Link() {
        onStreetstrider3i5.click();
        return this;
    }

    /**
     * Click on On Streetstrider 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider3i6Link() {
        onStreetstrider3i6.click();
        return this;
    }

    /**
     * Click on On Streetstrider 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider3i7Link() {
        onStreetstrider3i7.click();
        return this;
    }

    /**
     * Click on On Streetstrider 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider3i8Link() {
        onStreetstrider3i8.click();
        return this;
    }

    /**
     * Click on On Streetstrider 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider3i9Link() {
        onStreetstrider3i9.click();
        return this;
    }

    /**
     * Click on On Streetstrider 3i Blue Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider3iBlueLink() {
        onStreetstrider3iBlue.click();
        return this;
    }

    /**
     * Click on On Streetstrider 7i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider7i1Link() {
        onStreetstrider7i1.click();
        return this;
    }

    /**
     * Click on On Streetstrider 7i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider7i2Link() {
        onStreetstrider7i2.click();
        return this;
    }

    /**
     * Click on On Streetstrider 7i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider7i3Link() {
        onStreetstrider7i3.click();
        return this;
    }

    /**
     * Click on On Streetstrider 7i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider7i4Link() {
        onStreetstrider7i4.click();
        return this;
    }

    /**
     * Click on On Streetstrider 7i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider7i5Link() {
        onStreetstrider7i5.click();
        return this;
    }

    /**
     * Click on On Streetstrider 7i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider7i6Link() {
        onStreetstrider7i6.click();
        return this;
    }

    /**
     * Click on On Streetstrider 7i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider7i7Link() {
        onStreetstrider7i7.click();
        return this;
    }

    /**
     * Click on On Streetstrider 7i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOnStreetstrider7i8Link() {
        onStreetstrider7i8.click();
        return this;
    }

    /**
     * Click on Order Online Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOrderOnlineLink() {
        orderOnline.click();
        return this;
    }

    /**
     * Click on Order Status Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOrderStatusLink() {
        orderStatus.click();
        return this;
    }

    /**
     * Click on Our Story Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOurStoryLink1() {
        ourStory1.click();
        return this;
    }

    /**
     * Click on Our Story Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickOurStoryLink() {
        ourStory1.click();
        return this;
    }

    /**
     * Click on Powered By Olark Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPoweredByOlarkLink() {
        poweredByOlark.click();
        return this;
    }

    /**
     * Click on Previous Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPreviousLink() {
        previous.click();
        return this;
    }

    /**
     * Click on Privacy Policy Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickPrivacyPolicyLink() {
        privacyPolicy.click();
        return this;
    }

    /**
     * Click on Product Reviews Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickProductReviewsLink() {
        productReviews.click();
        return this;
    }

    /**
     * Click on Rack Bags Carrier Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickRackBagsCarrier1Link() {
        rackBagsCarrier1.click();
        return this;
    }

    /**
     * Click on Rack Bags Carrier Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickRackBagsCarrier2Link() {
        rackBagsCarrier2.click();
        return this;
    }

    /**
     * Click on Read More Reviews Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickReadMoreReviews1Link() {
        readMoreReviews1.click();
        return this;
    }

    /**
     * Click on Read More Reviews Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickReadMoreReviews2Link() {
        readMoreReviews2.click();
        return this;
    }

    /**
     * Click on Read More Reviews Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickReadMoreReviews3Link() {
        readMoreReviews3.click();
        return this;
    }

    /**
     * Click on Read More Reviews Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickReadMoreReviews4Link() {
        readMoreReviews4.click();
        return this;
    }

    /**
     * Click on Refurbished Streetstriders Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickRefurbishedStreetstridersLink() {
        refurbishedStreetstriders.click();
        return this;
    }

    /**
     * Click on Return Policy Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickReturnPolicyLink() {
        returnPolicy.click();
        return this;
    }

    /**
     * Click on Reviews Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickReviews1Button() {
        reviews1.click();
        return this;
    }

    /**
     * Click on Reviews Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickReviews2Button() {
        reviews2.click();
        return this;
    }

    /**
     * Click on Reviews Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickReviewsLink() {
        reviews.click();
        return this;
    }

    /**
     * Click on Rollon Hitch Rack Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickRollonHitchRack1Link() {
        rollonHitchRack1.click();
        return this;
    }

    /**
     * Click on Rollon Hitch Rack Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickRollonHitchRack2Link() {
        rollonHitchRack2.click();
        return this;
    }

    /**
     * Click on Sales 18003480998 Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSales18003480998Link() {
        sales18003480998.click();
        return this;
    }

    /**
     * Click on Send Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSend1Button() {
        send1.click();
        return this;
    }

    /**
     * Click on Send Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSend2Button() {
        send2.click();
        return this;
    }

    /**
     * Click on Shipping Information Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShippingInformationLink() {
        shippingInformation.click();
        return this;
    }

    /**
     * Click on Shop Now Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShopNow1Link() {
        shopNow1.click();
        return this;
    }

    /**
     * Click on Shop Now Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShopNow2Link() {
        shopNow2.click();
        return this;
    }

    /**
     * Click on Shop Now Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShopNow3Link() {
        shopNow3.click();
        return this;
    }

    /**
     * Click on Shop Now Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShopNow4Link() {
        shopNow4.click();
        return this;
    }

    /**
     * Click on Shop Now Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickShopNowLink() {
        shopNow.click();
        return this;
    }

    /**
     * Click on Site Reviews Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSiteReviewsLink() {
        siteReviews.click();
        return this;
    }

    /**
     * Click on Start A Live Chat Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickStartALiveChatLink() {
        startALiveChat.click();
        return this;
    }

    /**
     * Click on Streetstrider 3i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickStreetstrider3iLink() {
        streetstrider3i.click();
        return this;
    }

    /**
     * Click on Streetstrider 7i Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickStreetstrider7iLink() {
        streetstrider7i.click();
        return this;
    }

    /**
     * Click on Streetstriders Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickStreetstriders1Link() {
        streetstriders1.click();
        return this;
    }

    /**
     * Click on Streetstriders Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickStreetstriders2Link() {
        streetstriders2.click();
        return this;
    }

    /**
     * Click on Streetstriders Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickStreetstridersLink() {
        streetstriders.click();
        return this;
    }

    /**
     * Click on Submit Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSubmitButton() {
        submit.click();
        return this;
    }

    /**
     * Click on Success Stories Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSuccessStoriesLink() {
        successStories.click();
        return this;
    }

    /**
     * Click on Support Center Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupportCenterLink() {
        supportCenter.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupportLink1() {
        support.click();
        return this;
    }

    /**
     * Click on Support Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickSupportLink() {
        support.click();
        return this;
    }

    /**
     * Click on Targetbay Close Icon Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTargetbayCloseIconLink() {
        targetbayCloseIcon.click();
        return this;
    }

    /**
     * Click on Tires Etc. Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTiresEtcLink() {
        tiresEtc.click();
        return this;
    }

    /**
     * Click on Tires Tubes Etc. Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickTiresTubesEtcLink() {
        tiresTubesEtc.click();
        return this;
    }

    /**
     * Click on Warranty Information Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWarrantyInformationLink() {
        warrantyInformation.click();
        return this;
    }

    /**
     * Click on Watch Video Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWatchVideo1Link() {
        watchVideo1.click();
        return this;
    }

    /**
     * Click on Watch Video Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWatchVideo2Link() {
        watchVideo2.click();
        return this;
    }

    /**
     * Click on Watch Video Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWatchVideo3Link() {
        watchVideo3.click();
        return this;
    }

    /**
     * Click on Watch Video Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWatchVideo4Link() {
        watchVideo4.click();
        return this;
    }

    /**
     * Click on Watchvideos Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWatchvideosLink() {
        watchvideos.click();
        return this;
    }

    /**
     * Click on Water Bottle Cage Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWaterBottleCageLink() {
        waterBottleCage.click();
        return this;
    }

    /**
     * Click on Water Bottle Cages Link.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWaterBottleCagesLink() {
        waterBottleCages.click();
        return this;
    }

    /**
     * Click on Write A Review Button.
     *
     * @return the HomePage class instance.
     */
    public HomePage clickWriteAReviewButton() {
        writeAReview.click();
        return this;
    }

    /**
     * Fill every fields in the page.
     *
     * @return the HomePage class instance.
     */
    public HomePage fill() {
        setYouHaveNoItemsInYourTextField();
        setPleaseGiveRatingToThisSite1RadioButtonField();
        setPleaseGiveRatingToThisSite2RadioButtonField();
        setPleaseGiveRatingToThisSite3RadioButtonField();
        setPleaseGiveRatingToThisSite4RadioButtonField();
        setPleaseGiveRatingToThisSite5RadioButtonField();
        setNameTextField();
        setEmail1EmailField();
        setTitleTextField();
        setReviewTextareaField();
        setEmail2EmailField();
        setPassword1PasswordField();
        setSignUpForNewsletter1TextField();
        setSignUpForNewsletter2TextField();
        setEmail3EmailField();
        setSignUpForNewsletter3CheckboxField();
        setPassword2PasswordField();
        setConfirmPasswordPasswordField();
        setEmail4EmailField();
        setTypeYourNameTextField();
        setTypeYourEmailEmailField();
        setTypeYourPhoneOptionalTelField();
        setPleaseSendUsYourQuestionsOrTextareaField();
        return this;
    }

    /**
     * Fill every fields in the page and submit it to target page.
     *
     * @return the HomePage class instance.
     */
    public HomePage fillAndSubmit() {
        fill();
        return submit();
    }

    /**
     * Set default value to Confirm Password Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setConfirmPasswordPasswordField() {
        return setConfirmPasswordPasswordField(data.get("CONFIRM_PASSWORD"));
    }

    /**
     * Set value to Confirm Password Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setConfirmPasswordPasswordField(String confirmPasswordValue) {
        confirmPassword.sendKeys(confirmPasswordValue);
        return this;
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setEmail1EmailField() {
        return setEmail1EmailField(data.get("EMAIL_1"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setEmail1EmailField(String email1Value) {
        email1.sendKeys(email1Value);
        return this;
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setEmail2EmailField() {
        return setEmail2EmailField(data.get("EMAIL_2"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setEmail2EmailField(String email2Value) {
        email2.sendKeys(email2Value);
        return this;
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setEmail3EmailField() {
        return setEmail3EmailField(data.get("EMAIL_3"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setEmail3EmailField(String email3Value) {
        email3.sendKeys(email3Value);
        return this;
    }

    /**
     * Set default value to Email Email field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setEmail4EmailField() {
        return setEmail4EmailField(data.get("EMAIL_4"));
    }

    /**
     * Set value to Email Email field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setEmail4EmailField(String email4Value) {
        email4.sendKeys(email4Value);
        return this;
    }

    /**
     * Set default value to Name Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setNameTextField() {
        return setNameTextField(data.get("NAME"));
    }

    /**
     * Set value to Name Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setNameTextField(String nameValue) {
        name.sendKeys(nameValue);
        return this;
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPassword1PasswordField() {
        return setPassword1PasswordField(data.get("PASSWORD_1"));
    }

    /**
     * Set value to Password Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPassword1PasswordField(String password1Value) {
        password1.sendKeys(password1Value);
        return this;
    }

    /**
     * Set default value to Password Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPassword2PasswordField() {
        return setPassword2PasswordField(data.get("PASSWORD_2"));
    }

    /**
     * Set value to Password Password field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPassword2PasswordField(String password2Value) {
        password2.sendKeys(password2Value);
        return this;
    }

    /**
     * Set default value to Please Give Rating To This Site Radio Button field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPleaseGiveRatingToThisSite1RadioButtonField() {
        for (WebElement el : pleaseGiveRatingToThisSite1) {
            Object pleaseGiveRatingToThisSite1Value = null;
			if (el.getAttribute("value").equals(pleaseGiveRatingToThisSite1Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Give Rating To This Site Radio Button field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPleaseGiveRatingToThisSite2RadioButtonField() {
        for (WebElement el : pleaseGiveRatingToThisSite2) {
            Object pleaseGiveRatingToThisSite2Value = null;
			if (el.getAttribute("value").equals(pleaseGiveRatingToThisSite2Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Give Rating To This Site Radio Button field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPleaseGiveRatingToThisSite3RadioButtonField() {
        for (WebElement el : pleaseGiveRatingToThisSite3) {
            Object pleaseGiveRatingToThisSite3Value = null;
			if (el.getAttribute("value").equals(pleaseGiveRatingToThisSite3Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Give Rating To This Site Radio Button field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPleaseGiveRatingToThisSite4RadioButtonField() {
        for (WebElement el : pleaseGiveRatingToThisSite4) {
            Object pleaseGiveRatingToThisSite4Value = null;
			if (el.getAttribute("value").equals(pleaseGiveRatingToThisSite4Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Give Rating To This Site Radio Button field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPleaseGiveRatingToThisSite5RadioButtonField() {
        for (WebElement el : pleaseGiveRatingToThisSite5) {
            Object pleaseGiveRatingToThisSite5Value = null;
			if (el.getAttribute("value").equals(pleaseGiveRatingToThisSite5Value)) {
                if (!el.isSelected()) {
                    el.click();
                }
                break;
            }
        }
        return this;
    }

    /**
     * Set default value to Please Send Us Your Questions Or Comment And We Will Get Back To You As Soon As We Are Available Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPleaseSendUsYourQuestionsOrTextareaField() {
        return setPleaseSendUsYourQuestionsOrTextareaField(data.get("PLEASE_SEND_US_YOUR_QUESTIONS_OR"));
    }

    /**
     * Set value to Please Send Us Your Questions Or Comment And We Will Get Back To You As Soon As We Are Available Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setPleaseSendUsYourQuestionsOrTextareaField(String pleaseSendUsYourQuestionsOrValue) {
        pleaseSendUsYourQuestionsOr.sendKeys(pleaseSendUsYourQuestionsOrValue);
        return this;
    }

    /**
     * Set default value to Review Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setReviewTextareaField() {
        return setReviewTextareaField(data.get("REVIEW"));
    }

    /**
     * Set value to Review Textarea field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setReviewTextareaField(String reviewValue) {
        review.sendKeys(reviewValue);
        return this;
    }

    /**
     * Set default value to Sign Up For Newsletter Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setSignUpForNewsletter1TextField() {
        return setSignUpForNewsletter1TextField(data.get("SIGN_UP_FOR_NEWSLETTER_1"));
    }

    /**
     * Set value to Sign Up For Newsletter Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setSignUpForNewsletter1TextField(String signUpForNewsletter1Value) {
        signUpForNewsletter1.sendKeys(signUpForNewsletter1Value);
        return this;
    }

    /**
     * Set default value to Sign Up For Newsletter Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setSignUpForNewsletter2TextField() {
        return setSignUpForNewsletter2TextField(data.get("SIGN_UP_FOR_NEWSLETTER_2"));
    }

    /**
     * Set value to Sign Up For Newsletter Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setSignUpForNewsletter2TextField(String signUpForNewsletter2Value) {
        signUpForNewsletter2.sendKeys(signUpForNewsletter2Value);
        return this;
    }

    /**
     * Set Sign Up For Newsletter Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setSignUpForNewsletter3CheckboxField() {
        if (!signUpForNewsletter3.isSelected()) {
            signUpForNewsletter3.click();
        }
        return this;
    }

    /**
     * Set default value to Title Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setTitleTextField() {
        return setTitleTextField(data.get("TITLE"));
    }

    /**
     * Set value to Title Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setTitleTextField(String titleValue) {
        title.sendKeys(titleValue);
        return this;
    }

    /**
     * Set default value to Type Your Email Email field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setTypeYourEmailEmailField() {
        return setTypeYourEmailEmailField(data.get("TYPE_YOUR_EMAIL"));
    }

    /**
     * Set value to Type Your Email Email field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setTypeYourEmailEmailField(String typeYourEmailValue) {
        typeYourEmail.sendKeys(typeYourEmailValue);
        return this;
    }

    /**
     * Set default value to Type Your Name Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setTypeYourNameTextField() {
        return setTypeYourNameTextField(data.get("TYPE_YOUR_NAME"));
    }

    /**
     * Set value to Type Your Name Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setTypeYourNameTextField(String typeYourNameValue) {
        typeYourName.sendKeys(typeYourNameValue);
        return this;
    }

    /**
     * Set default value to Type Your Phone Optional Tel field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setTypeYourPhoneOptionalTelField() {
        return setTypeYourPhoneOptionalTelField(data.get("TYPE_YOUR_PHONE_OPTIONAL"));
    }

    /**
     * Set value to Type Your Phone Optional Tel field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setTypeYourPhoneOptionalTelField(String typeYourPhoneOptionalValue) {
        typeYourPhoneOptional.sendKeys(typeYourPhoneOptionalValue);
        return this;
    }

    /**
     * Set default value to You Have No Items In Your Shopping Cart Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setYouHaveNoItemsInYourTextField() {
        return setYouHaveNoItemsInYourTextField(data.get("YOU_HAVE_NO_ITEMS_IN_YOUR"));
    }

    /**
     * Set value to You Have No Items In Your Shopping Cart Text field.
     *
     * @return the HomePage class instance.
     */
    public HomePage setYouHaveNoItemsInYourTextField(String youHaveNoItemsInYourValue) {
        youHaveNoItemsInYour.sendKeys(youHaveNoItemsInYourValue);
        return this;
    }

    /**
     * Submit the form to target page.
     *
     * @return the HomePage class instance.
     */
    public HomePage submit() {
        clickCancelButton();
        return this;
    }

    /**
     * Unset Sign Up For Newsletter Checkbox field.
     *
     * @return the HomePage class instance.
     */
    public HomePage unsetSignUpForNewsletter3CheckboxField() {
        if (signUpForNewsletter3.isSelected()) {
            signUpForNewsletter3.click();
        }
        return this;
    }

    /**
     * Verify that the page loaded completely.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageLoaded() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getPageSource().contains(pageLoadedText);
            }
        });
        return this;
    }

    /**
     * Verify that current page URL matches the expected URL.
     *
     * @return the HomePage class instance.
     */
    public HomePage verifyPageUrl() {
        (new WebDriverWait(driver, timeout)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getCurrentUrl().contains(pageUrl);
            }
        });
        return this;
    }
}
