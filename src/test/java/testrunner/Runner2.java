package testrunner;

import org.testng.annotations.AfterClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.InitiateDriver;

@CucumberOptions(
        features = "/Users/mmt9178/eclipse-workspace/Personal/UIAutomation/UI-Automation-Practice/src/test/resources/features/OpenHomePage.feature",
        glue = {"stepdefinitions"},
        plugin = {
                "pretty","html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })

public class Runner2 extends AbstractTestNGCucumberTests{
	
	@AfterClass
	public void quitDriver()
	{
		InitiateDriver.quitDriver();
	}

}
