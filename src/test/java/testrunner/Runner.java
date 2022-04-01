package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(plugin = { "pretty",
        "html:target/cucumber-reports/cucumber-pretty" },
features = "src/test/resources/features/", glue = "stepdefinitions")
 
public class Runner extends AbstractTestNGCucumberTests {

}