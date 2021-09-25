package step_definitions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.Language;

public class LanguageSelectionSteps {
    private static Logger LOGGER = LogManager.getLogger(LanguageSelectionSteps.class);
    WebDriver driver = Hooks.driver;

    @When("^user click on Bangla on language$")
    public void navigateToBanglaInLanguase () {
        new Language(driver)
                .navigateToBanglaInLanguase();
    }

    @Then("^user on Bengali service page$")
    public void validateUserOnBanglaServicePage () {
        new Language(driver)
                .validateUserOnBanglaServicePage();
    }

    @When("^user click on Hindi on language$")
    public void navigateToHindiInLanguase () {
    new Language(driver)
            .navigateToHindiInLanguase();
    }

    @Then("^user on Hindi service page$")
    public void validateUserOnHindiServicePage () {
    new Language(driver)
            .validateUserOnHindiServicePage();
    }
}