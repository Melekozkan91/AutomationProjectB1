package com.loop.test.practiceTest.day6_tasks;

import com.loop.test.base.TestBase;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test extends TestBase {
    @Test
    public void alert() throws InterruptedException {
        Object alertButton;
        driver.get("https://demoqa.com/alerts");
        WebElement clickForConfirm = driver.findElement(By.xpath("(//button[contains(text(),'')])[4]"));
        clickForConfirm.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement clickButton = driver.findElement(By.id("timerAlertButton"));
        clickButton.click();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);
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

