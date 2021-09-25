package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOut extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(SignOut.class);
    public SignOut (WebDriver driver) {
        super(driver);
    }

    private static final By UserId = By.id("idcta-username");
    private static final By SignOut = By.xpath("//span[text()='Sign out']");
    private static final By SignOutMsg = By.cssSelector(".u-padding-bottom-quad");

    public SignOut validateUserIsSignInSuccessfully() {
        boolean userIdDisplayed = driver.findElement(UserId).isDisplayed();
        Assert.assertTrue("User Id is not displayed", userIdDisplayed);
        LOGGER.info("User is in user home page");
        return this;
    }

    public SignOut userInProfileHomePage() {
        boolean userIdDisplayed = driver.findElement(UserId).isDisplayed();
        Assert.assertTrue("User Id is not displayed", userIdDisplayed);
        LOGGER.info("User is in user home page");
        return this;
    }

    public SignOut clickOnProfileName() {
        ActOn.element(driver, UserId).click();
        LOGGER.info("User is entering in profile page");
        return this;
    }

    public SignOut userOnSignOutPage() {
        boolean signOutDisplayed = driver.findElement(SignOut).isDisplayed();
        Assert.assertTrue("Sign out is not displayed", signOutDisplayed);
        LOGGER.info("User is in sign out page");
        return this;
    }

    public SignOut clickOnSignOut() {
        ActOn.element(driver,SignOut).click();
        LOGGER.info("User click on Sign out button");
        return this;
    }

    public SignOut validateUserIsSignOutSuccessfully() {
        boolean signOutMsgDisplayed = driver.findElement(SignOutMsg).isDisplayed();
        Assert.assertTrue("Sing out message is not displayed", signOutMsgDisplayed);
        LOGGER.info("User is in home page");
        return this;
    }
}
