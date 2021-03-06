package stepdefinitions;

import org.apache.log4j.Logger;
import static constants.BuyClothConstants.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Then;
import utils.InitiateDriver;

public class BuyCloth {
	Logger logger = null;
	WebDriver driver = null;
	WebDriverWait wait = null;
	@SuppressWarnings("deprecation")
	public BuyCloth() {
		
		driver = InitiateDriver.getInstance();
		wait = new WebDriverWait (driver, 20);
		logger = Logger.getLogger(BuyCloth.class);
	}

	@Test(retryAnalyzer = utils.RetryAnalyzer.class)
	@Then("Buy a {string}")
    public void buyCloth(String cloth) throws Exception{
		logger.info("Buy cloth step started");
        boolean isDisplayed = driver.findElement(By.partialLinkText(cloth)).isDisplayed();
        Assert.assertEquals(true, isDisplayed);
        driver.findElement(By.xpath(BUY_CLOTH_XPATH_START+cloth+BUY_CLOTH_XPATH_END)).click();
       
        Thread.sleep(5000);
        driver.switchTo().frame(1);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(ADD_TO_CART_BUTTON_XAPTH))));
        driver.findElement(By.xpath(ADD_TO_CART_BUTTON_XAPTH)).click();

        driver.switchTo().parentFrame();
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(PROCEED_TO_CHECKOUT_XPATH))));
        driver.findElement(By.xpath(PROCEED_TO_CHECKOUT_XPATH)).click();
        int quantity = Integer.parseInt(driver.findElement(By.xpath(QUANTITY_INPUT_XPATH)).getAttribute("value"));
        Assert.assertEquals(quantity, 1);
        logger.info("Buy cloth step finished");
    }
}
