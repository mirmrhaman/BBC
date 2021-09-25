package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TV extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(TV.class);
    public TV(WebDriver driver) {
        super(driver);
    }
    private static final By FeaturedVideo = By.xpath("//*[@id='video']/div[1]");
    private static final By FeaturedVideoText = By.xpath("//span[@class='module__title__link tag tag--default']");

    public TV navigateToFeaturedVideo() {
        ActOn.element(driver, FeaturedVideoText).click();
        LOGGER.info("User clicked on featured video on home page");
        return this;
    }

    public TV playFeatureVideo () throws InterruptedException {
        ActOn.element(driver, FeaturedVideo).click();
        Thread.sleep(50000);
        LOGGER.info("User played a feature video and wait for a moment");
        return this;
    }

    public TV validateUserPlayedFeatureVideoSuccessfully() {
        boolean featureVideoTextDisplayed = driver.findElement(FeaturedVideoText).isDisplayed();
        Assert.assertTrue("Feature video not played", featureVideoTextDisplayed);
        LOGGER.info("User played feature video");
        return this;
    }
}
