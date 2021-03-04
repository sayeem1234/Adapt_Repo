package framework.mobilePages;

import framework.MobileBasePage;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.ArrayList;

public class HomeScreen extends MobileBasePage {

    public static ArrayList<String> transactionIDS = new ArrayList<>();
    String transactionID = "";

    @AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"SKIP \"]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement skipButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView/android.view.View/android.widget.Button[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement mainMenu;

    public void tapOnSkipButton() {
        tapOn(skipButton);
    }

    public void tapOnMainMenuButton() {
        tapOn(mainMenu);
    }


    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"ThreeDS-Sample\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]/XCUIElementTypeTextField")
    private MobileElement textField;

    public boolean isCardNumberFieldPresent(){
        return isElementDisplayed(textField);
    }

    public boolean isEmailFieldPresent(){
        return isElementDisplayed(getTransactionID);
    }

    public void eraseText(){
        tapOn(textField);
        clearField(textField);
    }


    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Create Transaction")
    private MobileElement createTransaction;

    public void tapCreateTransaction() throws InterruptedException {
        tapOn(createTransaction);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Account Number")
    private MobileElement Account_Number;

    public void enterAccNum(String cardNum){
        setValue(Account_Number,cardNum);
    }

    public void printContext(){
        getContext();
    }


    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Copy Last Server Transaction ID to Clipboard")
    private MobileElement CopyID;

    public boolean isCopyButtonPresent(){
        return isElementDisplayed(CopyID);
    }

    public void CopyToKeyBoard(){
        tapOn(CopyID);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "qa@msignia.com")
    private MobileElement qaEmail;

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Cut")
    private MobileElement CUT;


    public void clearEmailField(){
        tapOn(qaEmail);
        clearField(qaEmail);
    }


    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Email")
    private MobileElement sampleAppEmailField;

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Paste")
    private MobileElement PASTE;

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"ThreeDS-Sample\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeTextField")
    private MobileElement getTransactionID;

    public String getEmailInfo(){
        return getTextFromElement(getTransactionID);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"mSIGNIA RSA\"]")
    private MobileElement mSigniaRSA;

    public void tapRSA(){
        tapOn(mSigniaRSA);
    }

    public boolean isRSAdisplayed(){
        return isElementDisplayed(mSigniaRSA);
    }


    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"mSIGINIA EC\"]")
    private MobileElement mSigniaEC;

    public void tapEC(){
        tapOn(mSigniaEC);
    }

    public boolean isECDisplayed(){
        return isElementDisplayed(mSigniaEC);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Done")
    private MobileElement DONE;

    public void TAPDONE(){
        tapOn(DONE);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Cancel")
    private MobileElement Cancel;

    public void tapCancel() throws InterruptedException {
        Thread.sleep(2000);
        tapOn(Cancel);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Ok")
    private MobileElement OK;

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Create Transaction")
    private MobileElement CreateTransactionBtn;

    public boolean isCreateTransBtnDisplayed(){
        return isElementDisplayed(CreateTransactionBtn);
    }



    public boolean isOKAYDISPLAYED(){
        return isElementDisplayed(OK);
    }





    public void enterTransactionID() throws InterruptedException {
        tapOn(sampleAppEmailField);
        Thread.sleep(1000);
        tapOn(PASTE);
        //System.out.println(getTextFromElement(getTransactionID)); //ID

        transactionID += getTextFromElement(getTransactionID);
        transactionIDS.add(transactionID);
        for(String id:transactionIDS)
            System.out.println(id);



        tapOn(getTransactionID);
        clearField(getTransactionID);
        tapOn(sampleAppEmailField);
        setValue(sampleAppEmailField,"qa@msignia.com");

    }

    public String getCurrentCardNumber(){
        return getTextFromElement(textField);
    }


    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "https://merchant-backend.ct.msignia.com")
    private MobileElement backendAddress;

    public boolean isBackEndAddressVisible(){
        return isElementDisplayed(backendAddress);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Answer here...")
    private MobileElement AnswerHere;

    public void enterSecurityCodeNativeOTP(){
        setValue(AnswerHere,"aa11");
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"SUBMIT\"]")
    private MobileElement Submit;

    public void tapSubmit(){
        tapOn(Submit);
    }


    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "(//XCUIElementTypeButton[@name=\"SUBMIT\"])[2]")
    private MobileElement SUBMIT;

    public void tapSUBMIT(){
        tapOn(SUBMIT);
    }




    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "OTP Challenge")
    private MobileElement OTP_Challenge;

    public boolean isOTPChallengePresent(){
        return isElementDisplayed(OTP_Challenge);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "button_Smith")
    private MobileElement button_smith;

    public void tapSmith(){
        tapOn(button_smith);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Smith")
    private MobileElement Smith;

    public boolean isSmithPresent(){
        return isElementDisplayed(Smith);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "button_Chicago,Illinois")
    private MobileElement button_Chicago;

    public void tapChicago(){
        tapOn(button_Chicago);
    }

    public boolean isChicagoPresent(){
        return isElementDisplayed(button_Chicago);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "Enter your 6 digit number.")
    private MobileElement SixDigitCode;

    public boolean isEnter6DigitPassDisplayed(){
        return isElementDisplayed(SixDigitCode);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"ThreeDS-Sample\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeWebView[2]/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
    private MobileElement textBox6digitCode;

    public void enter6DigitCode(){
        setValue(textBox6digitCode,"111111");
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"ThreeDS-Sample\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeWebView[2]/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeOther")
    private MobileElement htmlSmith;

    public void tapHtmlSmith(){
        tapOn(htmlSmith);
    }

    public boolean isHtmlSmithPResent(){
        return isElementDisplayed(htmlSmith);
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeApplication[@name=\"ThreeDS-Sample\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeWebView[2]/XCUIElementTypeWebView/XCUIElementTypeWebView/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[4]/XCUIElementTypeSwitch")
    private MobileElement htmlMultiChicago;

    public void tapHtmlMultiChicago(){
        tapOn(htmlMultiChicago);
    }

    public boolean isHtmlMultiChicagoPresent(){
        return isElementDisplayed(htmlMultiChicago);
    }




    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "(//XCUIElementTypeButton[@name=\"RESEND CODE\"])[2]")
    private MobileElement resendCodeQA513;

    public void hitResendCodeQA513(){
        tapOn(resendCodeQA513);
    }

    public boolean isResendCodePresentQA513(){
        return isElementDisplayed(resendCodeQA513);
    }


    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Resend code\"]")
    private MobileElement resendCodeQA210;

    public void hitResendCodeQA210(){
        tapOn(resendCodeQA210);
    }

    public boolean isResendCodePresentQA210(){
        return isElementDisplayed(resendCodeQA210);
    }



    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"Ok\"]")
    private MobileElement K;

    public void tapK() {
        tapOn(K);
    }


    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeAlert[@name=\"Postal code\"]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeScrollView[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[1]/XCUIElementTypeOther/XCUIElementTypeOther")
    private MobileElement zipcodeField;

    public void enterZipCode() {
        setValue(zipcodeField,"11111");
    }

    public boolean isZipCodeFieldPresent(){
        return isElementDisplayed(zipcodeField);
    }


    @AndroidFindBy(id = "undefined")
    @iOSFindBy(accessibility = "textField")
    private MobileElement pinTextField;

    public void enterBankPin(){
        setValue(pinTextField,"123abc");
    }

    @AndroidFindBy(id = "undefined")
    @iOSFindBy(xpath = "//XCUIElementTypeButton[@name=\"SUBMIT\"]")
    private MobileElement submitButtonBankPinPage;

    public void clickSubmitButtonBankPinPage(){
        tapOn(submitButtonBankPinPage);
    }

    public boolean isVerifyBankPinExists(){
        return isElementDisplayed(pinTextField);
    }

    public void enter6digitOTPCode(){
        setValue(pinTextField,"123abc");
    }

    public void tapSubmitOTPCode(){
        tapOn(submitButtonBankPinPage);
    }
    public boolean isVerifyOTPCODEFIELDexists(){
        return isElementDisplayed(pinTextField);
    }


    // ANDROID LOCATORS








    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.EditText[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement emailAndroidtextfield;

    public String androidEmailValue(){
        return getTextFromElement(emailAndroidtextfield);
    }

    public boolean isAndroidEmailDisplayed(){
        return isElementDisplayed(emailAndroidtextfield);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.EditText[2]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement cardnumFieldAndroid;

    public String getCardNumberValueAndroid(){
        return getTextFromElement(cardnumFieldAndroid);

    }

    public void enterCardNumAndroid(String cardNum){
        setValue(cardnumFieldAndroid,cardNum);
    }

    public boolean isCardnumfiledDisplayedAndroid(){
        return isElementDisplayed(cardnumFieldAndroid);
    }

    public void clearAndroidCardField(){
        clearField(cardnumFieldAndroid);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.EditText[3]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement backendAddressAndroid;

    public boolean isbackEndAddressAndroidDisplayed(){
        return isElementDisplayed(backendAddressAndroid);
    }



    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.Button[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement purchaseButtonAndroid;

    public void tapPurchaseAndroid(){
        tapOn(purchaseButtonAndroid);
    }

    public boolean isPurchaseButtonDisplayed(){
        return isElementDisplayed(purchaseButtonAndroid);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/a.b.d.f.g0/android.widget.ScrollView/android.widget.LinearLayout")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement preOKButtonAndroidTransaction;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/a.b.d.f.g0/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement OKButtonAndroidTransaction;

    public void tapOKANDROID() {
        tapOn(preOKButtonAndroidTransaction);
        tapOn(OKButtonAndroidTransaction);
    }


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.Button[2]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement ANDROIDCopytoClipBoardButton;

    public boolean isCopyAndroidPresent(){
        return isElementDisplayed(ANDROIDCopytoClipBoardButton);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/a.b.d.f.g0/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement androidRSABtn;

    public boolean isandroidRSAbtnDisplayed() {
        return isElementDisplayed(androidRSABtn);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/a.b.d.f.g0/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[2]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement androidECBtn;

    public boolean isandroidECbtnDisplayed() {
        return isElementDisplayed(androidECBtn);
    }

    public void clickAndroidEC(){
        tapOn(androidECBtn);
    }

    public void clickAndroidRSA(){
        tapOn(androidRSABtn);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/a.b.d.f.g0/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[2]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement androidOKButtonDS;

    public void TAPOKDSVALUEANDROID(){
        tapOn(androidOKButtonDS);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/a.b.d.f.g0/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement cancelButtonRSA;

    public void tapCancelRSAAndroid(){
        tapOn(cancelButtonRSA);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/a.b.d.f.g0/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement okbuttonAndroidTransactionNull;

    public void tapOKandroidTransNull(){
        tapOn(okbuttonAndroidTransactionNull);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/a.b.d.f.g0/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement okbuttonAndroidTransactionSucess;

    public void tapOKBUTTONANDROIDSUCCESSTRANS(){
        tapOn(okbuttonAndroidTransactionSucess);
    }


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.EditText[3]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement androidBackEndAddressTextField;

    public void clearbackEndAddressAndroid(){
        clearField(androidBackEndAddressTextField);
    }

    public void typeBackEndAddressCTQA(){
        setValue(androidBackEndAddressTextField,"https://qa-merchant-backend.ct.msignia.com");
    }


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.EditText")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement OTPtextFieldAndroidQA210;

    public void enterOTPAndroid(){
        setValue(OTPtextFieldAndroidQA210,"123AAA");
    }


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement submitButtonOTPDROID ;

    public void clickSubmitOTPDROID(){
        tapOn(submitButtonOTPDROID);
    }


    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement okButtonAndroid;

    public void clickOkButtonAndroid(){
        tapOn(okButtonAndroid);
    }

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RadioGroup/android.widget.RadioButton[1]")
    @iOSFindBy(accessibility = "undefined")
    private MobileElement androidRSA;

    public boolean isAndroidRsaDisplayed(){
        return isElementDisplayed(androidRSA);

    }
















}











































