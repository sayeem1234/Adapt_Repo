package framework.webPages.Darksky;

import framework.webPages.BasePage;
import org.openqa.selenium.By;

public class APIPage extends BasePage {

    private By registerHeader = By.xpath("//h1[text()='Register']");
    private By registerButton = By.xpath("//button[text()='Register']");

    public boolean isRegisterHeaderDisplayed() {
        return isElementDisplayed(registerHeader);
    }

    public void clickRegisterButton() {
        clickOn(registerButton);
    }
}
