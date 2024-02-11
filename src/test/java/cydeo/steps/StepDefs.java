package cydeo.steps;

import static org.junit.Assert.fail;

import cydeo.pages.EtsyPage;
import cydeo.utilities.BrowserUtils;
import cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;


public class StepDefs {

    EtsyPage etsy=new EtsyPage();

    @Given("^I am on the home page$")
    public void i_am_on_the_home_page() throws Throwable {
        System.out.println("I am the home page");

        System.out.println("**********************************************");
        System.out.println("*** URL is OPENED THROUGH THE HOOK CLASS******");
        System.out.println("**********************************************");
        BrowserUtils.waitFor(2);
        //Selenium GRid works like US Student
        Driver.getDriver().navigate().refresh(); // US Student -->
     //   etsy.accept.click(); //  EU Student
        BrowserUtils.waitFor(2);

    }

    @When("^I search for \"([^\"]*)\"$")
    public void i_search_for(String search) throws Throwable {
        etsy.searchBox.sendKeys(search + Keys.ENTER);
    }

    @Then("^I should see the results$")
    public void i_should_see_the_results() throws Throwable {
        BrowserUtils.sleep(2);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("search"));
    }

    @Then("^I should see more results$")
    public void i_should_see_more_results() throws Throwable {
        BrowserUtils.sleep(2);
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("search"));
    }
    @When("user lands on page")
    public void user_lands_on_page() {
        System.out.println("------google acilmalmasi gerek-----");

        System.out.println("ramazan");
//


        etsy.popUp.click();


   //     WebElement searchBox = Driver.getDriver().findElement(By.id("APjFqb"));
      //  searchBox.sendKeys("haberler",Keys.ENTER);
        Assert.assertTrue(Driver.getDriver().getTitle().contains("haberler"));
        System.out.println("Mission Completed Succesfully");
    }


}
