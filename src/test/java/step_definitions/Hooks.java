package step_definitions;

import command_providers.ActOn;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.ReadConfigFiles;

public class Hooks {
    private static final Logger LOGGER = LogManager.getLogger(Hooks.class);
    static WebDriver driver;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.info("Launch Chrome Browser");
        ActOn.browser(driver).openBrowser("https://www.bbc.com/");
        String url = ReadConfigFiles.getPropertyValue("BBCUrl");
        ActOn.browser(driver).openBrowser(url);
        LOGGER.info("Browser is successfully initiated with URL: " + url);
    }

    @After
    public void closeBrowser() {
        driver.quit();
        LOGGER.info("Close Chrome Browser");
    }
}
