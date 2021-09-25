package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.OnAir;

public class OnAirPlaySteps {
    WebDriver driver = Hooks.driver;

    @When("^user navigate to on air$")
    public void navigateToOnAir(){
        new OnAir(driver)
                .navigateToOnAir();
    }

    @And("^user play On Air features$")
    public void clickOnAir() throws InterruptedException {
        new OnAir(driver)
                .clickOnAir();
    }

    @Then("^open and play on air programme$")
    public void validateUserPlayOnLiveProgramme() {
        new OnAir(driver)
                .validateUserPlayOnLiveProgramme();
    }
}