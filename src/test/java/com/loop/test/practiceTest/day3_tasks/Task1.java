package com.loop.test.practiceTest.day3_tasks;
/*
        1- Open a chrome browser
        2- Go to: https://google.com
        3- Click to Gmail from top right.
        4- Verify title contains:
        Expected: Gmail
        5- Go back to Google by using the .back();
        6- Verify title equals:
        Expected: Google
        */

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Actual title: " + actualTitle + " matched expected title: " + expectedTitle + " = TEST PASS");
        } else {
            System.err.println("Actual title: " + expectedTitle + " DOES NOT match expected title: " + expectedTitle + " = TEST FAIL");

            String expectedTitle1 = "Google";
            String actualTitle1 = driver.getTitle();
            if (actualTitle1.contains(expectedTitle1)) {
                System.out.println("Actual title: " + actualTitle1 + " matched expected title: " + expectedTitle1 + " = TEST PASS");
            } else {
                System.err.println("Actual title: " + expectedTitle1 + " DOES NOT match expected title: " + expectedTitle1 + " = TEST FAIL");

                driver.navigate().back();
            }
        }
        driver.quit();
    }
}
