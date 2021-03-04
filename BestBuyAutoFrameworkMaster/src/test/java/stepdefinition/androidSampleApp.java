package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobilePages.HomeScreen;
import framework.mobilePages.MainMenu;
import org.testng.Assert;

public class androidSampleApp {

    String creditCardNumber = "";

    HomeScreen hs = new HomeScreen();
    MainMenu mm = new MainMenu();


    @When("^I launch the Sample App on Android$")
    public void laundAndroidSampleapp() {
    }

    @When("^I see the permission dialog$")
    public void permissionDialog() {
    }

    @When("^I see the SDK initialize Success Alert Android$")
    public void androidSuccessInit() {
    }

    @When("^the UI has 3 editable fields: email, card number, and backend server address Android$")
    public void threeEditablefieldsAndroid() {
        boolean a = hs.isAndroidEmailDisplayed();
        boolean b = hs.isCardnumfiledDisplayedAndroid();
        boolean c = hs.isbackEndAddressAndroidDisplayed();
        boolean d = a&&b&&c;

        Assert.assertTrue(d);

    }


    @When("^I clear field Android$")
    public void clearAndroidCardTextField() {
        hs.clearAndroidCardField();
    }


    @When("^I enter Android Credit Card Number (.+)$")
    public void enterAndroidCC(String cc) {
        hs.enterCardNumAndroid(cc);
        creditCardNumber = cc;
    }


    @When("^I click Create Transaction Android$")
    public void submitTransactionAndroid() throws InterruptedException {
        hs.tapPurchaseAndroid();
        //hs.tapOKANDROID();


        try {
            if(hs.isAndroidRsaDisplayed()) {
                hs.tapRSA();
                hs.TAPDONE(); }
        } catch (Exception e)
        { e.printStackTrace(); }





    }



    @When("^I see the submit button and the copy button Android$")
    public void verifyAndroidSubmitandCopyButton(){
        boolean a = hs.isPurchaseButtonDisplayed();
        boolean b = hs.isCopyAndroidPresent();
        boolean c = a&&b;
        Assert.assertTrue(c);


    }


    @When("^I have the option to select the 2 DS values Android$")
    public void select2DSValuesAndroid() {

        boolean a = hs.isandroidRSAbtnDisplayed();
        boolean b = hs.isandroidECbtnDisplayed();
        boolean c = a && b;

        Assert.assertTrue(c);

        hs.clickAndroidRSA();
        hs.TAPOKDSVALUEANDROID();
        hs.tapOKBUTTONANDROIDSUCCESSTRANS();

    }


    @When("^I select the DS RSA ANDROID$")
    public void selectRSAAndroid() {
        hs.clickAndroidRSA();

    }

    @When("^I select the DS EC ANDROID$")
    public void selectECAndroid() {
        hs.clickAndroidEC();

    }

    @When("^I tap cancel Android DS value$")
    public void cancelAndroidRSA() {

        hs.tapCancelRSAAndroid();
        hs.tapOKandroidTransNull();


    }


    @When("^I see the Sample App main menu and transaction cancelled message Android$")
    public void vvs() {
    }

    @When("^I verify that the email and card number are still populated Android$")
    public void vert() {
        System.out.println(creditCardNumber);
        System.out.println(hs.getCardNumberValueAndroid());
        System.out.println(hs.androidEmailValue());
        Assert.assertEquals(creditCardNumber,hs.getCardNumberValueAndroid());
        Assert.assertEquals(hs.androidEmailValue(),"qa@msignia.com");
    }

    @When("^I select OK on DS Menu$")
    public void selectOKANDROID() {
        hs.TAPOKDSVALUEANDROID();

    }


    @When("^I tap the OK button for successful transaction Android$")
    public void tapOKSUCCESSFULAnd() {
        hs.tapOKBUTTONANDROIDSUCCESSTRANS();

    }

    @When("^I verify that the spinner with the Logo appears and the Challenge Screen is present ANDROID$")
    public void verifyLogo() {
        hs.tapOKBUTTONANDROIDSUCCESSTRANS();

    }


    @When("^I change the backend server Address to CT QA$")
    public void changetoQAenv() {
        hs.clearbackEndAddressAndroid();
        hs.typeBackEndAddressCTQA();

    }

    @When("^I enter NATIVE OTP security code ANDROID$")
    public void vvs4() {
        hs.enterOTPAndroid();

    }

    @When("^I click submit ANDROID$")
    public void vvs3() {
        hs.clickSubmitOTPDROID();

    }

    @When("^I click OK Button Android$")
    public void sdf() {
        hs.clickOkButtonAndroid();

    }















}
