package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.mobilePages.HomeScreen;
import framework.mobilePages.MainMenu;
import org.testng.Assert;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.NoSuchElementException;

public class sampleApp {
    //TEST**
    String creditCardNumber = "";

    //**
    HomeScreen hs = new HomeScreen();
    MainMenu mm = new MainMenu();

    @When("^I clear field$")
    public void clearField() throws InterruptedException {
        Thread.sleep(5000);
        hs.eraseText();
    }

    @When("^I enter Credit Card Number (.+)$")
    public void enterCC(String cc) {
        hs.enterAccNum(cc);
        creditCardNumber = cc;

    }

    @When("^I launch the Sample App$")

    public void launchSampleApp()  {
    }

    @When("^I click Create Transaction$")
    public void createTransaction() throws InterruptedException {
        hs.tapCreateTransaction();
        Thread.sleep(3000);
        hs.CopyToKeyBoard();
        hs.clearEmailField();
        hs.enterTransactionID();

    }

    @When("^I grab the transaction Id$")
    public void grabTransaction() throws InterruptedException {
        Thread.sleep(3000);
        hs.CopyToKeyBoard();
        hs.clearEmailField();
        hs.enterTransactionID();

    }




    @When("^I see the \"Mastercard\" or \"CB\" Logo and the Ok Button$")
    public void verifyMasterCardorCBLogo() throws InterruptedException {

    }

    @When("^I click create transaction$")
    public void createTransactionDBC3() throws InterruptedException {
        hs.tapCreateTransaction();

//        try {
//            if(hs.isRSAdisplayed()) {
//                hs.tapRSA();
//                hs.TAPDONE(); }
//        } catch (Exception e)
//        { e.printStackTrace(); }

    }

    @When("^I click CREATE TRANSACTION$")
    public void createTransactionCCS() throws InterruptedException {
        hs.tapCreateTransaction();

        try {
            if(hs.isRSAdisplayed()) {
                hs.tapRSA();
                hs.TAPDONE(); }
        } catch (Exception e)
        { e.printStackTrace(); }




    }




    @And("^I select the DS$")
    public void chooseDS()  {
        hs.tapRSA();

    }

    @And("^I select the RSA DS$")
    public void chooseRSADS()  {
        hs.tapRSA();
        hs.TAPDONE();
    }

    @When("^I tap cancel$")
    public void tapCancel() throws InterruptedException {
        hs.tapCancel();

    }


    @When("^I get the transaction ID$")
    public void getTranID() throws InterruptedException {
        Thread.sleep(3000);
        hs.CopyToKeyBoard();
        hs.clearEmailField();
        hs.enterTransactionID();


    }


    @When("^I tap the OK button on the transaction/authentication cancelled$")
    public void tapOKBTN()  {

    }

    @When("^I tap the OK button for successful transaction$")
    public void tapOkBTN()  {

    }

    @Then("^I see the Sample App main menu and transaction cancelled message$")
    public void verifyCancelMessage() {

//        Assert.assertTrue(hs.isOKAYDISPLAYED());

    }

    @And("^I have the option to select the 2 DS values$")
    public void areDSdisplayed()  {
        boolean a = hs.isECDisplayed();
        boolean b = hs.isRSAdisplayed();
        boolean c = a && b;

        Assert.assertTrue(c);


        try {
            if(hs.isRSAdisplayed()) {
                hs.tapRSA();
                hs.TAPDONE(); }
        } catch (Exception e)
        { e.printStackTrace(); }


    }

    @When("^I verify that the email and card number are still populated$")
    public void verifyCCandEmail()  {
        System.out.println(creditCardNumber);
        System.out.println(hs.getCurrentCardNumber());
        System.out.println(hs.getEmailInfo());
        Assert.assertEquals(creditCardNumber,hs.getCurrentCardNumber());
        Assert.assertEquals(hs.getEmailInfo(),"qa@msignia.com");

    }

    @When("^I select the EC DS$")
    public void selecEC()  {
        hs.tapEC();
        hs.TAPDONE();
    }

    @When("^I see the transaction ID$")
    public void seeTransId(){
    }


    @When("^I see the SDK initialize Sucess Alert$")

    public void SDKinit()  {
    }

    @When("^I see the SDK has initialized success message$")
    public void SDKSuccess()  {
    }
    @When("^I see the 3 editable fields email, cardNumber, and backend server address$")
    public void VerifyThe3Fields()  {
        Assert.assertTrue(hs.isBackEndAddressVisible());
        Assert.assertTrue(hs.isEmailFieldPresent());
        Assert.assertTrue(hs.isCardNumberFieldPresent());

    }
    @When("^I see the submit button and the copy button$")
    public void Verifythe2Buttons()  {
        Assert.assertTrue(hs.isCreateTransBtnDisplayed());
        Assert.assertTrue(hs.isCopyButtonPresent());
       
    }

    @When("^I enter NATIVE OTP security code$")
    public void EnterNativeOTPCode()  {
        hs.enterSecurityCodeNativeOTP();


    }

    @When("^I click submit$")
    public void clickSubmit() {
        hs.tapSubmit();

    }

    @When("^I click SUBMIT$")
    public void clickSUBMIT() {
        hs.tapSUBMIT();

    }

    @When("^I verify that the spinner with the Logo appears and the Challenge Screen is present$")
    public void verifyTheChallengeScreen() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(hs.isOTPChallengePresent());

    }

    @When("^the UI has 3 editable fields: email, card number, and backend server address$")

    public void AreThreeEditableFieldsVisible()  {
    }


    @And("^if Select DS value Appears then I choose the appropriate DS value$")
    public void selectDS()  {
        if(hs.isRSAdisplayed()) {
            hs.tapRSA();
            hs.TAPDONE();
        }

    }

    @When("^I select NATIVE_SINGLE_SELECT \"Smith\"$")
    public void selectSmith()  {
        hs.tapSmith();

    }

    @When("^I see the  Create transaction and Copy Transaction ID to clipboard button$")

    public void AreCreateTransactionAndCopyButtonVisible()  {
    }

    @When("^I verify that the spinner with the Logo appears and the NATIVE_SINGLE_SELECT Challenge Screen is present$")
    public void Assertion()  {
        Assert.assertTrue(hs.isSmithPresent());

    }
    @When("^I verify that the spinner with the Logo appears and the NATIVE_MULTI_SELECT Challenge Screen is present$")
    public void Assertion2()  {
        Assert.assertTrue(hs.isChicagoPresent());

    }


    @When("^I select NATIVE_MULTI_SELECT \"Chicago\"$")
    public void selectChicago()  {
        hs.tapChicago();

    }

    @When("^I verify that the spinner with the Logo appears and the HTML_OTP Challenge Screen is present$")
    public void Assertion3()  {
        Assert.assertTrue(hs.isEnter6DigitPassDisplayed());

    }

    @When("^I enter 6 digit code$")
    public void enter6digitCode()  {
        hs.enter6DigitCode();

    }

    @When("^I verify that the spinner with the Logo appears and the HTML_SINGLE_SELECT Challenge Screen is present$")
    public void Assertion4()  {
        Assert.assertTrue(hs.isHtmlSmithPResent());

    }

    @When("^I select HTML_SINGLE_SELECT \"Smith\"$")
    public void selectSmithHTML()  {
        hs.tapHtmlSmith();

    }

    @When("^I verify that the spinner with the Logo appears and the HTML_MULTI_SELECT Challenge Screen is present$")
    public void Assertion5()  {
        Assert.assertTrue(hs.isHtmlMultiChicagoPresent());

    }

    @When("^I select HTML_MULTI_SELECT \"Chicago\"$")
    public void selectChicagoHTMLMULTI()  {
        hs.tapHtmlMultiChicago();

    }

    @When("^I tap resend Code QA210$")
    public void tapResend() {
        hs.hitResendCodeQA210();

    }


    @When("^I tap resend Code QA513$")
    public void tapResendQA() {
        hs.hitResendCodeQA513();

    }

    @When("^I see the Resend Code Challenge Screen Again QA210$")
    public void AssertResendCode() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(hs.isResendCodePresentQA210());

    }


    @When("^I see the Resend Code Challenge Screen Again QA513$")
    public void AssertResendCode2() throws InterruptedException {
        Thread.sleep(2500);
        Assert.assertTrue(hs.isResendCodePresentQA513());

    }

    @When("^I verify that the Sample App doesn't crash$")
    public void notCrash(){

    }

    @When("^I assert that the app does not crash,a spinner is displayed, and a successful transaction message with OK button appears$")
    public void assert2(){

    }

    @When("^I click SDK OK ALERT$")
    public void notCrash777() throws InterruptedException {
        Thread.sleep(2000);
        hs.tapK();

    }


    @When("^I enter zipCode$")
    public void enterzip() throws InterruptedException {
        Thread.sleep(1000);
        hs.enterZipCode();

    }

    @When("^I tapDone$")
    public void tapDone(){
        hs.TAPDONE();
    }

    @When("^I see verify that the zipcode field, cancel and done button exists$")
    public void assertionfcb() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(hs.isZipCodeFieldPresent());
    }


    @When("^I enter bankPin$")
    public void enterBankPin() throws InterruptedException {
        hs.enterBankPin();

    }

    @When("^I enter otp code$")
    public void enterOTPCode() throws InterruptedException {
        hs.enterBankPin();

    }


    @When("^I tap Submit$")
    public void tapSubmitBankPinPage() throws InterruptedException {
        hs.clickSubmitButtonBankPinPage();

    }

    @When("^I see the prompt to enter Bank Pin$")
    public void verifyBankPinExists() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(hs.isVerifyBankPinExists());

    }

    @When("^I see the OTP challenge Screen$")
    public void SCA11() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(hs.isVerifyOTPCODEFIELDexists());

    }


    @When("^I enter 6 digit OTP Code$")
    public void enterSixdigitCode(){
        hs.enterBankPin();

    }














}

