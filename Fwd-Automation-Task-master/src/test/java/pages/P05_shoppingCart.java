package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

import static pages.P04_wishList.ConvertString_ToInt;

public class P05_shoppingCart {
    WebDriver driver;
    WebDriverWait wait;
    public P05_shoppingCart(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        PageFactory.initElements(driver,this);
    }


    @FindBy(css="button[class='button-2 product-box-add-to-cart-button']")
    List<WebElement> AddCartBtnLoc;

    @FindBy(id="add-to-cart-button-4")
    WebElement CartBtnLoc;

    @FindBy(id="bar-notification")
    WebElement NotifMsg_FristPLoc;

    @FindBy(id="topcartlink")
    WebElement cartPgeLoc;

    @FindBy(css="button[name='continueshopping']")
    WebElement ContinueShopBtnLoc;

    @FindBy(css = "div[class='bar-notification success']")
    WebElement NotifMsg_SecondPLoc;

    @FindBy(css = "table[class='cart'] tbody tr")
    List<WebElement> No_OfAddedProducts;

    @FindBy(css= "span[class='cart-qty']")
    WebElement cartQtyLoc;

    public void AddFirstProductCart(){
        AddCartBtnLoc.get(1).click();
        CartBtnLoc.click();
        wait.until(ExpectedConditions.invisibilityOf(NotifMsg_FristPLoc));
        cartPgeLoc.click();
        ContinueShopBtnLoc.click();
    }
    public void AddSecondProductCart(){
        AddCartBtnLoc.get(2).click();
        wait.until(ExpectedConditions.invisibilityOf(NotifMsg_SecondPLoc));
        cartPgeLoc.click();
    }
    public int GetCartListQty(){ return ConvertString_ToInt(cartQtyLoc.getText());}

    public int No_Of_Added_Products(){
       return No_OfAddedProducts.size();
    }
}
