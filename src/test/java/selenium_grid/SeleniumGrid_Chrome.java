package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.ReadConfigFiles;


import java.net.URL;

public class SeleniumGrid_Chrome {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeInAwsDocker() {
        ChromeOptions chromeOptions = new ChromeOptions();
        String ec2Address = ReadConfigFiles.getPropertyValue("EC2PublicIp");
        try {
            gridUrl = new URL("http://" + ec2Address + ":4444/wd/hub");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        driver = new RemoteWebDriver(gridUrl, chromeOptions);
        driver.get("https://www.bbc.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}