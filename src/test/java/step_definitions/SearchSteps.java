package step_definitions;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import page_object.Search;

import java.util.List;
import java.util.Map;

public class SearchSteps {
    WebDriver driver =Hooks.driver;

    @When("^user enter text on search$")
    public void enterTextInSearchOption(DataTable table) {
        List<Map<String, String>> dataTable = table.asMaps(String.class, String.class);
        for (Map<String,String> cells: dataTable) {
            new Search(driver)
                    .enterTextInSearchOption(cells.get("SearchText"));
         }
    }

    @And("^click on search button$")
    public void userClickOnSearchButton() {
    new Search(driver)
            .userClickOnSearchButton();
    }

    @Then("^user is navigated to result is education")
    public void validateSearchResultPage() {
        new Search(driver)
                .validateSearchResultPage();
    }
}
