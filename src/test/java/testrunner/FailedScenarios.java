package testrunner;

import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    monochrome = true,
    features = "@target/rerun.txt", //Cucumber picks the failed scenarios from this file 
    plugin = {"pretty", "html:target/site/cucumber-pretty-failed",
            "json:target/cucumber.json"},
    glue = {"stepdefinitions"}
  )
public class FailedScenarios extends AbstractTestNGCucumberTests{
	@BeforeClass
	public void enter() {
		System.out.println("Entered failed scenarios");
	}

}