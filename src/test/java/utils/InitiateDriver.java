package utils;

import java.io.BufferedReader;
import static constants.Constants.*;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitiateDriver {
	private static WebDriver driver = null;
	private static Properties properties;
	static BufferedReader reader;
	
	
	private InitiateDriver() {
		
	}
	
	static
	{
		System.out.println("CalledTEST");
		properties = new Properties();
		try {
			reader = new BufferedReader(new FileReader(PROPERTY_FILE_PATH));
			properties.load(reader);
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static WebDriver getInstance() {
		if(driver==null) {
			System.setProperty("webdriver.chrome.driver",properties.getProperty("driverPath"));
			driver = new ChromeDriver();
			//driver.manage().window().maximize();
		}
		return driver;
	}
	
	public static void quitDriver() {
		driver.quit();
	}
}
