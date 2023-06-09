package com.loop.test.day10_jsexecutor_pom;

import com.loop.test.utilities.ConfigurationReader;
import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class T1_JSExecutor_scroll {


    @Test
    public void etsy_scroll_test(){
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy"));
        WebElement emailBox= Driver.getDriver().findElement(By.id("email-list-signup-email-input"));
        //How to scroll to element
        //#1 use actions move to element
        Actions actions = new Actions(Driver.getDriver()) ;
        //actions.moveToElement(emailBox);  //it is same the line 24
        //actions.scrollToElement(emailBox).perform();

        //#2 just use Key press
        //actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        //#3 scroll horizontally or vertically
        //js.executeScript("window.scrollBy(0,1000)");

        //#4
        js.executeScript("arguments[0].scrollIntoView(true)",emailBox);
        js.executeScript("arguments[0].click",emailBox);
        //js.executeScript("window.frame[1]"); it's not use too much it's not importance


    }

}
