package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.P03_homePage;

import static stepDefinition.Hooks.driver;

public class D05_hoverCategoriesStepDef {
    P03_homePage home = new P03_homePage(driver);

    //Performing the mouse hover action on the target element.

    @Given("Select computer category")
    public void SelectCategory() throws InterruptedException {
        home.SelectCatgory();
    }

    @When("hover on sub category")
    public void HoverSubCategory() throws InterruptedException {
          home.HoverOnSubCategory();
        }
}
