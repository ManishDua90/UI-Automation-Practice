package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElement {
	
	static WebElement element = null;
	public static WebElement byXPath(WebDriver driver, String xpath)
	{
		element = driver.findElement(By.xpath(xpath));
		return element;
	}

}
