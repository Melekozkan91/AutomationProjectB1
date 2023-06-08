package com.loop.test.day7_windows_webtables;

import com.loop.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

import static org.testng.Assert.assertTrue;

public class T1_windows extends TestBase {
    /*
    1. Open a chrome browser
    2. Go to : http://the-internet.herokuapp.com/windows
    3. Assert: Title is “The Internet”
    4. Click to: “Click Here” link
    5. Switch to new Window.
    6. Assert: Title is “New Window”
     */

    @Test
    public void test_window_handle(){
        driver.get("http://the-internet.herokuapp.com/windows");
        assertTrue(driver.getTitle().contains("The internet"));
        WebElement clickHere =driver.findElement(By.xpath("//a[@href='/windows/new']"));
        clickHere.click();

        //System.out.println("This is my window handle" + driver.getWindowHandles());

        Set <String> windowHandles = driver.getWindowHandles();

        for (String each : windowHandles) {
            System.out.println("each window s handle: "+each);
            driver.switchTo().window(each);
        }
        //System.out.println("This is my current URL: "+driver.getCurrentUrl()); //does not
        System.out.println("This is my current title: "+driver.getTitle());
        WebElement newWindow =driver.findElement(By.xpath("//h3[contains(text(),'New Window')]"));
        System.out.println(newWindow.getText());

    }

}
