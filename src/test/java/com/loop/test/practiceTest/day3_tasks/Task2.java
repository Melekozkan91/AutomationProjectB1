package com.loop.test.practiceTest.day3_tasks;
/*
        Task 2
        ================
        1. Open Chrome browser
        2. Go to https://www.etsy.com
        3. Search for “wooden spoon”
        4. Verify title:
        Expected: “Wooden spoon | Etsy”
        */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/");
        driver.manage().window().fullscreen();
        WebElement search = driver.findElement(By.id("global-enhancements-search-query"));
        search.click();

        String textToSearch = "Wooden spoon";
        search.sendKeys(textToSearch + Keys.ENTER);

        String expectedTitle = "Wooden spoon | Esty";
        String actualTitle2 = driver.getTitle();

        if (actualTitle2.contains(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle2 + " matched expected title: " + expectedTitle + " = TEST PASS");
        } else {
            System.err.println("Actual title: " + expectedTitle + " DOES NOT match expected title: " + expectedTitle + " = TEST FAIL");

            driver.navigate().back();
        }
        driver.quit();
    }

}
