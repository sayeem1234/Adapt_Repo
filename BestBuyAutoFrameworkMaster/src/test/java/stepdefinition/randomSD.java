package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.testng.Assert;

public class randomSD {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("^I am on test project homepage$")
    public void goToHomePage(){
        SharedSD.getDriver().getTitle();
        Assert.assertEquals(SharedSD.getDriver().getTitle(),"TestProject Demo");
    }


    @And("^I enter (\\d+) into password field$")
    public void iEnterIntoPasswordField(int num) {
        homePage.enterNumericPass(num);
    }

    @And("^I hit enter$")
    public void iHitEnter() {
        homePage.clickEnterRandom();
    }


    @Then("^I verify I am a registered user$")
    public void iVerifyIAmARegisteredUser() {
        Assert.assertEquals(loginPage.getLogOutMessage(),"Logout");
    }


    @When("^I enter (.+) as first name$")
    public void iEnterNameAsFirstName(String name) {
        homePage.enterFName(name);
    }
}




