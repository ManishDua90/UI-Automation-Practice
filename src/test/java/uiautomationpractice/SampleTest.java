package uiautomationpractice;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import constants.Constants;
import  utils.InitiateDriver;

public class SampleTest {

	WebDriver driver = null;

	@BeforeClass
	public void initiateDriver() {
		driver = InitiateDriver.getInstance();
	}

	@Test
	public void openHomepage()
	{
		driver.get(Constants.HOMEPAGE_URL);
		InitiateDriver.quitDriver();	
	}

}
