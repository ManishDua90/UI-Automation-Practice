package testrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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

public class Runner extends AbstractTestNGCucumberTests{
	
	@Test (priority = 2)
	public void test1()
	{
		System.out.println("THIS IS A TEST1");
	}
	
	
	@Test (priority = 0)
	public void test2()
	{
		System.out.println("THIS IS A TEST2");
	}
	
	@Test
	public void test3()
	{
		System.out.println("THIS IS A TEST3");
	}
	
	@Test
	@Parameters({"testparam"})
	public void test4(String value)
	{
		System.out.println("THIS IS A TEST4 parameter : " + value);
	}
	
	
	@Test (priority = 1)
	public void test()
	{
		System.out.println("THIS IS A TEST");
	}
	
	@Test (dataProvider = "data-provider")
	public void test5(String value)
	{
		System.out.println("THIS IS A TEST5 : " + value);
	}
	
	@AfterClass
	public void quitDriver()
	{
		InitiateDriver.quitDriver();
	}
	
	
	
	 @DataProvider (name = "data-provider")
     public Object[] dpMethod(){
	 return new Object[] {"First-Value", "Second-Value"};
     }

}
