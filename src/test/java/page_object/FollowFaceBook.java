package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FollowFaceBook extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(FollowFaceBook.class);
    public FollowFaceBook(WebDriver driver) {
        super(driver);
    }
    String winHandleBefore = driver.getWindowHandle();

    private static final By TravelButton = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Travel']");
    private static final By TravelLogo = By.xpath("//a[@class='branding branding--travel branding--large']");
//    private static final By EmailShare = By.xpath("//div[@class='article-share-tools']//div[@id='EmailIcon']");
//    private static final By ToEmail = By.xpath("//textarea[@id=':o6']");
//    private static final By Send = By.xpath("//div[@id=':oy']");
//    private static final By AboutUs = By.xpath("//p[normalize-space()='About us']");
    private static final By MoreButton = By.xpath("//div[@class='open-nav__icon']");
    private static final By FaceBookLogo = By.xpath("//a[@class='facebook-icon gelicon--facebook facebook-icon--white']");
    private static final By FaceBookBanner = By.xpath("//u[normalize-space()='Facebook']");


    public FollowFaceBook userClickedOnTravel() {
        ActOn.element(driver, TravelButton).click();
        LOGGER.info("User clicked on travel button");
        return this;
    }

    public FollowFaceBook validateUserIsInTravelPage() {
        boolean travelLogoDisplayed = driver.findElement(TravelLogo).isDisplayed();
        Assert.assertTrue("User is not on Travel Page", travelLogoDisplayed);
        LOGGER.info("User is on Travel Page");
        return this;
    }

    public FollowFaceBook clickOnMore() {
        ActOn.element(driver, MoreButton).click();
        LOGGER.info("User navigate to more options");
        return this;
    }

    public FollowFaceBook clickOnFaceBookIcon() {
        ActOn.element(driver, FaceBookLogo).click();
        LOGGER.info("user navigate to follow by Face Book");
        return this;
    }

    public FollowFaceBook userInNewWindow() {
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return this;

    }
}
