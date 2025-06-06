package test.Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WindowHandles {
     public static   WebDriver driver = new ChromeDriver();
      public static  String actual = "Pinterest";
     public static   String Pinterest_actual ="The password you entered is incorrect. Try again or ";

        public static void main(String[] args) throws InterruptedException  {
            System.setProperty("Webdriver.chrome.driver","C:/Program Files (x86)/chromedriver-win32/chromedriver.exe");

            // System.setProperty("Webdriver.chrome.driver","C:/Program Files (x86)/edgedriver_win64/msedgedriver.exe");
//EdgeDriver driver = new EdgeDriver();
            ChromeDriver driver = new ChromeDriver();

            windowHandles(actual);

        }

        public static void windowHandles(String Expected) throws InterruptedException
        {
            driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
            driver.manage().window().maximize();
            List<WebElement> list = driver.findElements(By.xpath("//span[@class='share-button-link-text']"));
            for(WebElement ele : list)
            {
                ele.click();
            }
            Set<String> windowids=driver.getWindowHandles();
            for(String win_id : windowids)
            {
                driver.switchTo().window(win_id);

                String Currentwindowtitle = driver.getTitle();
                System.out.println(Currentwindowtitle);
                if(Currentwindowtitle.equalsIgnoreCase(Expected))
                {
                    System.out.println("Second Window Title :" + " " + driver.getTitle());
                    driver.manage().window().maximize();
                    driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Haritha@gmail.com");
                    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("LordShiva@143");
                    driver.findElement(By.xpath("//button[@type='submit']/descendant::div/div")).click();
                    String Pinterest_Expected=driver.findElement(By.xpath("(//div[@data-test-id='touchableErrorMessage']/span)[1]")).getText();
                    if(Pinterest_actual.equalsIgnoreCase(Pinterest_Expected))
                    {
                        System.out.println("Login Message :" + Pinterest_actual);
                    }
                    //Thread.sleep(3000);
                    break;
                }
            }

            Select select1 = new Select(driver.findElement(By.xpath("")));
            select1.selectByValue("");


            driver.findElement(By.xpath("//div[@data-test-id='touchableErrorMessage']/table//tbody//tr[1]")).click();


        }




    }


