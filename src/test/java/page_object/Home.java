package page_object;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

public class Home extends NavigationBar{
    private static final Logger LOGGER = LogManager.getLogger(Home.class);

    public Home(WebDriver driver) {
        super(driver);
    }

//    private static final By SearchText =By.xpath("//input[@id='orb-search-q']");
//    private static final By SearchButton =By.xpath("//button[@id='orb-search-button']");
//    private static final By SearchTextResult = By.xpath("//input[@value='education']");
//
//    private final By ActualSearchText = By.xpath("//input[@value='education']");

}
//
//    private final By SignIn = By.xpath("//a[@id='idcta-link']");
//
//    public Home(WebDriver driver) {
//        super(driver);
//    }
//
//    // Click on the Sign-in on home page to go on account sigh in page
//    public Home clickHomePageSignIn() {
//        LOGGER.debug("Click on the Sign in on Home Page");
//        ActOn.element(driver,SignIn).click();
//        return this;
//    }
//
//
//}
