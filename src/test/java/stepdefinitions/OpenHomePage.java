package stepdefinitions;

import org.openqa.selenium.WebDriver;

import constants.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.HomePageObjects;
import utils.InitiateDriver;

public class OpenHomePage {

	WebDriver driver = null;

    @Given("Driver is initiated")
	public void initiateDriver() {
		driver = InitiateDriver.getInstance();
	}

    
    @When("Home page is opened")
	public void openHomepage()
	{
		driver.get(Constants.HOMEPAGE_URL);	
	}
    
    
    @Then("Logo is displayed")
    public void isLogoDisplayed()
	{
    	HomePageObjects.isLogoDisplayed(driver);
	}
    
    
    @Then("Close the page")
    public void quitDriver()
	{
    	InitiateDriver.quitDriver();
	}
    
}
