package com.loop.test.day3_css_xpath;
/* go to http://the-internet.herokuapp.com/forgot_password
 *  locate 5 elements, forgot password, email, email input, retrieve password, powered selenium
 *  css
 * verify those elements are displayed
 */

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_css_xpath_isDisplayed {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/forgot_password");

        WebElement forgetPasswordHeading =driver.findElement(By.cssSelector("div[class='example']>h2"));
        if (forgetPasswordHeading.isDisplayed()){
            System.out.println("Forget password heading is displayed");
        }else {
            System.out.println("Forget password heading is NOT displayed");
        }
    }
}
