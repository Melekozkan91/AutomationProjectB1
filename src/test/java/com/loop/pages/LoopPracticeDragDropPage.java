package com.loop.pages;

import com.loop.test.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoopPracticeDragDropPage {
    @FindBy(id="draggable")
    public WebElement smallCircle;
   // WebElement element = Driver.getDriver().findElement(By.id()); // same the line 10-11

    @FindBy(id = "droptarget")
    public static WebElement bigCircle;
    public LoopPracticeDragDropPage(){
        PageFactory.initElements(Driver.getDriver(),this); // I will be able to which any class without the page
    }
}
