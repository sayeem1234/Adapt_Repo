package stepdefinition.Darksky;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.webPages.Darksky.APIPage;
import framework.webPages.Darksky.HomePage;
import framework.webPages.Darksky.TryForFreePage;
import org.testng.Assert;

import java.util.List;

public class DarkskySD {

    HomePage homepage = new HomePage();
    TryForFreePage tffpage = new TryForFreePage();
    APIPage apipage = new APIPage();

    @Given("^I am on the darksky Register page$")
    public void goToRegisterPage() {
        homepage.clickDarkAPIFromHeader();
        tffpage.clickTryForFreeButton();
    }

    @When("^I click on Register button$")
    public void clickRegisterButton() {
        apipage.clickRegisterButton();
    }

    @Then("^I verify I am on Register page by asserting Register header$")
    public void verifyRegisterPage() {
        Assert.assertTrue(apipage.isRegisterHeaderDisplayed(), "Register header is not displayed");
    }

    @When("^I expand todays timeline$")
    public void expandTimeline() {
        homepage.expandTodaysTimeline();
    }

    @Then("^I verify lowest and highest temp is displayed correctly$")
    public void verifyTempWithTodaysTimeline() {
        int count = 0;
        List<String> tempOnTimeline = homepage.getTempsOnTodaysTimeline();
        List<String> tempInTimeline = homepage.getTempsInTodaysTimeline();
        Assert.assertEquals(tempOnTimeline, tempInTimeline, "Correct values are not displayed in today's timeline.");
    }

    @Then("^I verify current temp is not greater or less then temps from daily timeline$")
    public void verifyCurrentTempFromDailyTimeline() {
        int minTemp = homepage.getMinTempFromDailyTimeline();
        int maxTemp = homepage.getMaxTempFromDailyTimeline();
        int currTemp = homepage.getCurrentTemp();
        Assert.assertTrue((currTemp >= minTemp && currTemp <= maxTemp),
                "Current temp (" +currTemp+") is either less than the min ("+minTemp+") or greater than the max("+maxTemp+") from timeline");
    }

    @Then("^I verify timeline is displayed with (\\d+) hours incremented for next (\\d+) hours$")
    public void verifyTimelineIncrement(int incrementBy, int forFutureHours) {
        Assert.assertEquals(homepage.createHoursTimelineUsingJava(incrementBy, forFutureHours), homepage.getHoursTimelineFromWeb());
    }



}
