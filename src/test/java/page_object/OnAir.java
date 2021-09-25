package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OnAir  extends NavigationBar{
    private static final Logger LOGGER = LogManager.getLogger(OnAir.class);
    public OnAir(WebDriver driver) {
        super(driver);
    }

    private final By OnAir = By.xpath("//span[normalize-space()='On Air:']");
    private final By Live = By.xpath("//div[@id='onairpanel-container']");
    private final By WorldService = By.xpath("//h1[normalize-space()='World Service - Listen Live - BBC Sounds']");

    public OnAir navigateToOnAir(){
        ActOn.element(driver,OnAir).click();
        LOGGER.debug("user clicked on On Air button");
        return this;
    }

    public OnAir clickOnAir() throws InterruptedException {
        ActOn.element(driver, Live).click();
        Thread.sleep(20000);
        LOGGER.debug("User played on live voice");
    return this;
    }

    public OnAir validateUserPlayOnLiveProgramme() {
        Boolean onLiveProgrammePlayed = driver.findElement(WorldService).isDisplayed();
        Assert.assertTrue("On Live programme is not played", onLiveProgrammePlayed);
        LOGGER.debug("User played On Live programme");
        return this;
    }
}
