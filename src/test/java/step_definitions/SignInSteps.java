package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.SignIn;

import java.util.List;
import java.util.Map;

public class SignInSteps {
    WebDriver driver = Hooks.driver;

    // Precondition
    @Given("^a user is on the Home page$")
    public void navigateToHomePage() {
    }

    @And("^user navigate to Sign in page$")
    public void navigateToSignInPage() {
        new SignIn(driver)
                .clickHomePageSignIn();
    }

    // Main Action
    @When("^user enters userEmail \"(.+?)\" and password \"(.+?)\"$")
    public void enterUserCredentials(String userEmailId, String password) {
        new SignIn(driver)
                .enterUserCredentials(userEmailId, password);
    }

    // Additional Action
    @And("^click on signIn button$")
    public void clickOnSignInButton() {
        new SignIn(driver)
                .clickOnSignInButton();
    }

    // Assertion
    @Then("^user is navigated to user home page$")
    public void validateUserIsSignInSuccessfully() {
        new SignIn(driver)
                .validateUserIsSignInSuccessfully();
    }

    @Then("^user is failed to login with wrong Email$")
    public void validateUserIsFailedToSignInEmail() {
        new SignIn(driver)
                .validateUserIsFailedToSignInEmail();
    }

    @Then("^user is failed to login with wrong password$")
    public void validateUserIsFailedToSignInPassword() {
    new  SignIn (driver)
            .validateUserIsFailedToSignInPassword();
    }

    @When("^user click on Sign in button entering credentials$")
    public void userClickOnSignInButtonEnteringCredentials(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps(String.class, String.class);
        for (Map<String, String> cells : dataTable) {
            new SignIn(driver)
                    .userClickOnSignInButtonOnEnteringEmailCridentials(cells.get("emailId"))
                    .userClickOnSignInButtonOnEnteringPasswordCridentials(cells.get("password"))
                    .userClickOnSignInButtonOnEnteringCridentials();
        }
    }
}
