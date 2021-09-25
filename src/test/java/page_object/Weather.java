package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Weather extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(Weather.class);
    public Weather(WebDriver driver) {
        super(driver);
    }
    private static final By EditWeather = By.xpath("//a[normalize-space()='Edit']");
    private static final By SearchCity = By.xpath("//input[@placeholder='Enter city, town or region']");
    private static final By SearchButton = By.xpath("//span[@class='icon icon--search']");
    private static final By NewYorkSelect = By.xpath("//a[normalize-space()='New York, United States']");
    private static final By NewYorkWeather = By.xpath("//h2[normalize-space()='New York Weather']");

    public Weather navigateToEditWeather() {
        ActOn.element(driver, EditWeather).click();
        LOGGER.info("user clicked on edit button in weather");
        return this;
    }

    public Weather enterCityInEditOption(String value) {
        ActOn.element(driver, SearchCity).setValue(value);
        LOGGER.info("User entered name of city is: " + value);
        return this;
    }

    public Weather enterCityInEditOptionAndClick(){
            ActOn.element(driver, SearchButton).click();
            LOGGER.info("user clicked on search to implicit");
            return this;
    }

    public Weather validateUserFindNamesOfLocations () {
        boolean searchResultDisplayed = driver.findElement(NewYorkSelect).isDisplayed();
        Assert.assertTrue(" Search result is not displayed", searchResultDisplayed);
        LOGGER.info("Search result show successfully");
        return this;
    }

    public Weather clickOnNewYork() throws InterruptedException {
        ActOn.element(driver, NewYorkSelect).click();
        LOGGER.info("user select New York location");
        Thread.sleep(3000);
        return this;
    }



    public Weather validateUserSelectedWeatherSuccessfully() {
        boolean newYorkWeatherDisplayed = driver.findElement(NewYorkWeather).isDisplayed();
        Assert.assertTrue("New York is not displayed", newYorkWeatherDisplayed);
        LOGGER.info("User can see New York weather");
        return this;
    }
}
