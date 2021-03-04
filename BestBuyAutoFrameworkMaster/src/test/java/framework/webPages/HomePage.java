package framework.webPages;

import org.openqa.selenium.By;

public class HomePage extends BasePage{

	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	private By firstNameTextField = By.id("firstName");
	private By lastNameTextField = By.id("lastName");
	private By mobileNumberTextField = By.id("mobileNumber");
	private By newPasswordTextField = By.id("newPwd");
	private By errorMessage = By.id("errorMessage");
	private By femaleGender = By.id("u_0_9");
	private By maleGender = By.id("u_0_a");
	private By messengerLink = By.id("");

	private By modelX = By.xpath("//a[text()='Model X']/parent::li/parent::ol/parent::nav/parent::nav/nav[1]/ol/li[3]/a[text()='Model X']");
	private By googleSearch = By.xpath("//input[@class='gLFyf gsfi']");
	private By googleSubmitButton = By.xpath("//input[@type='submit' and @value='Google Search' and @data-ved='0ahUKEwiX_rXr89jqAhVSmXIEHcZ1B0wQ4dUDCA0']");

	private By firstName = By.id("name");
	private By passW = By.id("password");

	//methods and locators for SAMPLE APP BROWSER



	private By uSDKinitMessage = By.xpath("//div[@id='message']");

	public boolean isSDKinitMessageDisplayed(){
		return isElementDisplayed(uSDKinitMessage);
	}

	private By emailCTQA = By.xpath("//input[@id='email']");

	public boolean isCTQAEmailDisplayeD(){
		return isElementDisplayed(emailCTQA);
	}

	private By CardNumberCTQA = By.xpath("//input[@id='acct-number']");

	public void clearCCTextField(){
		clear(CardNumberCTQA);

	}

	public boolean isCTQACARDNUMBERDISPLAYED(){
		return isElementDisplayed(CardNumberCTQA);
	}

	private By backendAddressCTQA = By.xpath("//input[@id='backend-url']");

	public boolean isCTQAbackendAddressDisplayed(){
		return isElementDisplayed(backendAddressCTQA);
	}

	private By performTransactionButton = By.xpath("//button[contains(text(),'Perform')]");

	public void clickPerformTransaction(){
		clickOn(performTransactionButton);
	}

	public boolean isPerformTransactionDisplayed(){
		return isElementDisplayed(performTransactionButton);
	}

	public void enterAccNum(String ccNum){
		setValue(CardNumberCTQA,ccNum);
	}

	private By TransactionComplete = By.xpath("//a[contains(@href,\"transactions\")]");

	public boolean isTransactionCompleteMessage(){
		return isElementDisplayed(TransactionComplete);
	}












	public void enterFName(String name){
		setValue(firstName, name);
	}

	public void clickEnterRandom(){
		clickEnter2(passW);
	}

	public void enterNumericPass(int num){
		setNumericValue(passW,num);
	}



	public void enterText(String text){
		clickEnter(googleSearch,text);
	}

	public void clickGoogleSearch(){
		clickOn(googleSubmitButton);
	}

	public void clickOnLoginButton() {
		clickOn(loginButton);
	}

	public void enterEmail(String enterEmail) {
		setValue(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		setValue(passwordTextField, enterPassword);
	}

	public void enterFirstName(String firstName) {
		setValue(firstNameTextField, firstName);
	}

	public void enterLastName(String lastName) {
		setValue(lastNameTextField, lastName);
	}

	public void enterMobileNumber(String mobileNum) {
		setValue(mobileNumberTextField, mobileNum);
	}

	public void enterNewPassword(String password) {
		setValue(newPasswordTextField, password);
	}

	public String getErrorMessage() {
		return getTextFromElement(errorMessage);
	}

	public boolean isGenderFemaleSelected() {
		return isElementSelected(femaleGender);
	}

	public void clickOnFemaleGender() {
		clickOn(femaleGender);
	}

	public boolean isGenderMaleSelected() {
		return isElementSelected(maleGender);
	}

	public void clickOnMaleGender() {
		clickOn(maleGender);
	}

	public void clickOnMessengerLink() {
		clickOn(messengerLink);
	}

	//tesla
	public void clickOnTesla(){
		clickOn(modelX);
	}







}
