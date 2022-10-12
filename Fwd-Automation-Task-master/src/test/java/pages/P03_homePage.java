package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static stepDefinition.Hooks.driver;

public class P03_homePage {
    WebDriver driver;
    Actions action;
    Boolean flag;
     int num;
    public P03_homePage(WebDriver driver ) {
        this.driver=driver;
        this.action=new Actions(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "customerCurrency")
    WebElement currencyMenuLoc;

    @FindBy(id="small-searchterms")
    WebElement SearchLoc;

    @FindBy(xpath = "//button[contains(text(),'Search')]")
    WebElement SubmitBtnLoc;
    
    @FindBy(xpath = "//li[@class='active last']/ul/li/a")
    List<WebElement> SubCategoryLoc;

    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li")
    List<WebElement> CategoryMenuLoc;

    @FindBy(xpath = "//div[@id='nivo-slider']/a")
    WebElement SliderLoc;

    @FindBy(className = "facebook")
    WebElement FbLoc;

    @FindBy(className = "twitter")
    WebElement TwitterLoc;

    @FindBy(className = "rss")
    WebElement RssLoc;

    @FindBy(className = "youtube")
    WebElement YoutubeLoc;

    @FindBy(css = "button[class='button-2 add-to-wishlist-button']")
    List<WebElement> FavBtnLoc ;

    @FindBy(css="span[class='price actual-price']")
    List<WebElement> pricesLoc;

    public void ChangeCurrency()
    {
        Select currencyMenuDrop =new Select(currencyMenuLoc);
        currencyMenuDrop.selectByVisibleText("Euro");
    }

    public void SearchForProduct()
    {
        SearchLoc.sendKeys("Apple MacBook");
        SubmitBtnLoc.click();
    }

   public void SelectCatgory(){
        CategoryMenuLoc.get(randommun()).click();
    }

   public void HoverOnSubCategory() throws InterruptedException {
       for (int i = 0; i< SubCategoryLoc.size(); i++){
           System.out.println(SubCategoryLoc.get(i).getText());
           action.moveToElement(SubCategoryLoc.get(i)).perform();
           Thread.sleep(5000);
           }
    }

    public WebElement sliders(int num)
    {
        return (driver.findElement(By.xpath("//div[@id='nivo-slider']/a"+"["+num+"]")));
    }

    public void ClickOnFBIcon() throws InterruptedException {
        FbLoc.click();
        Thread.sleep(2000);
    }
    public void ClickOnTwitterIcon() throws InterruptedException {
        TwitterLoc.click();
        Thread.sleep(2000);
    }
    public void ClickOnRssIcon() throws InterruptedException {
        RssLoc.click();
        Thread.sleep(2000);
    }
    public void ClickOnYoutubeIcon() throws InterruptedException {
        YoutubeLoc.click();
        Thread.sleep(2000);
    }
    public void ClickOnFavIcon(){FavBtnLoc.get(2).click();}
    public boolean CheckChangeCurrency(){
        for(int i=0; i<pricesLoc.size();i++)
             flag = pricesLoc.get(i).getText().contains("€");
        return flag;
    }
/*--------------------------------------------------------------------------------*/
public int randommun(){
    Random rand = new Random();
    System.out.println(CategoryMenuLoc.size());
    int randNum = rand.nextInt(CategoryMenuLoc.size());
    return randNum;
}




}
