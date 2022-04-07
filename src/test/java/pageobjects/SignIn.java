package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.FindElement;

public class SignIn {
	private static String EMAIL_XPATH = "//input[@id=\"email\"]";
	private static String PASSWORD_XPATH = "//input[@id=\"passwd\"]";
	private static String SUBMIT_BUTTON_XPATH = "//button[@name=\"SubmitLogin\"]";
	private static final String LOGGED_IN_USERNAME_XPATH_START = "//a//span[contains(text(),\"";
	private static final String LOGGED_IN_USERNAME_XPATH_END = "\"]";
	private static final String SIGN_IN_LINK_XPATH = "//a[@class=\"login\"]";
	
	
	
	static WebElement element = null;

	public static WebElement getEmailElement(WebDriver driver) {
		element = FindElement.byXPath(driver, EMAIL_XPATH);
		return element;
	}
	
	public static WebElement getPasswordElement(WebDriver driver) {
		element = FindElement.byXPath(driver, PASSWORD_XPATH);
		return element;
	}

	public static WebElement getSubmitButtonElement(WebDriver driver) {
		element = FindElement.byXPath(driver, SUBMIT_BUTTON_XPATH);
		return element;
	}
	
	public static WebElement getLoggedInUsernameElement(WebDriver driver, String username) {
		String temp = LOGGED_IN_USERNAME_XPATH_START + username + LOGGED_IN_USERNAME_XPATH_END;
		element = driver.findElement(By.xpath(temp));
		return element;
	}
	
	public static WebElement getSignInLinkElement(WebDriver driver) {
		element = FindElement.byXPath(driver, SIGN_IN_LINK_XPATH);
		return element;
	}
}
