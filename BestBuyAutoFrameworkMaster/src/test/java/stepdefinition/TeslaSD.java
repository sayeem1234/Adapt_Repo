package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.testng.Assert;

public class TeslaSD {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @Given("^I am on Tesla homePage$")
    public void goToTeslaHomePage(){
        Assert.assertEquals(SharedSD.getDriver().getCurrentUrl(),"https://www.tesla.com/");
    }
    @When("^I click on (Model3|ModelX|ModelY)$")
    public void clickModel(String model) throws InterruptedException {
        Thread.sleep(3000);
        homePage.clickOnTesla();
    }
    @Then("^I verify that the (Model3|ModelX|ModelY) Logo is present$")
    public void verifyTeslaHeader(String model){
        Assert.assertEquals(loginPage.getTeslaHeader(),"Model X");
    }



}
