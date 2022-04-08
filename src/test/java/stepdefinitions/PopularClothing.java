package stepdefinitions;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import utils.InitiateDriver;

public class PopularClothing {
	WebDriver driver = null;
	Logger logger = null;
	
	public PopularClothing() {
		driver = InitiateDriver.getInstance();
		logger = Logger.getLogger(PopularClothing.class);
		}

	@Then("{string} is displayed on the screen")
    public void clothIsDisplayed(String cloth) {
		logger.info("Checking whether " + cloth + " is present on the homepage");
        boolean isDisplayed = driver.findElement(By.partialLinkText(cloth)).isDisplayed();
        Assert.assertEquals(true, isDisplayed);
        logger.info(cloth + " is present on the homepage");
    }
}
