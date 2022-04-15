package factory;


import org.openqa.selenium.WebDriver;

public abstract class  DriverManager {

	public WebDriver driver;
	public abstract void startServices();
	public abstract void stopServices();
	public abstract void createDriver();
    public void quitDriver()
    {
        if( driver != null)
        {
            driver.quit();
            driver = null;
        }
    }
    public WebDriver getDriver()
    {
        if ( driver == null)
        {
            startServices();
            createDriver();
            stopServices();
        }
        return driver;
    }

}
