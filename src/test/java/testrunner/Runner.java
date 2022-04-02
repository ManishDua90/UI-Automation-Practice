package testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "/Users/mmt9178/eclipse-workspace/Personal/UIAutomation/UI-Automation-Practice/src/test/resources/features/",
        glue = {"stepdefinitions"},
        plugin = {
                "pretty","html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt"
        })

public class Runner extends AbstractTestNGCucumberTests{

}
