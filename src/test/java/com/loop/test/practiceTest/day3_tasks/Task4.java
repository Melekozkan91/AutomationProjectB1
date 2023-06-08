package com.loop.test.practiceTest.day3_tasks;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://docuport.app/");
        driver.manage().window().fullscreen();

// Find the username and password input fields
        WebElement usernameField = driver.findElement(By.id("input-14"));
        WebElement passwordField = driver.findElement(By.id("input-15"));

// Enter the username and password values
        usernameField.sendKeys("b1g2_supervisor@gmail.com");
        passwordField.sendKeys("Group2");

// Find and click on the login button
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Log in']"));
        loginButton.click();
    }
}