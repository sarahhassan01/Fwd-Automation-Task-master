package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;
import pages.P04_wishList;

import java.time.Duration;

import static stepDefinition.Hooks.driver;

public class D08_WishlistStepDef {
    P03_homePage home=new P03_homePage(driver);
    P04_wishList wishList=new P04_wishList(driver);

    @When("User click fav-icon for a product")
    public void ClickFavICon() throws InterruptedException {
        home.ClickOnFavIcon();
    }
    @Then("System add them to wishlist page ,display success notification message and increase wishList Quantity")
    public void Validate_Add_Product_To_Wishlist_Successfully() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        if (wishList.CheckSuccessMsg()==true)
            soft.assertTrue(wishList.NotiMsgLoc.getText().contains("The product has been added to your"));
        //wishList.CloseSuccessMsg();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(wishList.NotiMsgLoc));
        soft.assertTrue(wishList.GetWishListQty()>0);
        wishList.ClickOnWishListTab();
        Thread.sleep(10000);
        soft.assertTrue(wishList.CheckQtyInWishListPage()>0);
        soft.assertAll();

    }

}
