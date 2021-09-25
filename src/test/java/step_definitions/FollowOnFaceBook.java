package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_object.FollowFaceBook;

    public class FollowOnFaceBook {
        private static Logger LOGGER = LogManager.getLogger(FollowOnFaceBook.class);
        WebDriver driver = Hooks.driver;
        String winHandleBefore = driver.getWindowHandle();
        private static final By FaceBookBanner = By.xpath("//u[normalize-space()='Facebook']");

        @And("^user navigate to travel$")
        public void userClickedOnTravel() {
            new FollowFaceBook(driver)
                    .userClickedOnTravel();
        }

        @Then("^user is in travel page$")
        public void validateUserIsInTravelPage() {
            new FollowFaceBook(driver)
                    .validateUserIsInTravelPage();
        }

        @When("^user navigate to more$")
        public void clickOnMore() {
        new FollowFaceBook(driver)
                .clickOnMore();
        }

        @And("^user click on faceBook icon$")
        public void clickOnFaceBookIcon() {
        new FollowFaceBook(driver)
                .clickOnFaceBookIcon();
        }

        @And("^user is in new window$")
        public void userInNewWindow() {
            new FollowFaceBook(driver)
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