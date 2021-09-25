package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FollowOnFaceBook extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(FollowOnFaceBook.class);
    public FollowOnFaceBook(WebDriver driver) {
        super(driver);
    }
    String winHandleBefore = driver.getWindowHandle();

    private static final By TravelButton = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Travel']");
    private static final By TravelLogo = By.xpath("//a[@class='branding branding--travel branding--large']");
    private static final By MoreButton = By.xpath("//div[@class='open-nav__icon']");
    private static final By FaceBookLogo = By.xpath("//a[@class='facebook-icon gelicon--facebook facebook-icon--white']");
    private static final By FaceBookBanner = By.xpath("//u[normalize-space()='Facebook']");


    public FollowOnFaceBook userClickedOnTravel() {
        ActOn.element(driver, TravelButton).click();
        LOGGER.debug("User clicked on travel button");
        return this;
    }

    public FollowOnFaceBook validateUserIsInTravelPage() {
        boolean travelLogoDisplayed = driver.findElement(TravelLogo).isDisplayed();
        Assert.assertTrue("User is not on Travel Page", travelLogoDisplayed);
        LOGGER.debug("User is on Travel Page");
        return this;
    }

    public FollowOnFaceBook clickOnMore() {
        ActOn.element(driver, MoreButton).click();
        LOGGER.debug("User navigate to more options");
        return this;
    }

    public FollowOnFaceBook clickOnFaceBookIcon() {
        ActOn.element(driver, FaceBookLogo).click();
        LOGGER.debug("user navigate to follow by Face Book");
        return this;
    }

    public FollowOnFaceBook userInNewWindow() {
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        return this;

    }

    public FollowOnFaceBook validateUserOnFaceBookPage() {
        boolean faceBookPageDisplayed = driver.findElement(FaceBookBanner).isDisplayed();
        Assert.assertTrue("User is not on Face Book Page", faceBookPageDisplayed);
        LOGGER.debug("user is on Face book page");
        return this;
    }
}
