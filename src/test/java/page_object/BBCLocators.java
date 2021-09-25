package page_object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BBCLocators extends NavigationBar {
    private static final Logger LOGGER = LogManager.getLogger(BBCLocators.class);

    public BBCLocators(WebDriver driver) {
        super(driver);
    }

    private final By SignInButton = By.xpath("//button[@id='submit-button']");



}
