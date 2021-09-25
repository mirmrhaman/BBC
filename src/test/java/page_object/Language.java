package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Language extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(Language.class);
    public Language(WebDriver driver) {
        super(driver);
    }

    private static final By Bangla = By.xpath("//span[normalize-space()='Bangla']");
    private static final By BengaliServiceLink = By.xpath("//div[@class='e1sc39s40 bbc-1te4z4k e1wgjeuw2']//a[@class='bbc-1ox36wn e1wgjeuw1']");
    private static final By Hindi = By.cssSelector("a[title='Hindi service'] span[class='ws-language__english']");
    private static final By HindiServiceLink = By.xpath("//div[@class='e1sc39s40 bbc-1te4z4k e1wgjeuw2']//a[@class='bbc-s5nuwe e1wgjeuw1']");

    public Language navigateToBanglaInLanguase () {
        ActOn.element(driver,Bangla).click();
        LOGGER.info("User clicked on Bangla in Language");
        return this;
    }

    public Language validateUserOnBanglaServicePage () {
        boolean BBCDisplayedInBanglaService = driver.findElement(BengaliServiceLink).isDisplayed();
        Assert.assertTrue("BBC NEWS|Bangla is not displayed",BBCDisplayedInBanglaService);
        LOGGER.info("User successfully getting Bangla services");
        return this;
    }

    public Language navigateToHindiInLanguase () {
        ActOn.element(driver,Hindi).click();
        LOGGER.info("User clicked on Hindi in Language");
        return this;
    }

    public Language validateUserOnHindiServicePage () {
        boolean BBCDisplayedInHindiService = driver.findElement(HindiServiceLink).isDisplayed();
        Assert.assertTrue("BBC NEWS|Hindi is not displayed", BBCDisplayedInHindiService);
        LOGGER.info("User successfully getting Hindi services");
        return this;
    }
}
