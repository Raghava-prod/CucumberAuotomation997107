package SampleTests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginwithBackground {
    WebDriver driver;


    @Given("I launch the chrome browser for hrm")
    public void i_launch_the_chrome_browser_for_hrm() {
        // Write code here that turns the phrase above into concrete actions
        System.setProperty("Webdriver.chrome.driver", "C:/Program Files (x86)/chromedriver-win32/chromedriver.exe");
        String sys = System.getProperty("user.home");
        System.out.println(sys);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    @When("I open orange the hrm homepage for details")
    public void i_open_orange_the_hrm_homepage_for_details() throws InterruptedException {
        System.out.print("k");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
      //  Assert.assertEquals(true, status);
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("I verify user credentials")
    public void i_verify_user_credentials() throws InterruptedException {
        driver.findElement(By.name("username")).sendKeys("edwed");
        Thread.sleep(3000);
        driver.findElement(By.name("password")).sendKeys("ededed");
        Thread.sleep(3000);

        // Write code here that turns the phrase above into concrete actions

    }

}
