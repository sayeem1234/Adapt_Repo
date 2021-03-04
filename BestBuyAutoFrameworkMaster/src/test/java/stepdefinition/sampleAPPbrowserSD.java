package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.HomePage;
import framework.webPages.LoginPage;
import org.testng.Assert;

public class sampleAPPbrowserSD {

    String creditCardNumber = "";

    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();

    @When("^I open the browser$")
    public void iOpenTheBrowser() {
    }

    @When("^I confirm that uSDK success init message appears$")
    public void Verify() {
        Assert.assertTrue(homePage.isSDKinitMessageDisplayed());

    }


    @And("^the three editable fields in the UI: email, card Number, backend address exist$")
    public void theThreeEditableFieldsInTheUIEmailCardNumberBackendAddressExist() {
        boolean a = homePage.isCTQAbackendAddressDisplayed();
        boolean b = homePage.isCTQAEmailDisplayeD();
        boolean c = homePage.isCTQACARDNUMBERDISPLAYED();

        Assert.assertTrue(a&&b&&c);


    }

    @And("^there is the Perform Transaction Button$")
    public void thereIsThePerformTransactionButton() {
        Assert.assertTrue(homePage.isPerformTransactionDisplayed());
    }

    @When("^I clear card Number Field$")
    public void iClearCardNumberField() {
        homePage.clearCCTextField();
    }


    @When("^I enter Browser Credit Card Number (.+)$")
    public void enterCC(String cc) {

        homePage.enterAccNum(cc);
        creditCardNumber = cc;

    }


    @And("^I click Perform Transaction$")
    public void iClickPerformTransaction() {
        homePage.clickPerformTransaction();
    }

    @Then("^I verify that Transaction has been complete message with Transaction ID URL is displayed$")
    public void iVerifyThatTransactionHasBeenCompleteMessageWithTransactionIDURLIsDisplayed() {
        Assert.assertTrue(homePage.isTransactionCompleteMessage());
    }
}

