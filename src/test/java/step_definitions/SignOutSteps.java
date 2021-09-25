package step_definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.SignOut;

public class SignOutSteps {
//     private static Logger LOGGER = LogManager.getLogger(SignOutSteps.class);
    WebDriver driver = Hooks.driver;

    @Then("^user is navigated to profile home page$")
    public void validateUserIsSignInSuccessfully() {
        new SignOut(driver)
                .validateUserIsSignInSuccessfully();
    }

    // Sign out steps
    @When("^user is on profile home page$")
    public void userInProfileHomePage() {
        new SignOut(driver)
                .userInProfileHomePage();
    }

    @And("^click on profile name$")
    public void clickOnProfileName() {
        new SignOut(driver)
                .clickOnProfileName();
    }

    @When("^user on sign out page$")
    public void userOnSignOutPage() {
        new SignOut(driver)
                .userOnSignOutPage();
    }

    @And("^click on sign out$")
    public void clickOnSignOut() {
        new SignOut(driver)
                .clickOnSignOut();
    }

    @Then("^user get a confirmation sign out message$")
    public void validateUserIsSignOutSuccessfully() {
        new SignOut(driver)
                .validateUserIsSignOutSuccessfully();
    }
}
