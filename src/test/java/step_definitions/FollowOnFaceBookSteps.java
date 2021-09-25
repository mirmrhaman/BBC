package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.FollowOnFaceBook;

public class FollowOnFaceBookSteps {
        private static Logger LOGGER = LogManager.getLogger(FollowOnFaceBookSteps.class);
        WebDriver driver = Hooks.driver;
        String winHandleBefore = driver.getWindowHandle();
        private static final By FaceBookBanner = By.xpath("//u[normalize-space()='Facebook']");

        @And("^user navigate to travel$")
        public void userClickedOnTravel() {
            new FollowOnFaceBook(driver)
                    .userClickedOnTravel();
        }

        @Then("^user is in travel page$")
        public void validateUserIsInTravelPage() {
            new FollowOnFaceBook(driver)
                    .validateUserIsInTravelPage();
        }

        @When("^user navigate to more$")
        public void clickOnMore() {
        new FollowOnFaceBook(driver)
                .clickOnMore();
        }

        @And("^user click on faceBook icon$")
        public void clickOnFaceBookIcon() {
        new FollowOnFaceBook(driver)
                .clickOnFaceBookIcon();
        }

        @And("^user is in new window$")
        public void userInNewWindow() {
            new FollowOnFaceBook(driver)
                    .userInNewWindow();
        }

        @Then("^user navigated to Face Book page$")
        public void validateUserOnFaceBookPage() {
            boolean faceBookPageDisplayed = driver.findElement(FaceBookBanner).isDisplayed();
            Assert.assertTrue("User is not on Face Book Page", faceBookPageDisplayed);
            LOGGER.info("user is on Face book page");

            driver.close();
            driver.switchTo().window(winHandleBefore);
        }
}