package org.orangehrm.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.orangehrm.factory.DriverFactory;

import java.time.Duration;

public class WaitUtil {

     WebDriverWait wait;
     WebDriver driver;
     public WaitUtil(WebDriver driver){
        this.driver=driver;
          wait=new WebDriverWait(driver, Duration.ofSeconds(10));
     }

   public void  waitForVisibilityOfElement(WebElement element){
       wait.until(ExpectedConditions.visibilityOf(element));
   }
   public void waitForPresenceOfElementBy(By element){
         wait.until(ExpectedConditions.presenceOfElementLocated(element));
   }
   public void waitForUrl(String url){
         wait.until(ExpectedConditions.urlContains(url));
   }


}
