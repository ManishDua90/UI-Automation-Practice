package testrunner;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.InitiateDriver;

@CucumberOptions(
        features = "/Users/mmt9178/eclipse-workspace/Personal/UIAutomation/UI-Automation-Practice/src/test/resources/features/",
        glue = {"stepdefinitions"},
        //tags = "@OpenHomePage",
        plugin = {
                "pretty","html:target/cucumber-reports/cucumber-pretty",
//                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/rerun.txt",
//                "rerun:target/cucumber-reports/rerun.txt",
//                "cucumberHooks.customReportListener",
        		"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" }, monochrome = true
        )

public class Runner extends AbstractTestNGCucumberTests{
	Logger logger = null;
	
	public Runner()
	{
		logger = Logger.getLogger(Runner.class);
	}
	@BeforeClass
	public void start()
	{
		logger.info("Starting the runner class");
	}
	
	@AfterClass
	public void quitDriver()
	{
		InitiateDriver.quitDriver();
		logger.info("Runner finished");
	}

}
