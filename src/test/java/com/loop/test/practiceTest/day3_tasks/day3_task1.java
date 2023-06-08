package com.loop.test.practiceTest.day3_tasks;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class day3_task1 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/forgot_password");

    }
}
