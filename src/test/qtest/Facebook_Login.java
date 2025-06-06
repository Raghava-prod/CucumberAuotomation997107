package test.qtest;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Facebook_Login {

    public static void main(String[] args) {
        // Set up ChromeDriver using WebDriverManager
        System.setProperty("Webdriver.chrome.driver", "C:/Program Files (x86)/chromedriver-win32/chromedriver.exe");

        // System.setProperty("Webdriver.chrome.driver","C:/Program Files (x86)/edgedriver_win64/msedgedriver.exe");
//EdgeDriver driver = new EdgeDriver();
        ChromeDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://www.facebook.com/login/");
        driver.get("https://www.facebook.com/login/");

        driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("Raghavendra@gmail.com");
        driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("12356474");
        driver.findElement(By.xpath("//button[contains(@id,'loginbutton')]")).click();

    }

}
