package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.testng.Assert;
import stepdefinition.SharedSD;

public class googleSD {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();


    @Given("^I am on google homepage$")
    public void iAmOnGoogleHomepage() throws InterruptedException {
        Assert.assertEquals(SharedSD.getDriver().getTitle(), "Google");

    }

    @When("^user enters (.+) in google search box$")
    public void userEntersATextInGoogleSearchBox(String search) throws InterruptedException {
        Thread.sleep(3000);
        homePage.enterText(search);

    }


    @Then("^user is navigated to the Search results page$")
    public void userIsNavigatedToTheSearchResultsPage() {
        Assert.assertEquals(loginPage.getGoogleText(),"Next");
    }
}
