package com.cydeo.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtil {

    /**
     * Switches to new window by the exact title.
     * Returns to original window if target title not found
     * @param -- targerTitle
     */

    public static void switchToWindow(String targetTitle){
        String origin = Driver.getDriver().getWindowHandle();
        for(String handle : Driver.getDriver().getWindowHandles()){
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)){
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }


    /**
     * Moves the mouse to given element
     */

    public static void hover( WebElement element){
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    /**
     * return a list of string from a list of elements
     */

    public static List<String> getElementsText(List<WebElement> list){
        List<String> elemTexts = new ArrayList<>();
        for (WebElement element : list) {
            elemTexts.add(element.getText());
        }

        return elemTexts;
    }

    /**
     * Extracts text from list of elements matching the provided locator into new List<String>
     */

public static List<String> getelementsText(By locator){

    List<WebElement> elems = Driver.getDriver().findElements(locator);
    List<String> elemTexts = new ArrayList<>();
    for (WebElement elem : elems) {
        elemTexts.add(elem.getText());
    }
    return elemTexts;
}








}
