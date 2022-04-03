package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import utils.InitiateDriver;

public class PopularClothing {
	WebDriver driver = null;
	
	public PopularClothing() {
		driver = InitiateDriver.getInstance();
	}

	@Then("{string} is displayed on the screen")
    public void clothIsDisplayed(String cloth) {
        boolean isDisplayed = driver.findElement(By.partialLinkText(cloth)).isDisplayed();
        Assert.assertEquals(true, isDisplayed);
    }
}
