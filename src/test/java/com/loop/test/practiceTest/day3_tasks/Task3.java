package com.loop.test.practiceTest.day3_tasks;
/*
1. Open Docuport app
2. Send UserName
3. Send password
4. Click login
 */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/%22");
        WebElement userName = driver.findElement(By.xpath("//*[@id='input-14']"));
        userName.sendKeys("b1g2_supervisor@gmail.com" );
        WebElement password = driver.findElement(By.xpath("//*[@id='input-15']"));
        password.sendKeys("Group2");
        WebElement clickLogin = driver.findElement(By.className("v-btn__content"));
        clickLogin.click();

        //WebElement signUp =driver.findElement(By.linkText("Sign Up"));
        //signUp.click();

        //WebElement userName=driver.findElement(By.xpath("//*[@id='input-14']"));
        //userName.click();

        //WebElement lastName=driver.findElement(By.xpath("//*[@id='input-15']"));
        //lastName.click();

        //userName.sendKeys("b1g2_supervisor@gmail.com");
        //userName.click();


       // WebElement password=driver.findElement(By.id("input-15"));
        //password.sendKeys("Group2");

      //  WebElement logIn =driver.findElement(By.linkText("Log in"));

     //   logIn.click();









    }
}
