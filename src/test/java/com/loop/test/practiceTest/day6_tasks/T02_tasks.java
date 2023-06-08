package com.loop.test.practiceTest.day6_tasks;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T02_tasks  extends TestBase {
    /*
    task1
=============
1. go to https://demoqa.com/alerts
2. click - click button to see alert
3. handle alert
4. click - On button click, alert will appear after 5 seconds
5. handle alert
6. click - On button click, confirm box will appear
7. click ok and validate - You selected Ok
8. after that do it again this time cancel and validate - You selected Cancel
9. click - On button click, prompt box will appear
10. enter "Loop Academy" and validate You entered Loop Academy
     */
    @Test
        public void confirmBox() throws InterruptedException {

        driver.get("https://demoqa.com/alerts");
        WebElement clickForConfirm = driver.findElement(By.xpath("(//button[contains(text(),'')])[4]"));
        Thread.sleep(3000);
        clickForConfirm.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //click ok and validate - You selected Ok
        Thread.sleep(3000);
        WebElement successMessageForClick = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        String actual = successMessageForClick.getText();
        String expected = "You selected Ok";
        Assert.assertEquals(actual,expected,"Actual does not match expected");
        WebElement clickForConfirm2 = driver.findElement(By.xpath("(//button[contains(text(),'')])[4]"));
        Thread.sleep(3000);
        clickForConfirm2.click();
        driver.switchTo().alert();
        alert.dismiss();
        WebElement cancelMessage = driver.findElement(By.xpath("//span[@id='confirmResult']"));
        String actual2 = cancelMessage.getText();
        String expected2 = "You selected Cancel";
        Assert.assertEquals(actual2,expected2,"Actual does not match expected");
        /*
        public void alert() throws InterruptedException {
        driver.get("https://demoqa.com/alerts%22);
        WebElement clickElement = driver.findElement(By.id("alertButton"));
        clickElement.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement clickButton = driver.findElement(By.id("timerAlertButton"));
        clickButton.click();
        driver.switchTo().alert().accept();
        WebElement clickElements = driver.findElement(By.id("confirmButton"));
        clickElements.click();
        driver.switchTo().alert().accept();
        WebElement confirm = driver.findElement(By.id("confirmResult"));
        actual = confirm.getText();
        expected = "You selected Ok";
        Assert.assertEquals(actual, expected);
        WebElement clickElementsCancel = driver.findElement(By.id("confirmButton"));
        clickElements.click();
        driver.switchTo().alert().dismiss();
        WebElement confirmBox = driver.findElement(By.id("confirmResult"));
        actual = confirmBox.getText();
        expected = "You selected Cancel";
        Assert.assertEquals(actual, expected);
        WebElement clickPrompt = driver.findElement(By.id("promtButton"));
        clickPrompt.click();
        driver.switchTo().alert().sendKeys("Loop Academy");
        driver.switchTo().alert().accept();
        WebElement appearBox= driver.findElement(By.id("promptResult") );
        actual = appearBox.getText() ;
        expected ="You entered Loop Academy";
        Assert.assertEquals(actual,expected);
    }
}
         */
    }
}
