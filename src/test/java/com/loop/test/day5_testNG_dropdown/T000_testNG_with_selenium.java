package com.loop.test.day5_testNG_dropdown;

import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.rmi.Remote;
import java.time.Duration;

public class T000_testNG_with_selenium {
    //Set up chrome and create driver
    //go to google.com
    //Assert; title is "Google"
    WebDriver driver;
    String expected;
    String actual;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
    @Test(priority = 1)
    public void googleTitle(){

        driver.get("https://www.google.com/");
        System.out.println("((RemoteWebDriver)driver).getSessionId()) = "+((RemoteWebDriver)driver).getSessionId());
        expected ="Google";
        actual =driver.getTitle();
        Assert.assertEquals(expected,actual,"does not match ");
    }
    @Test(priority = 2)
    public void docuportTitle(){

        driver.get("https://beta.docuport.app/");
        System.out.println("((RemoteWebDriver)driver).getSessionId()) = "+((RemoteWebDriver)driver).getSessionId());
        expected ="Docuport";
        actual =driver.getTitle();
        Assert.assertTrue(actual.contains(expected));
    }

}
