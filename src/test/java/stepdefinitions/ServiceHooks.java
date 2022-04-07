package stepdefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.InitiateDriver;

public class ServiceHooks {
	
	//To capture screenshot in report in case of test failure
	@After
	public void captureScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			//scenario.embed(((TakesScreenshot) InitiateDriver.getInstance()).getScreenshotAs(OutputType.BYTES), "image/png");
			
			scenario.attach(((TakesScreenshot) InitiateDriver.getInstance()).getScreenshotAs(OutputType.BYTES), "image/png", null);
			
		}	
	}
	
	
	

}