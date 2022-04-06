package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Then;
import utils.InitiateDriver;

public class BuyCloth {
	WebDriver driver = null;
	private final static String BUY_CLOTH_XPATH_START = "//div[@class=\"left-block\"]//a[contains(@title,\"";
	private final static String BUY_CLOTH_XPATH_END = "\")]";
	private final static String ADD_TO_CART_BUTTON_XAPTH = "//button[@name=\"Submit\"]";

	private final static String PROCEED_TO_CHECKOUT_XPATH = "//div[@class=\"button-container\"]//a[contains(@class,\"btn\")]//span[contains(text(),\"Proceed to checkout\")]";
	private final static String QUANTITY_INPUT_XPATH = "//input[contains(@class,\"cart_quantity_input form-control\")]";
	WebDriverWait wait = null;
	@SuppressWarnings("deprecation")
	public BuyCloth() {
		
		driver = InitiateDriver.getInstance();
		wait = new WebDriverWait (driver, 20);

	}

	@Then("Buy a {string}")
    public void buyCloth(String cloth) throws Exception{
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
    }
}
