package stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.P03_homePage;

import java.util.ArrayList;

import static stepDefinition.Hooks.driver;


public class D07_followUsStepDef {
    P03_homePage home=new P03_homePage(driver);
    @When("User click on facebook link")
    public void FB() throws InterruptedException {
        home.ClickOnFBIcon();
        ArrayList tab = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(String.valueOf(tab.get(1)));
    }

    @When("User click on twitter link")
    public void twitter() throws InterruptedException {
        home.ClickOnTwitterIcon();
        ArrayList tab = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(String.valueOf(tab.get(1)));
    }

    @When("User click on rss link")
    public void Rss() throws InterruptedException {
        home.ClickOnRssIcon();
        ArrayList tab = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(String.valueOf(tab.get(1)));
    }

    @When("User click on youtube link")
    public void Youtube() throws InterruptedException {
        home.ClickOnYoutubeIcon();
        ArrayList tab = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window(String.valueOf(tab.get(1)));
    }

    @Then("^\"(.*)\" is opened in new tab$")
    public void Validate_Open_Social_Tab(String linkType){
        switch (linkType) {

            case "facebook":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.facebook.com/nopCommerce");
                break;

            case "twitter":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://twitter.com/nopCommerce");
                break;

            case "rss":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/new-online-store-is-open");
                break;

            case "youtube":
                Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://www.youtube.com/user/nopCommerce");
                break;

        }
    }



}
