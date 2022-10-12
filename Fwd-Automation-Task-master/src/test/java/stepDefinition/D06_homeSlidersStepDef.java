package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.P03_homePage;
import java.time.Duration;
import static stepDefinition.Hooks.driver;

public class D06_homeSlidersStepDef {

    P03_homePage home =new P03_homePage(driver);
    @When("Click on  Slider First picture")
    public void Click_Slider_First_Product(){
        home.sliders(1).click();
    }
   @Then("System redirects to product-Nokia details page")
    public void Details_First_Product_Opened(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean flag =  wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/nokia-lumia-1020"));
        Assert.assertTrue(flag);
    }

    @When("Click on sub Slider Second picture")
    public void Click_Slider_Second_Product(){
        home.sliders(2).click();
    }
    @Then("System redirects to product-Iphone details page")
    public void Details_Second_Product_Opened(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        boolean flag =  wait.until(ExpectedConditions.urlContains("https://demo.nopcommerce.com/iphone-6"));
        Assert.assertTrue(flag);
    }

}
