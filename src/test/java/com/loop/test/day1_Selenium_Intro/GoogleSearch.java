package com.loop.test.day1_Selenium_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        /**
         * Navigate to Google search
         * get title of the page
         * get url of the page
         * validate the title, expected title is "Google"
         * validate the Url of the page, expected url is "https://www.google.com/"
         * close the browser
         */
        //setup the driver
        WebDriverManager.chromedriver().setup();

        //create driver object
        WebDriver driver = new ChromeDriver();

        //navigate to google page
        driver.get("https://www.google.com/");



        //maximize the window
        driver.manage().window().fullscreen();

        String expectedTitle ="Google";
        String expectedUrl ="https://www.google.com/";

        String actualTitle=driver.getTitle();

        System.out.println("actualTitle = " + actualTitle);




        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual title: "+actualTitle+" matched expected title: "+expectedTitle+" = TEST PASS");
        }else {
            System.err.println("Actual title: "+actualTitle+" DOES NOT match expected title: "+expectedTitle+" = TEST FAIL");

        }

        String actualUrl= driver.getCurrentUrl();


        if (actualTitle.contains(expectedTitle)){
            System.out.println("Actual url: "+actualUrl+" matched expected title: "+expectedUrl+" = TEST PASS");
        }else {
            System.err.println("Actual url: "+actualUrl+" DOES NOT match expected title: "+expectedUrl+" = TEST FAIL");

        }

        //quit the browser
        driver.quit();






    }
}
