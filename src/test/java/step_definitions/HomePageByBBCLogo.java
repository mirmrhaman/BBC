package step_definitions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import page_object.BBCLogo;

public class HomePageByBBCLogo {
    private static Logger LOGGER = LogManager.getLogger(HomePageByBBCLogo.class);
    WebDriver driver = Hooks.driver;

    // Precondition
//    @Given("^a user is on the Home page$")


    // Additional Action
    @And("^user click on BBC Logo$")
    public void clickOnBBCLogo() {
        new BBCLogo(driver)
                .clickOnBBCLogo();
    }

    // Main Action
    @When("^user navigate to news page$")
    public void navigateToNewsPage() {
    new BBCLogo(driver)
            .navigateToNewsPage();
    }

    @Then("^user on news page$")
    public void validateUserOnNewsPage(){
        new BBCLogo(driver)
                .validateUserOnNewsPage();
    }

    @Then("^user click on BBC Logo from NEWS page$")
    public void clickOnBBCLogoFromNewsPage() {
    new BBCLogo(driver)
            .clickOnBBCLogoFromNewsPage();
    }

    @When("^user navigate to Sport page$")
    public void navigateToSportPage() {
        new BBCLogo(driver)
                .navigateToSportPage();
    }

    @Then("^user on sport page$")
    public void validateUserOnSportPage(){
    new BBCLogo(driver)
            .validateUserOnSportPage();
    }

    @Then("^user click on BBC Logo from SPORT page$")
    public void clickOnBBCLogoFromSportPage() {
    new BBCLogo(driver)
            .clickOnBBCLogoFromSportPage();
    }

    @When("user navigate to Travel page")
    public void navigateToTravelPage() {
        new BBCLogo(driver)
                .navigateToTravelPage();
    }

    @Then("^user on travel page$")
    public void validateUserOnTravelPage(){
        new BBCLogo(driver)
                .validateUserOnTravelPage();
    }

    @Then("^user click on BBC Logo from TRAVEL page$")
    public void clickOnBBCLogoFromTravelPage() {
        new BBCLogo(driver)
                .clickOnBBCLogoFromTravelPage();
    }

    @When("user navigate to Future page")
    public void navigateToFuturePage() {
    new BBCLogo(driver)
            .navigateToFuturePage();
    }

    @Then("^user on future page$")
    public void validateUserOnFuturePage(){
        new BBCLogo(driver)
                .validateUserOnFuturePage();
    }

    @Then("^user click on BBC Logo from Future page$")
    public void clickOnBBCLogoFromFuturePage() {
        new BBCLogo(driver)
                .clickOnBBCLogoFromFuturePage();
    }
}