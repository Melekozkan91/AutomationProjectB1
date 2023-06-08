package com.loop.test.day3_css_xpath;

import com.loop.test.utilities.DemoQaConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    /*
     * go to url: https://demoqa.com/automation-practice-form
     * verify header text expected - Student registration from
     * verify placeholder attribute value is expected - username
     */
    public static void main(String[] args) {


        // got to the URL
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        //WebElement headerForForm =driver.findElement(By.tagName("h5"));
        String actualHeaderForForm =driver.findElement(By.tagName("h5")).getText();


        if (actualHeaderForForm.contains(DemoQaConstants.EXPECTED_HEADER_FOR_FORM)){
            System.out.println("Expected header message: "+DemoQaConstants.EXPECTED_HEADER_FOR_FORM+" matched expected title: "+actualHeaderForForm+" = TEST PASS");
        }else {
            System.out.println("Expected header message: "+DemoQaConstants.EXPECTED_HEADER_FOR_FORM+" DOES NOT match expected title: "+actualHeaderForForm );
            System.err.println("TEST FAILED");

        }

        //get placeholder
        WebElement firstNamePlaceHolder =driver.findElement(By.id("firstName"));
        System.out.println(firstNamePlaceHolder.getText()+"===> this is from get text");
        //System.out.println(firstNamePlaceHolder.getAttribute("placeholder"));
        String actualPlaceHolder =firstNamePlaceHolder.getAttribute("placeholder");



        if (actualPlaceHolder.equals(DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME)){
            System.out.println("Expected placeholder: "+DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME+" matched expected title: "+actualPlaceHolder+" = TEST PASS");
        }else {
            System.out.println("Expected placeholder: "+DemoQaConstants.EXPECTED_PLACEHOLDER_FIRST_NAME+" DOES NOT match expected title: "+actualPlaceHolder);
            System.err.println("TEST FAILED");

        }







        driver.quit();

    }
}