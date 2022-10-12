package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static stepDefinition.Hooks.driver;

public class P04_wishList {
    WebDriver driver;
    public P04_wishList(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "bar-notification")
    public WebElement NotiMsgLoc;

    @FindBy (className = "close")
    WebElement NotiMsgCloseBtnLoc;

    @FindBy(className = "wishlist-qty")
    WebElement WishListQtyLoc;

    @FindBy(className = "ico-wishlist")
    WebElement WishListTabLoc;

    @FindBy(css = "td[class='quantity']>input")
    WebElement QtyvalueLoc;


    public boolean CheckSuccessMsg(){return NotiMsgLoc.isDisplayed();}
    public void CloseSuccessMsg(){ NotiMsgCloseBtnLoc.click();}
    public int GetWishListQty(){
        return ConvertString_ToInt(WishListQtyLoc.getText());
    }
    public int CheckQtyInWishListPage(){
        return Integer.parseInt(QtyvalueLoc.getAttribute("value"));
    }
    public void ClickOnWishListTab(){WishListTabLoc.click();}

    public static int ConvertString_ToInt(String text){
        String NewText =text.replaceAll("[^0-9]","");
        return Integer.parseInt(NewText);
    }



}
