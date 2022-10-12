package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver= null;
    @Before
    public static void OpenBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);    }
    @After
    public static void TearDown(){driver.quit();}
}
