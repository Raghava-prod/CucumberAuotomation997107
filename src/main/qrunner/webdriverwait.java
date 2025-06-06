package main.qrunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.NoSuchElementException;

import static java.awt.Color.green;
import static java.awt.SystemColor.window;

public class webdriverwait {

    ChromeDriver driver=new ChromeDriver();

   public  boolean waitUntilEleentExist() {
       try {
           WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20));
           wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
           return true;
       } catch (Exception e) {

           return false;
       }
   }

   public boolean  waitUntilElementLoads(){
WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(20));
return wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))).isEnabled();

   }
    public  boolean waitUntilElementclickable() {
        try {
            WebDriverWait wt = new WebDriverWait(driver, Duration.ofSeconds(20));
            wt.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
            return true;
        } catch (Exception e) {

            return false;
        }
    }

    public void fluntwt(){
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(5))
                .ignoring(NoSuchElementException.class);

    }

}
