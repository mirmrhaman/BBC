package selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import utilities.ReadConfigFiles;

import java.net.URL;

public class SeleniumGrid_Edge {
    WebDriver driver;
    URL gridUrl;

    @Test
    public void executeInAwsDocker() {
        EdgeOptions edgeOptions = new EdgeOptions();
        String ec2Address = ReadConfigFiles.getPropertyValue("EC2PublicIp");
        try {
            gridUrl = new URL("http://" + ec2Address + ":4444/wd/hub");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        driver = new RemoteWebDriver(gridUrl, edgeOptions);
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}