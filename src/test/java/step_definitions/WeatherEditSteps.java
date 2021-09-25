package step_definitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.Weather;
import java.util.List;
import java.util.Map;

public class WeatherEditSteps {
    WebDriver driver = Hooks.driver;

    @And("^user navigate to edit in weather$")
    public void navigateToEditWeather() {
        new Weather(driver)
                .navigateToEditWeather();
    }

    @When("^user enter location and click$")
    public void enterCityInEditOption(DataTable table){
        List<Map<String, String>> dataTable = table.asMaps(String.class, String.class);
        for (Map<String, String> cells: dataTable){
            new Weather(driver)
                    .enterCityInEditOption(cells.get("SearchCity"))
                    .enterCityInEditOptionAndClick();
        }
    }

    @Then("^user find result location options$")
    public void validateUserFindNamesOfLocations () {
        new Weather(driver)
                .validateUserFindNamesOfLocations();
    }

    @And("^user click on New York, United States$")
    public void clickOnNewYork() throws InterruptedException {
        new Weather(driver)
                .clickOnNewYork();
    }

    @Then("^user is on New York weather$")
    public void validateUserSelectedWeatherSuccessfully() {
        new Weather(driver)
                .validateUserSelectedWeatherSuccessfully();
    }
}
