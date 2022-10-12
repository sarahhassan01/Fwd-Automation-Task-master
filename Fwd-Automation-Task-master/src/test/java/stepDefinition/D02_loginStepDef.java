package stepDefinition;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P02_login;
import static stepDefinition.Hooks.driver;

public class D02_loginStepDef {
    SoftAssert soft =new SoftAssert();
    P02_login login = new P02_login(driver);

    //Login by valid email and password
    @When("^user Enter valid data in \"(.*)\" and \"(.*)\"$")
    public  void UserCanLogin(String Email ,String Password) {
        login.LoginSteps(Email,Password);
    }

    @Then("system redirects to Home page and system display Account tab")
    public void SuccessAssertion()
    {
        soft.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/","System Redirects successfully to home page");
        Boolean Flag=login.AccountTAbLoc.isDisplayed();
        soft.assertTrue(Flag,"Account tab displayed successfully");
        soft.assertAll();
    }
}


