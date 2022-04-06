package testrunner;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterClass;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utils.InitiateDriver;

@CucumberOptions(
        features = "/Users/mmt9178/eclipse-workspace/Personal/UIAutomation/UI-Automation-Practice/src/test/resources/features/",
        glue = {"stepdefinitions"},
        plugin = {
                "pretty","html:target/cucumber-reports/cucumber-pretty",
//                "json:target/cucumber-reports/CucumberTestReport.json",
//                "rerun:target/cucumber-reports/rerun.txt",
//                "cucumberHooks.customReportListener",
        		"io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm" }, monochrome = true
        )

public class Runner extends AbstractTestNGCucumberTests{
	
	@AfterClass
	public void quitDriver()
	{
		InitiateDriver.quitDriver();
	}
	
	@AfterStep
	public void endstep(Scenario scenario) {
	if (scenario.isFailed()) {
	byte[] screenshot = ((TakesScreenshot) InitiateDriver.getInstance()).getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshot, "image/png", "screenshot");
	}
	}

}
