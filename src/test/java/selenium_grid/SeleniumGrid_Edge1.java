package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class SeleniumGrid_Edge1 {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeInAwsDocker() {
        EdgeOptions edgeOptions = new EdgeOptions();
        try {
            gridUrl = new URL("http://100.26.182.142:4444/wd/hub");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        driver = new RemoteWebDriver(gridUrl, edgeOptions);
        driver.get("https://www.bbc.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}