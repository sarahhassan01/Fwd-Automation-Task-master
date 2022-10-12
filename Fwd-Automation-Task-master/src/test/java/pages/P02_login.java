package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {

    WebDriver driver;
    public P02_login(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


        @FindBy(linkText = "Log in")
        WebElement LoginLinkLoc;

        @FindBy(id = "Email")
        WebElement EmailLoc;

        @FindBy(id = "Password")
        WebElement PasswordLoc;

        @FindBy( css= ".button-1.login-button")
        WebElement LoginBtnLoc;

        @FindBy(className = "ico-account")
        public WebElement AccountTAbLoc;

    public void LoginSteps(String Email ,String Pass)
   {
           LoginLinkLoc.click();
           EmailLoc.sendKeys(Email);
           PasswordLoc.sendKeys(Pass);
           LoginBtnLoc.click();
   }
}
