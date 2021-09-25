package page_object;

import command_providers.ActOn;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(NavigationBar.class);
    public WebDriver driver;
    public NavigationBar(WebDriver driver) {
        this.driver = driver;
    }
    private final By BBCLogo = By.xpath("//a[text()='Homepage']");

    // Navigate to Home Page
    public NavigationBar navigateToHomePage () {
        ActOn.browser(driver).openBrowser("https://www.bbc.com/");
        LOGGER.info("user is on home page");
        return this;
    }
}
