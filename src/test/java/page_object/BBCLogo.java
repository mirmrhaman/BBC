package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BBCLogo extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(page_object.BBCLogo.class);
    public BBCLogo(WebDriver driver) {
        super(driver);
    }
    private static final By BBCLogo = By.xpath("//a[contains(text(),'Homepage')]");
    private static final By Welcome = By.xpath("//span[contains(text(),'Welcome to BBC.com')]");
    private static final By News = By.cssSelector("div[id='orb-nav-links'] li[class='orb-nav-newsdotcom'] a");
    private static final By NewsImage = By.xpath("//div[@class='nw-o-news-branding__logo']");
    private static final By Sport = By.cssSelector("div[id='orb-nav-links'] li[class='orb-nav-sport'] a");
    private static final By SportImage = By.xpath("//a[contains(@class,'sp-c-global-header__logo')]");
    private static final By Travel = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Travel']");
    private static final By TravelImage = By.xpath("//a[@class='branding branding--travel branding--large']");
    private static final By Future = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Future']");
    private static final By FutureImage = By.xpath("//a[@class='branding branding--future branding--large']");

    public BBCLogo clickOnBBCLogo() {
        ActOn.element(driver,BBCLogo).click();
        LOGGER.debug("User clicked on BBC Logo");
        return this;
    }

    public BBCLogo navigateToNewsPage() {
        ActOn.element(driver,News).click();
        LOGGER.debug("User is on News page");
        return this;
    }

    public BBCLogo validateUserOnNewsPage(){
        boolean NEWSLogoDisplayed = driver.findElement(NewsImage).isDisplayed();
        Assert.assertTrue("NEWS Logo is not displayed", NEWSLogoDisplayed);
        LOGGER.debug("User is verified in NEWS page");

        return this;
    }

    public BBCLogo clickOnBBCLogoFromNewsPage() {
        boolean BBCLogoDisplayedFromNews = driver.findElement(Welcome).isDisplayed();
        Assert.assertTrue("Welcome to BBC.com is not displayed", BBCLogoDisplayedFromNews);
        LOGGER.debug("User return to home page from news page");

        return this;
    }

    public BBCLogo navigateToSportPage() {
        ActOn.element(driver,Sport).click();
        LOGGER.debug("User is on Sport page");

        return this;
    }

    public BBCLogo validateUserOnSportPage(){
        boolean SportLogoDisplayed = driver.findElement(SportImage).isDisplayed();
        Assert.assertTrue("SPORT Logo is not displayed", SportLogoDisplayed);
        LOGGER.debug("User is verified in SPORT page");
        return this;
    }

    public BBCLogo clickOnBBCLogoFromSportPage() {
        boolean BBCLogoDisplayedFromSport = driver.findElement(Welcome).isDisplayed();
        Assert.assertTrue("Welcome to BBC.com is not displayed", BBCLogoDisplayedFromSport);
        LOGGER.debug("User return to home page from sport page");
        return this;
    }

    public BBCLogo navigateToTravelPage() {
        ActOn.element(driver,Travel).click();
        LOGGER.debug("User is on Travel page");
        return this;
    }

    public BBCLogo validateUserOnTravelPage(){
        boolean TRAVELLogoDisplayed = driver.findElement(TravelImage).isDisplayed();
        Assert.assertTrue("TRAVEL Logo is not displayed", TRAVELLogoDisplayed);
        LOGGER.debug("User is verified in TRAVEL page");
        return this;
    }

    public BBCLogo clickOnBBCLogoFromTravelPage() {
        boolean BBCLogoDisplayedFromTravel = driver.findElement(Welcome).isDisplayed();
        Assert.assertTrue("Welcome to BBC.com is not displayed", BBCLogoDisplayedFromTravel);
        LOGGER.debug("User return to home page from travel page");
        return this;
    }

    public BBCLogo navigateToFuturePage() {
        ActOn.element(driver,Future).click();
        LOGGER.debug("User is on Future page");
        return this;
    }

    public BBCLogo validateUserOnFuturePage(){
        boolean FUTURELogoDisplayed = driver.findElement(FutureImage).isDisplayed();
        Assert.assertTrue("FUTURE Logo is not displayed", FUTURELogoDisplayed);
        LOGGER.debug("User is verified in FUTURE page");
        return this;
    }

    public BBCLogo clickOnBBCLogoFromFuturePage() {
        boolean BBCLogoDisplayedFromFuture = driver.findElement(Welcome).isDisplayed();
        Assert.assertTrue("Welcome to BBC.com is not displayed", BBCLogoDisplayedFromFuture);
        LOGGER.debug("User return to home page from future page");
        return this;
    }
}
