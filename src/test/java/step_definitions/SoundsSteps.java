package step_definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.Sound;

public class SoundsSteps {
    WebDriver driver = Hooks.driver;

    @When("^user navigate to sounds$")
    public void navigateToSoundButton() {
    new Sound(driver)
            .navigateToSoundButton();
    }

    @Then("^user is on the sounds page$")
    public void validateUserEnterInSoundPageSuccessfully(){
        new Sound(driver)
                .validateUserEnterInSoundPageSuccessfully();
    }

    @And("^user navigate and play Radio Relax$")
    public void playRadioRelax () throws InterruptedException {
        new Sound(driver)
                .playRadioRelax();
    }

    @Then("^Radio relax played$")
    public void validateRadioRelaxPlayedSuccessfully () {
        new Sound(driver)
                .validateRadioRelaxPlayedSuccessfully();
    }
}
