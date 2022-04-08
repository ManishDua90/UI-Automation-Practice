package stepdefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.InitiateDriver;

public class ServiceHooks {
	Logger logger = null;
	
	public ServiceHooks() {
		logger = Logger.getLogger(ServiceHooks.class);
	}
	
	@After
	public void captureScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			logger.info("Attaching screenshot for the failed step");
			scenario.attach(((TakesScreenshot) InitiateDriver.getInstance()).getScreenshotAs(OutputType.BYTES), "image/png", null);
			logger.info("Attached screenshot");
		}	
	}
}