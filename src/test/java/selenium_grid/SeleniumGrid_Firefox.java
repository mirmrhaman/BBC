package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.ReadConfigFiles;


import java.net.URL;

public class SeleniumGrid_Firefox {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeInAwsDocker() {
        FirefoxOptions firefoxOptions =new FirefoxOptions();
        String ec2Address = ReadConfigFiles.getPropertyValue("EC2PublicIp");
        try {
            gridUrl = new URL("http://" + ec2Address + ":4444/wd/hub");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        driver = new RemoteWebDriver(gridUrl, firefoxOptions);
        driver.get("https://www.bbc.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}