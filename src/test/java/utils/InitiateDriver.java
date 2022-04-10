package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitiateDriver {
	private static WebDriver driver = null;
	private static Properties properties;
	private final static String propertyFilePath= "src/test/resources/configs/config.properties";
	static BufferedReader reader;
	
	
	private InitiateDriver() {
		
	}
	
	static
	{
		System.out.println("CalledTEST");
		properties = new Properties();
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
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
