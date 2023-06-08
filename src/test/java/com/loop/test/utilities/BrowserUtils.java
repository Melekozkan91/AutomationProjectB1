package com.loop.test.utilities;

import org.openqa.selenium.WebDriver;

import java.util.Set;

import static org.testng.Assert.assertTrue;

public class BrowserUtils {
    /**
     * validate if driver switched to expected ur and title
     * @param driver
     * @param expectedUrl
     * @param expectedTitle
     * @author melek
     * implements assertion
     * note: usually we do not do validation in method, this is for practicing purposes
     */
    public static void switchWindowAndValidate(WebDriver driver,String expectedUrl,String expectedTitle){
        expectedUrl =expectedUrl.toLowerCase();
        expectedTitle=expectedTitle.toLowerCase();
        Set <String> windowHandles=driver.getWindowHandles();
        for (String each : windowHandles) {
            driver.switchTo().window(each);
            if (driver.getCurrentUrl().toLowerCase().contains(expectedUrl)){
                break;
            }

        }
        assertTrue(driver.getTitle().toLowerCase().contains(expectedTitle));
    }

    /**
     * Switches to new window by the exact title
     * Returns to original window if windows with given title not found
     *
     */
    public static void switchToWindow(WebDriver driver, String targetTitle){
        String origin =driver.getWindowHandle();
        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            if (driver.getTitle().contains(targetTitle)){
                return;
            }
        }
        driver.switchTo().window(origin);

    }
    /**
     * @param driver
     * @param expectedTitle
     * returns void,assertion is implemented
     * @author melek
     */
    public static void validateTitle(WebDriver driver,String expectedTitle){
        assertTrue(driver.getTitle().contains(expectedTitle));

    }
}
