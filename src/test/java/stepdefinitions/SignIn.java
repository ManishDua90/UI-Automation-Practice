package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import common.SiteSignIn;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.InitiateDriver;

public class SignIn {
	WebDriver driver = null;
	SiteSignIn signIn = null; 
	

	public SignIn() {
		driver = InitiateDriver.getInstance();
		signIn = new SiteSignIn();
	}

	@When("I do a login with {string} and {string}")
	public void enterLoginCredential(String email, String password)
	{
		signIn.signin(email, password);
	}
	
	@Then("I am able to see {string} logged in")
    public void buyCloth(String username) {
		Assert.assertEquals(pageobjects.SignIn.getLoggedInUsernameElement(driver, username).toString(), username);
	}

}
