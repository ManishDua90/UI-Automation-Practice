package testrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.InitiateDriver;

@CucumberOptions(
        features = "/Users/mmt9178/eclipse-workspace/Personal/UIAutomation/UI-Automation-Practice/src/test/resources/features/",
        glue = {"stepdefinitions"},
        plugin = {
                "pretty","html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })

public class Runner extends AbstractTestNGCucumberTests{
	
	@AfterClass
	public void quitDriver()
	{
		InitiateDriver.quitDriver();
	}
	

}
