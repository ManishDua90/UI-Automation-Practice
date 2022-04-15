package constants;

public class BuyClothConstants {
	
	public final static String BUY_CLOTH_XPATH_START = "//div[@class=\"left-block\"]//a[contains(@title,\"";
	public final static String BUY_CLOTH_XPATH_END = "\")]";
	public final static String ADD_TO_CART_BUTTON_XAPTH = "//button[@name=\"Submit\"]";

	public final static String PROCEED_TO_CHECKOUT_XPATH = "//div[@class=\"button-container\"]//a[contains(@class,\"btn\")]//span[contains(text(),\"Proceed to checkout\")]";
	public final static String QUANTITY_INPUT_XPATH = "//input[contains(@class,\"cart_quantity_input form-control\")]";


}
