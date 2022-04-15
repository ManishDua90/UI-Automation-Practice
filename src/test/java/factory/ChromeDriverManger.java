package factory;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverManger extends DriverManager{
    private ChromeDriverService chService;

	@Override
	public void startServices() {
		if(chService==null)
		{
			chService = new ChromeDriverService.Builder().usingDriverExecutable(new File("/src/test/resources/drivers/chromedriver")).usingAnyFreePort().build();
			try {
				chService.start();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void stopServices() {
		 if(chService != null && chService.isRunning() )
	            chService.stop();
	}

	@Override
	public void createDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.BROWSER_NAME, "Chrome");
        ChromeOptions options = new ChromeOptions();
        options.merge(capabilities);
        WebDriver driver=new ChromeDriver(options);
    
	}

}
