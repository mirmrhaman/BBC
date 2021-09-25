package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class SeleniumGrid_Firefox1 {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeInAwsDocker() {
        FirefoxOptions firefoxOptions =new FirefoxOptions();
        try {
            gridUrl = new URL("http://3.144.39.31/:4444/wd/hub");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        driver = new RemoteWebDriver(gridUrl, firefoxOptions);
        driver.get("https://www.bbc.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}