package stepdefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePageObjects;
import utils.InitiateDriver;

public class OpenHomePage {
	Logger logger = null;
	WebDriver driver = null;
	
	public OpenHomePage() {
		logger = Logger.getLogger(OpenHomePage.class);
	}

    @Given("Driver is initiated")
	public void initiateDriver() {
    	logger.info("Initiating driver");
		driver = InitiateDriver.getInstance();
		logger.info("Driver initiated");
	}

    
    @When("Home page is opened")
	public void openHomepage()
	{
    	logger.info("Opening homepage");
		driver.get(Constants.HOMEPAGE_URL);	
		logger.info("Homepage opened");
	}
    
    
    @Then("Logo is displayed")
    public void isLogoDisplayed()
	{
    	logger.info("Checking if logo is displayed on the homepage");
    	HomePageObjects.isLogoDisplayed(driver);
    	logger.info("Logo is coming");
	}
    
    
    @Then("Close the page")
    public void quitDriver()
	{
    	logger.info("Quitting driver");
    	InitiateDriver.quitDriver();
	}
    
}
