package framework;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import static framework.AppiumWrapper.getAppiumDriver;

public class MobileBasePage {

    //adding a new line of code Jani Na
    AppiumDriver appiumDriver;
    //



    /**
     * This is a constructor which initializes initPageElements()
     */
    public MobileBasePage() {
        initPageElements();
    }

    /**
     * This method handles wait functionality for mobile actions, which means if the element is not found
     * during test then the app will re-try and wait up to 15 seconds before failing the test step
     */
    protected void initPageElements() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver(), Duration.ofSeconds(15)), this);
    }

    /**
     * This method is used to tap on element
     *
     * @param mobileElement element to tap on
     */
    protected void tapOn(MobileElement mobileElement) {
        try {
            mobileElement.click();
        } catch (NoSuchElementException e) {
            //Take Screenshot here
            //Send email notification
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }





    /**
     * This method is used to set value in text field
     *
     * @param mobileElement
     * @param setValue
     */
    protected void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    protected void pushKey(MobileElement mobileElement, String string, Keys keys) {

        try {
            mobileElement.sendKeys(keys,string);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    public void clearField(MobileElement mobileElement){
        mobileElement.clear();
    }

    /**
     * This method is used to verify if element is displayed
     *
     * @param mobileElement
     * @return
     */
    protected boolean isElementDisplayed(MobileElement mobileElement) {
        try {
            return mobileElement.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    public void getContext(){
        Set<String> contextNames = AppiumWrapper.getAppiumDriver().getContextHandles();
        for(String c: contextNames)
            System.out.println("context" + c);
    }

    protected String getTextFromElement(MobileElement mobileElement) {
        String text;
        try {
            text = mobileElement.getText();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Element is not found with this locator: " + mobileElement.toString());
        }
        return text;
    }

    protected void swipeScreenHorizontally(int times) {

        Dimension size = AppiumWrapper.getAppiumDriver().manage().window().getSize();
        int anchor = size.height / 2;
        int startPoint = (int) (size.width * 0.8);
        int endPoint = (int) (size.width * 0.2);
        System.out.println("Size: " + size);
        System.out.println("Start Point: " + startPoint);
        System.out.println("End Point: " + endPoint);
        TouchAction touchAction = new TouchAction(AppiumWrapper.getAppiumDriver());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < times; i++) {
           // touchAction.press(startPoint, anchor).moveTo(endPoint, anchor).release().perform();
        }
    }




    public void doLongPress() throws InterruptedException {
        TouchAction action = new TouchAction(AppiumWrapper.getAppiumDriver());
        MobileElement element = (MobileElement) AppiumWrapper.getAppiumDriver().findElementByAccessibilityId("Email");
        Point location = element.getLocation();
        int x = location.getX();
        int y = location.getY();
        new TouchAction(AppiumWrapper.getAppiumDriver()).longPress(PointOption.point(x,y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(20)));
        new TouchAction(AppiumWrapper.getAppiumDriver()).press(PointOption.point(x+30,y-30)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1))).release().perform();


    }







}




