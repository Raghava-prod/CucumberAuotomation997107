package SampleTests;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:/User Data/CucumberProject/Features",glue={"SampleTests"},
monochrome = true,plugin={
        "json:C:/User Data/CucumberProject/Test/CucumberReport.json"})
public class LoginHRMpage {
}
