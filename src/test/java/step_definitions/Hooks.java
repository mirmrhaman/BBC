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

import javax.swing.text.Utilities;
import java.util.concurrent.TimeUnit;

public class Hooks {
    private static final Logger LOGGER = LogManager.getLogger(Hooks.class);
    static WebDriver driver;

    @Before
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        LOGGER.debug("Launch Chrome Browser");
        ActOn.browser(driver).openBrowser("https://www.bbc.com/");
        String url = ReadConfigFiles.getPropertyValue("BBCUrl");
        ActOn.browser(driver).openBrowser(url);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        LOGGER.debug("Browser is successfully initiated with URL: " + url);
        LOGGER.debug("----------Test Starts----------");
    }

    @After
    public void closeBrowser() {
        driver.quit();
        LOGGER.debug("Close Chrome Browser");
        LOGGER.debug("----------Test Closed----------");
    }
}
