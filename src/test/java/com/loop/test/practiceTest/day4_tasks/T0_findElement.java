package com.loop.test.practiceTest.day4_tasks;
/*

1. go to docuport app
2. validate that Home, Received docs, My uploads, Invitations are displayed
3. press three lines
4. Home, Received docs, My uploads, Invitations will disappear
5. Validate the buttons are not displayed
 */

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T0_findElement {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");

        WebElement userName = driver.findElement(By.id("input-14"));
        userName.click();


        WebElement password= driver.findElement(By.id("input-15"));
        password.click();

        WebElement login =driver.findElement(By.className("v-btn__content"));
        login.click();





    }
}
