package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.P03_homePage;

import static stepDefinition.Hooks.driver;

public class D04_searchStepDef {
    P03_homePage home = new P03_homePage(driver);


    @When("Search")
    public void UserSearchProduct() throws InterruptedException {
        Thread.sleep(5000);
        home.SearchForProduct();

    }
   @Then("system redirects to search result page")
    public void RedirectToSearchResult(){
        Assert.assertEquals("https://demo.nopcommerce.com/search?q=Apple+MacBook",driver.getCurrentUrl());
    }

}
