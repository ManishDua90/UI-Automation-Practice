package stepdefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import common.SiteSignIn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.InitiateDriver;

public class SignIn {
	WebDriver driver = null;
	SiteSignIn signIn = null; 
	Logger logger = null;
	

	public SignIn() {
		driver = InitiateDriver.getInstance();
		signIn = new SiteSignIn();
		logger = Logger.getLogger(SignIn.class);
	}

	@When("I do a login with {string} and {string}")
	public void enterLoginCredential(String email, String password)
	{
		logger.info("Trying signin");
		signIn.signin(email, password);
		logger.info("Signin successful");
		
	}
	
	@Then("I am able to see {string} logged in")
    public void userLoggedIn(String username) {
		logger.info("Check whether " + username + " is logged in ");
		Assert.assertEquals(pageobjects.SignIn.getLoggedInUsernameElement(driver, username).getText().toString(), username);
		logger.info(username + " is logged in ");
	}

}
