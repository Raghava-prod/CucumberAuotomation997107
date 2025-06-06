package test;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Emailautomation {


    public static void main(String[] args) {
        // Set up ChromeDriver using WebDriverManager
        System.setProperty("Webdriver.chrome.driver","C:/Program Files (x86)/chromedriver-win32/chromedriver.exe");

       // System.setProperty("Webdriver.chrome.driver","C:/Program Files (x86)/edgedriver_win64/msedgedriver.exe");
//EdgeDriver driver = new EdgeDriver();
ChromeDriver driver = new ChromeDriver();

            // Maximize the browser window
            driver.manage().window().maximize();

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


            // Navigate to Gmail login page
            driver.get("https://www.facebook.com/login/");

            // Locate and interact with the email field
            WebElement emailField = driver.findElement(By.id(""));
            emailField.sendKeys("vangurragavendar@gmail.com"); // Replace with your email
            driver.findElement(By.xpath("//span[text()='Next']")).click();

            // Wait for password field to be visible and interact with it
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
          
           JavascriptExecutor js = (JavascriptExecutor) driver;

            WebElement passwordField = driver.findElement(By.name("password"));
            passwordField.sendKeys("8185997107"); // Replace with your password
            driver.findElement(By.xpath("//span[text()='Next']")).click();

            // Optional: Handle Two-Factor Authentication (if enabled)
            System.out.println("If 2FA is enabled, please enter the OTP manually.");
            new java.util.Scanner(System.in).nextLine(); // Pause for manual OTP entry


    }

}
