package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class P01_register {
    WebDriver driver;
    public P01_register(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Register")
    WebElement RegisterLink;

    @FindBy(id = "FirstName")
    WebElement FirstNameLoc;

    @FindBy(id= "LastName")
    WebElement LastNameLoc;

    @FindBy(name= "DateOfBirthDay")
    WebElement Date_Day_Loc;

    @FindBy(name= "DateOfBirthMonth")
    WebElement Date_Month_Loc;

    @FindBy(name= "DateOfBirthYear")
    WebElement Date_Year_Loc;

    @FindBy(id ="Email" )
    WebElement EmailLoc ;

    @FindBy(id ="Company" )
    WebElement CompanyLoc;

    @FindBy(id ="Password" )
    WebElement PasswordLoc ;

    @FindBy(id ="ConfirmPassword" )
    WebElement ConfirmPasswordLoc;

    @FindBy(id ="register-button" )
    WebElement RegisterBtnLoc;

    @FindBy(xpath = ("//div[@class='result']"))
    public WebElement SuccessMsgLoc;

    public void NavigateToRegistrationPage()
    {
        RegisterLink.click();
    }
    public void RegistrationSteps(String email , String pass )

    {RegisterBtnLoc.click();
        FirstNameLoc.sendKeys("Sara ");
        LastNameLoc.sendKeys("Adel Hassan");
        Select Date_Day_Dropmenu = new Select(Date_Day_Loc);
        Date_Day_Dropmenu.selectByValue("26");
        Select Date_Month_Dropmenu = new Select(Date_Month_Loc);
        Date_Month_Dropmenu.selectByValue("7");
        Select Date_Year_Dropmenu = new Select(Date_Year_Loc);
        Date_Year_Dropmenu.selectByValue("1996");
        EmailLoc.sendKeys(email);
        CompanyLoc.sendKeys("Efreshli for Design");
        PasswordLoc.sendKeys(pass);
        ConfirmPasswordLoc.sendKeys(pass);
        RegisterBtnLoc.click();
    }

}
