package step_definitions;

import command_providers.ActOn;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.Map;

public class SharedBBCLinkByMailSteps {
    private static Logger LOGGER = LogManager.getLogger(SharedBBCLinkByMailSteps.class);
    WebDriver driver = Hooks.driver;
    String winHandleBefore = driver.getWindowHandle();

    private static final By TravelButton = By.xpath("//div[@id='orb-nav-links']//a[normalize-space()='Travel']");
    private static final By TravelLogo = By.xpath("//a[@class='branding branding--travel branding--large']");
    private static final By EmailShare = By.xpath("//div[@class='article-share-tools']//a[@class='email-icon gelicon--mail']3");
    private static final By ToEmail = By.xpath("//textarea[@id=':o6']");
    private static final By Send = By.xpath("//div[@id=':oy']");
    private static final By AboutUs = By.xpath("//p[normalize-space()='About us']");

    @When("^user navigate to about us$")
    public void clickOnAboutUs () {
        ActOn.element(driver, AboutUs).click();
        LOGGER.info("User navigate to About us");
    }

    @When("^user navigate to share mail$")
    public void clickOnMail () {
        ActOn.element(driver, EmailShare).click();
        LOGGER.info("user navigate to share by email");
    }

    @When("^user enters email Id$")
    public void enterEmailId (DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps(String.class, String.class);
        for (Map<String,String> cells: dataTable) {
            ActOn.element(driver, EmailShare).setValue(cells.get("Email"));
            LOGGER.info("User enters Email Id successfully");
        }
    }

    @And("^user clicks on send button$")
    public void userClicksOnSend() {
        ActOn.element(driver, Send).click();
        LOGGER.info("User clicked on send button");
        driver.switchTo().window(winHandleBefore);
    }
}
