package SampleTests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;


    @Given("I launch chrome browser")
    public void i_launch_chrome_browser() {
        System.setProperty("Webdriver.chrome.driver","C:/Program Files (x86)/chromedriver-win32/chromedriver.exe");
String sys= System.getProperty("user.home");
System.out.println(sys);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    @When("I open orange hrm homepage")
    public void I_open_orange_hrm_homepage() throws InterruptedException {
        System.out.print("k");
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);
        boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertEquals(true,status);
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("^I verify user enters (.*) and (.*)$")
    public void i_verify_that_the_logo_present_on_page(String username, String password) throws InterruptedException {

        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(30000);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(30000);

        // Write code here that turns the phrase above into concrete actions

    }
    @And("close browser")
    public void close_browser() {

        driver.quit();
        // Write code here that turns the phrase above into concrete actions

    }

}
