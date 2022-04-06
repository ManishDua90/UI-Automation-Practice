package common;

import org.openqa.selenium.WebDriver;

import utils.InitiateDriver;

public class SiteSignIn extends SignIn{
	
	WebDriver driver = null;
	public SiteSignIn() {
		driver = InitiateDriver.getInstance();
	}

	@Override
	public void signin(String email, String pass) {
		pageobjects.SignIn.getSignInLinkElement(driver).click();
		pageobjects.SignIn.getEmailElement(driver).sendKeys(email);
		pageobjects.SignIn.getPasswordElement(driver).sendKeys(pass);
		pageobjects.SignIn.getSubmitButtonElement(driver).click();
	}

}
