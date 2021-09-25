package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.*;
import java.awt.*;

public class ParentalGuidanceLockSteps {
    private static Logger LOGGER = LogManager.getLogger(ParentalGuidanceLockSteps.class);
    WebDriver driver = Hooks.driver;

    private static final By ParentalGuidance = By.xpath("//a[contains(text(),'Parental Guidance')]");
    private static final By ParentalControls = By.xpath("//h1[contains(normalize-space(),'Parental Controls')]");
    private static final By TurnOnPgLock = By.xpath("//button[contains(normalize-space(),'Turn on PG Lock')]");
    private static final By TurnOffPgLock = By.xpath("//span[contains(text(),'Turn off PG Lock')]");
    private static final By PinInfoPage = By.xpath("//div[@id='needPINinfo']");
    private static final By Pin = By.xpath("//input[@id='pinEntryInputBox']");
    private static final By TurnOff = By.xpath("//a[@id='pgTurnOff']");
    private static final By GuidencePopUp = By.cssSelector("#guidancePopup");
    private static final By AgeConfirmation = By.cssSelector("#ageConfirmCheck");
    private static final By Confirmation = By.xpath("//button[contains(text(),'Age confirmation check box. Check to confirm you a')]");
    private static final By AgeContinue = By.cssSelector("#pgAgeContinue");


    @When("^user navigate to parental guidance$")
    public void navigateToParentalGuidancePage() {
        ActOn.element(driver, ParentalGuidance).click();
        LOGGER.info("User navigate to parental guidance page");
    }

    @Then("^user is on parental guidance page$")
    public void userOnParentalGuidancePage() {
    boolean parentalControlDisplayed = driver.findElement(ParentalControls).isDisplayed();
        Assert.assertTrue("Parental Guidance is not displayed", parentalControlDisplayed);
        LOGGER.info("User in Parental Guidance Page");
    }

    @And("^user click on PG Lock button$")
    public void userClickOnPgLockButton() {
        ActOn.element(driver, TurnOnPgLock).click();
        LOGGER.info("User click on PG Lock Button");
    }

    @And("^user check on age confirmation$")              //Only works when checked manually
    public void checkOnAgeConfirmation() throws InterruptedException, AWTException {
        driver.findElement(Confirmation).sendKeys(String.valueOf(Keys.SPACE));
        ActOn.element(driver,AgeContinue).click();
        Thread.sleep(2000);
        LOGGER.info("User confirm agr 16 and over");
    }

    @And("^user click on Turn off PG button$")              // Only works when click manually
    public void userClickOnTurnOffPgButton() {
        ActOn.element(driver, TurnOffPgLock).click();
        LOGGER.info("User click on Turn off PG Lock Button");
    }

    @Then("^user see parental guidance lock$")
    public void userSeeParentalGuidanceLock() {
        boolean pinInfoDisplayed = driver.findElement(PinInfoPage).isDisplayed();
        Assert.assertTrue("PIN info page is not displayed", pinInfoDisplayed);
        LOGGER.info("User is in PIN info page");
    }

    @When("^user enter password \"(.+?)\"$")                // Enters password manually
    public void userEntersPin(String PIN) {
        ActOn.element(driver, Pin).setValue(PIN);
        LOGGER.info("User entered credentials");
    }

    @And("^user click on unlock$")                      // Clicked Manually
    public void userClickOnUnlock() {
        ActOn.element(driver, TurnOff).click();
        LOGGER.info("User clicked on Unlock button");
    }

    @Then("^user see turn on PG lock button$")
    public void userSeeTurnOnPgLock() {
        boolean turnOnPgLockDisplayed = driver.findElement(TurnOnPgLock).isDisplayed();
        Assert.assertTrue("Turn on PG Lock button is not displayed", turnOnPgLockDisplayed);
        LOGGER.info("User is in Turn off page");
    }
}
