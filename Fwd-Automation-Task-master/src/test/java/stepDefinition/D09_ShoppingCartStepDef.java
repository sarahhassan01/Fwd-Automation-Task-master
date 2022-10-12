package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;
import pages.P05_shoppingCart;

import static stepDefinition.Hooks.driver;

public class D09_ShoppingCartStepDef {
    P05_shoppingCart cart=new P05_shoppingCart(driver);
    @When("User click add cart button for two products")
    public void add_product_ToCart() throws InterruptedException {
        cart.AddFirstProductCart();
        cart.AddSecondProductCart();
        Thread.sleep(10000);
    }
    @Then("System add products to cart  and increase rows of Shopping cart table")
    public void Validate_Add_Product_To_Cart_Successfully(){
        SoftAssert soft= new SoftAssert();
        soft.assertTrue(cart.GetCartListQty()>0);
        soft.assertTrue(cart.No_Of_Added_Products()>0);
        soft.assertAll();
    }




}
