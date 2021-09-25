package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignIn extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(SignIn.class);

    private final By SignInTab = By.xpath("//a[@id='idcta-link']"); //call from home
    private final By SignInButton = By.xpath("//button[@id='submit-button']");
    private final By ActualProfileName = By.xpath("//div[@id='idcta-statusbar']");
    private static final By EmailId = By.xpath("//input[@id='user-identifier-input']");
    private static final By Password = By.xpath("//input[@id='password-input']");
    private static final By SignIn = By.xpath("//button[@id='submit-button']");
    private static final By UserId = By.id("idcta-username");
    private static final By InvalidEmail = By.xpath("//p[@class='form-message__text']");
    private static final By InvalidPassword = By.xpath("//div[@id='form-message-password']");

    public SignIn(WebDriver driver) {
        super(driver);
    }

    public SignIn clickHomePageSignIn() {
        LOGGER.debug("Click on the Sign in on Home Page");
        ActOn.element(driver,SignInTab).click();
        return this;
    }
    // Wait for the Sign in page to open
    public SignIn waitForPageToLoad() {
        LOGGER.debug("Wait for the Sign in page to load");
        ActOn.wait(driver, SignInButton).waitForElementToBeVisible();
        return this;
    }

    public SignIn typeEmailId(String value) {
        LOGGER.debug("Entered Email Id is: " + value);
        ActOn.element(driver, EmailId).setValue(value);
        return this;
    }

    public SignIn typePassword(String value) {
        LOGGER.debug("Entered Password is: " + value);
        ActOn.element(driver, Password).setValue(value);
        return this;
    }

    //Main Action

    public SignIn enterUserCredentials(String userEmailId, String password) {
        ActOn.element(driver, EmailId).setValue(userEmailId);
        ActOn.element(driver, Password).setValue(password);
        LOGGER.info("User entered credentials");
        return this;
    }

    // Click on Sign in Button
    public SignIn clickOnSignInButton() {
        ActOn.element(driver, SignIn).click();
        LOGGER.debug("user clicked on Sign in button");
        return this;
    }

    // Assertion
    public SignIn validateSignInPage(String expectedText) {
        String profileName =ActOn.element(driver, ActualProfileName).getTextValue();
        LOGGER.debug("Validate Status Text is: " + expectedText);
        Assert.assertEquals("Actual Text is not match with Expected Text", expectedText, profileName);
        return this;
    }
    public SignIn validateUserIsSignInSuccessfully() {
        boolean userIdDisplayed = driver.findElement(UserId).isDisplayed();
        Assert.assertTrue("User Id is not displayed", userIdDisplayed);
        LOGGER.info("User is in user home page");
        return this;
    }

    public SignIn validateUserIsFailedToSignInEmail() {
        boolean invalidEmail = driver.findElement(InvalidEmail).isDisplayed();
        Assert.assertTrue("Invalid Email is not displayed", invalidEmail);
        LOGGER.info("User is still in the sign in page");
        return this;
    }

    public SignIn validateUserIsFailedToSignInPassword() {
        boolean invalidPassword = driver.findElement(InvalidPassword).isDisplayed();
        Assert.assertTrue("Invalid Password in not displayed", invalidPassword);
        LOGGER.info("User is still in the sign in page");
        return this;
    }
    public SignIn userClickOnSignInButtonOnEnteringEmailCridentials(String value){
        ActOn.element(driver, EmailId).setValue(value);
        LOGGER.debug("User entered Email Id is: " + value);
        return this;
    }

    public SignIn userClickOnSignInButtonOnEnteringPasswordCridentials(String value) {
        ActOn.element(driver, Password).setValue(value);
        LOGGER.debug("User entered Password is: " + value);
        return this;
    }

    public SignIn userClickOnSignInButtonOnEnteringCridentials () {
        ActOn.element(driver, SignIn).click();
        LOGGER.info("user has clicked on sign in button");
        return this;
    }
}


