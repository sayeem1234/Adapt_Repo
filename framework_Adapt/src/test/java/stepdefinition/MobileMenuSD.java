package stepdefinition;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobilePages.MethodsAndLocators;
import framework.mobilePages.VerifyPage;
import org.testng.Assert;

public class MobileMenuSD {

    private VerifyPage verifyPage = new VerifyPage();
    private MethodsAndLocators methodsAndLocators = new MethodsAndLocators();

    @When("^I tap on skip button$")
    public void clickOnSkipButton() {
        methodsAndLocators.tapOnSkipButton();
    }

    @When("^I tap on menu button$")
    public void clickOnMenuButton() throws InterruptedException {
        Thread.sleep(30000);
        methodsAndLocators.tapOnMainMenuButton();
    }

    @Then("^I verify sidebar menu is displayed$")
    public void verifySidebarMenu() {
        Assert.assertTrue(verifyPage.isMenuPresent());
    }
}
