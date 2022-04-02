package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitiateDriver {
	private static WebDriver driver = null;
	
	private InitiateDriver() {
	}
	
	public static WebDriver getInstance() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver","/Users/mmt9178/eclipse-workspace/Personal/UIAutomation/UI-Automation-Practice/src/test/resources/drivers/chromedriver");
			driver = new ChromeDriver();
		}
		return driver;
	}
	
	public static void quitDriver() {
		driver.quit();
	}
}
