package util;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ConversionUtil {


    public static List<String> ListWebElementIntoListString(List<WebElement> elements) {
        List<String> texts = new ArrayList<>();
        for (WebElement elem : elements) {
            texts.add(elem.getText());
        }
        return texts;
    }

    public static List<Integer> ListStringTempsIntoListInteger(List<String> texts) {
        List<Integer> intTemps = new ArrayList<>();
        for (String text : texts) {
            text = text.substring(0,text.length()-1);
            intTemps.add(Integer.valueOf(text));
        }
        return intTemps;
    }

    public static int StringIntoInteger(String textString) {
        return Integer.valueOf(textString);
    }











}
