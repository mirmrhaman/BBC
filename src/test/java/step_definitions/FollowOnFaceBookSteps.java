package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.FollowOnFaceBook;

public class FollowOnFaceBookSteps {
        WebDriver driver = Hooks.driver;
        String winHandleBefore = driver.getWindowHandle();

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
            new FollowOnFaceBook(driver)
                    .validateUserOnFaceBookPage();
            driver.close();
            driver.switchTo().window(winHandleBefore);
        }
}