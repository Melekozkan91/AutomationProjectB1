package com.loop.test.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    //Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.

    /*
    Creating the private constructor so this class' object is not reachable from outside
     */

    private Driver() {        //private constructor
    }

    /*
    Making driver instance private
    Static - run before everything else and also use in static method
     */

    private static WebDriver driver;

    /*
    I need reusable method that will return the same driver instance everytime when called.
     */
          /**

           singleton pattern
           return driver
           @author Melek
          */

          public static WebDriver getDriver(){
              if(driver==null){
                  String browserType = ConfigurationReader.getProperty("browser");
                  switch (browserType.toLowerCase()){
                      case "chrome":
                          WebDriverManager.chromedriver().setup();
                          driver = new ChromeDriver();
                          break;
                      case "firefox":
                          WebDriverManager.firefoxdriver().setup();
                          driver = new FirefoxDriver();
                          break;
                  }
                  driver.manage().window().maximize();
                  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
              }
              return driver;
          }

        /**

        closing driver
        @author Melek
         */
        public static void closeDriver (){
            if (driver !=null){
                driver.quit();
                driver = null;

        }
    }


}