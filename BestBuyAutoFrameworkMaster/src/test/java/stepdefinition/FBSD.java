package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.testng.Assert;

public class FBSD {
    private LoginPage loginPage = new LoginPage();
    private HomePage homePage = new HomePage();


    @When("^I enter (.+) into email$")
    public void iEnterIntoEmail(String email) {
        homePage.enterEmail(email);
    }

    @When("^I enter (.+) into password$")
    public void iEnterIntoPass(String pass){
        homePage.enterPassword(pass);
    }

    @And("^I click login$")
    public void clickLogin(){
        homePage.clickOnLoginButton();
    }
    @Then("^I verify that I am on the HomePage$")
    public void verifyHomePage(){
        Assert.assertEquals(loginPage.getPageHeader(),"Welcome to Fb");
    }
}
