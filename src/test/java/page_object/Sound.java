package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Sound  extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(Sound.class);
    public Sound(WebDriver driver) {
        super(driver);
    }

    private static final By Sound = By.xpath("//div[@class='orb-footer-primary-links']//a[normalize-space()='Sounds']");
    private static final By SoundImage = By.xpath("//span[@class='sc-c-sounds-nav__logo-link-title']");
    private static final By RadioRelax = By.xpath("//div[normalize-space()='Radio 1 relax']");
    private static final By RadioRelaxImage = By.xpath("//div/span[normalize-space()='RADIO 1 RELAX']");

    public Sound navigateToSoundButton() {
        ActOn.element(driver, Sound).click();
        LOGGER.info("user clicked on sound button on home page");
        return this;
    }

    public Sound validateUserEnterInSoundPageSuccessfully(){
        boolean soundLogoDisplayed = driver.findElement(SoundImage).isDisplayed();
        Assert.assertTrue("Sound logo is not displayed", soundLogoDisplayed);
        LOGGER.info("User is on sounds page");
        return this;
    }

    public Sound playRadioRelax () throws InterruptedException {
        ActOn.element(driver, RadioRelax).click();
        Thread.sleep(20000);
        LOGGER.info("User played Radio Relax 1 and wait to listen for a moment");
        return this;
    }

    public Sound validateRadioRelaxPlayedSuccessfully () {
        Boolean radioRelaxLogoDisplayed = driver.findElement(RadioRelaxImage).isDisplayed();
        Assert.assertTrue("Radio Relax 1 not found", radioRelaxLogoDisplayed);
        LOGGER.info("User played Radio Relax 1 successfully");
        return this;
    }
}
