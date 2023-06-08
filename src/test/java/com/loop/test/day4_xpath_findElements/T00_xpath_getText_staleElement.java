package com.loop.test.day4_xpath_findElements;

import com.loop.test.utilities.DocuportConstants;
import com.loop.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T00_xpath_getText_staleElement {
    /*
 1. Open Chrome browser
 2. Go to docuport
 3. Click on forgot password
 4. validate URL contains: reset-password
 5. validate - Enter the email address associated with your account
 6. enter forgotpasswordg1@gmail.com to email box
 7. validate cancel button is displayed
 8. validate send button is displayed
 9. click send button
 10. validate - We've sent you an email with a link to reset your password. Please check your email
  */
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app/");
        WebElement forgotPassword = driver.findElement(By.xpath("//a[.='Forgot password?']"));
        forgotPassword.click();

        String actualUrlForResetPassword = driver.getCurrentUrl();
        System.out.println(actualUrlForResetPassword);

        if (actualUrlForResetPassword.contains(DocuportConstants.RESET_PASSWORD_URL)){
            System.out.println("actual url: "+actualUrlForResetPassword +" contains expected url: "+DocuportConstants.RESET_PASSWORD_URL);
        }else {
            System.out.println("Actual url: "+actualUrlForResetPassword + " does not contains expected url: "+DocuportConstants.RESET_PASSWORD_URL);
        }
        WebElement validateMessage = driver.findElement(By.xpath("//div[@class='v-messages__message']"));
        String actualValidateMessage =validateMessage.getText();
        System.out.println(actualValidateMessage);


        if (actualValidateMessage.contains(DocuportConstants.RESET_PASSWORD_MESSAGE)){
            System.out.println("TEST PASS : =>Actual validate message \""+actualValidateMessage +"\" contains expected \"url: "+DocuportConstants.RESET_PASSWORD_MESSAGE);
        }else {
            System.out.println("TEST FAIL : => Actual validate message \" "+actualValidateMessage + " \"does not contains \" expected url: "+DocuportConstants.RESET_PASSWORD_MESSAGE);
        }

        // 6. enter forgotpasswordg1@gmail.com to email box
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@type='email']"));
        emailInputBox.sendKeys(DocuportConstants.EMAIL_FOR_RESET_PASSWORD);

        // 7. validate cancel button is displayed
        WebElement cancelButton = driver.findElement(By.xpath("//span[.=' Cancel ']"));
        WebElement sentButton = driver.findElement(By.xpath("//span[.=' Send ']"));

        if (cancelButton.isDisplayed()){
            System.out.println("TEST PASS => Cancel button is displayed");
        }else {
            System.out.println("TEST FAILED => Cancel button is NOT displayed");
        }

        // 8. validate send button is displayed
        if (sentButton.isDisplayed()){
            System.out.println("TEST PASS => Send button is displayed");
        }else {
            System.err.println("TEST FAILED => Send button is NOT displayed");
        }

        //9. click send button
        sentButton.click();
        Thread.sleep(3000);

        //10. validate - We've emailed you with a link to reset your password. Please check your email
        WebElement successMessage = driver.findElement(By.xpath("//span[@class='body-1']"));

        Thread.sleep(3000);



        try {
            System.out.println(successMessage.getText()+" we succesfully got the mwssage");
        }catch (StaleElementReferenceException e){
            System.out.println("Element is not accessible anymore");
            e.printStackTrace();

        }









        //driver.quit();




    }
}
