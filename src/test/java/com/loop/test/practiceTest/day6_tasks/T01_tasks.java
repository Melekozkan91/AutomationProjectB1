package com.loop.test.practiceTest.day6_tasks;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class T01_tasks extends TestBase {
    /*
    task2
=============
1. go to https://demoqa.com/nestedframes
2. Validate "Child Iframe" text
3. Validate "Parent Iframe" text
4. Validate the "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame."
     */
    @Test
    public void iframe(){
         driver.get("https://demoqa.com/nestedframes");
         driver.switchTo().frame("frame1");
         driver.switchTo().frame(0);
         WebElement element =driver.findElement(By.xpath("//p[.='Child Iframe']"));
         actual = element.getText();
         expected ="Child Iframe";
         assertEquals(actual,expected," actual does not match the expected ");
         driver.switchTo().parentFrame(); //we switch to child to parent
         driver.switchTo().defaultContent();
         WebElement element2 = driver.findElement(By.xpath("//div[contains(text(),'Sample Nested Iframe page')]"));
         actual = element2.getText();
         expected = "Sample Nested Iframe page. There are nested iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame and the nested child frame.";
         assertEquals(actual, expected, "actual does not match the expected");



    }
}
