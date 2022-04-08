package common;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import utils.InitiateDriver;

public class SiteSignIn extends SignIn{
	
	WebDriver driver = null;
	Logger logger = null;

	public SiteSignIn() {
		driver = InitiateDriver.getInstance();
		logger = Logger.getLogger(SiteSignIn.class);
	}

	@Override
	public void signin(String email, String pass) {
		logger.info("Trying to login.");
		pageobjects.SignIn.getSignInLinkElement(driver).click();
		pageobjects.SignIn.getEmailElement(driver).sendKeys(email);
		pageobjects.SignIn.getPasswordElement(driver).sendKeys(pass);
		pageobjects.SignIn.getSubmitButtonElement(driver).click();
		logger.info("Login successful!");
	}

}
