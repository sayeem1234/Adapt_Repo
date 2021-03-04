package framework.webPages.Darksky;

import framework.webPages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import stepdefinition.SharedSD;
import util.ConversionUtil;
import util.DateUtil;

import java.text.SimpleDateFormat;
import java.util.*;

public class HomePage extends BasePage {

    private By darkSkyAPILink = By.linkText("Dark Sky API");
    private By todaysTimeline = By.xpath("//a[@data-day='0']//span[@class='open']");
    private By tempsOnTodaysTimeline = By.xpath("//a[@data-day='0']//span[contains(@class,'Temp')]");
    private By tempsInTodaysTimeline = By.xpath("//div[@class='dayDetails revealed']//span[@class='temp']");
    private By timesOnTimeline = By.xpath("//div[@class='hours']//span//span");
    private By tempsOnTimeline = By.xpath("//div[@class='temps']//span//span");
    private By currentTemp = By.xpath("//span[@class='summary swap']");


    public void clickDarkAPIFromHeader() {
        clickOn(darkSkyAPILink);
    }

    public void expandTodaysTimeline() {
        scrollVerticallyByPixel(700);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {}
        clickOn(todaysTimeline);
    }

    public List<String> getTempsOnTodaysTimeline() {
        List<String> tempsOnTimeline = new ArrayList<>();
        List<WebElement> tempElements = webActions(tempsOnTodaysTimeline);
        for (WebElement tempElem : tempElements) {
            tempsOnTimeline.add(getTextFromElement(tempElem));
        }
        return tempsOnTimeline;
    }

    public List<String> getTempsInTodaysTimeline() {
        List<String> tempsInTimeline = new ArrayList<>();
        List<WebElement> tempElements = webActions(tempsInTodaysTimeline);
        for (WebElement tempElem : tempElements) {
            tempsInTimeline.add(getTextFromElement(tempElem));
        }
        return tempsInTimeline;
    }

    public List<String> getHoursTimelineFromWeb() {
        List<String> actualHoursTimeline = new ArrayList<>();
        List<WebElement> hours = webActions(timesOnTimeline);
        for (WebElement hour : hours) {
            actualHoursTimeline.add(getTextFromElement(hour));
        }
        return actualHoursTimeline;
    }

    public List<String> createHoursTimelineUsingJava(int incrementBy, int futureHours) {
        return DateUtil.createTimeLine(incrementBy, futureHours);
    }

    private List<Integer> getTempsTimelineFromWeb() {
        List<WebElement> temperaturesElements = webActions(tempsOnTimeline);
        List<String> temperatureStrings = ConversionUtil.ListWebElementIntoListString(temperaturesElements);
        List<Integer> temperatures = ConversionUtil.ListStringTempsIntoListInteger(temperatureStrings);
        Collections.sort(temperatures);
        return temperatures;
    }

    public int getMinTempFromDailyTimeline() {
        return getTempsTimelineFromWeb().get(0);
    }

    public int getMaxTempFromDailyTimeline() {
        List<Integer> sortedTemps = getTempsTimelineFromWeb();
        return sortedTemps.get(sortedTemps.size()-1);
    }

    public int getCurrentTemp() {
        String currentTempText = getTextFromElement(currentTemp);
        currentTempText = currentTempText.split("°")[0];
        return ConversionUtil.StringIntoInteger(currentTempText);
    }

}
