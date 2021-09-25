package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(Search.class);

    public Search(WebDriver driver) {
        super(driver);
    }
    private static final By SearchText =By.xpath("//input[@id='orb-search-q']");
    private static final By SearchButton =By.xpath("//button[@id='orb-search-button']");
    private static final By SearchTextResult = By.xpath("//input[@value='education']");
    private final By ActualSearchText = By.xpath("//input[@value='education']");

    public Search enterTextInSearchOption(String value) {
            ActOn.element(driver, SearchText).setValue(value);
            LOGGER.debug("User entered credentials for search is: " + value);
            return this;
    }

    public Search userClickOnSearchButton() {
        ActOn.element(driver,SearchButton).click();
        LOGGER.debug("User clicked on search button successfully");
    return this;
    }

    public Search validateSearchResultPage() {
        boolean searchTextDisplayed = driver.findElement(SearchTextResult).isDisplayed();
        Assert.assertTrue("Text result is not displayed", searchTextDisplayed);
        LOGGER.debug("Text Result Successful");
        return this;
    }
}
