package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.TV;

public class TvSteps {
    private static Logger LOGGER = LogManager.getLogger(TvSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^user navigate to featured video$")
    public void navigateToFeaturedVideo() {
    new TV(driver)
            .navigateToFeaturedVideo();
    }

    @And("^user play feature video and wait a moment$")
    public void playFeatureVideo () throws InterruptedException {
        new TV(driver)
                .playFeatureVideo();
    }

    @Then("^User played featured video from home page$")
    public void validateUserPlayedFeatureVideoSuccessfully() {
        new TV(driver)
                .validateUserPlayedFeatureVideoSuccessfully();
    }
}
