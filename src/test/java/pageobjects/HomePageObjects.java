package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.FindElement;

public class HomePageObjects {
	
	static WebElement element = null;
	private static final String LOGO_XPATH = "//img[@class='logo img-responsive']";
	
	public static WebElement isLogoDisplayed(WebDriver driver) {
		element = FindElement.byXPath(driver, LOGO_XPATH);
		return element;
	}

}
