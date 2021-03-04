package framework.webPages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{

	private By pageHeader = By.xpath("//*[@id='content']/div/div/div[1]/span");
	private By TeslaHeader = By.xpath("//span[text()='Model X']");
	private By googleNext = By.xpath("//span[text()='Next']");
	private By googleLogo = By.xpath("//img[@alt='Google']");
	private By logoutButton = By.xpath("//button[@id='logout']");



	public String getLogOutMessage(){
		return getTextFromElement(logoutButton);
	}



	public String getGoogleHeader(){
		return getTextFromElement(googleLogo);
	}

	public String getGoogleText(){
		return getTextFromElement(googleNext);
	}
	
	public String getPageHeader() {
		return getTextFromElement(pageHeader);
	}

	public String getTeslaHeader(){
		return getTextFromElement(TeslaHeader);

	}
}
