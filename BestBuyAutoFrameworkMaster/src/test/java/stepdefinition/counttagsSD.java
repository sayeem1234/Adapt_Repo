package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class counttagsSD {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Given("^I am on home page$") //these are the  glucodes that are defined in the SD file and match to the BDD feature file
    public void iAmOnHomePage() {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Facebook - Log In or Sign Up", "Invalid Home Page");
    }

    @Then("^I verify that the number of a tags is greater than 0$")
    public void iVerifyThatTheNumberOfATagsIsGreaterThan() {
        int numberofLink = SharedSD.getDriver().findElements(By.tagName("select")).size();
        System.out.println(numberofLink + " number of links on this page");
        Assert.assertTrue(numberofLink>0);

    }
}
