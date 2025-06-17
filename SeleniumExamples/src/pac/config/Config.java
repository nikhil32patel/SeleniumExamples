package pac.config;

import java.util.Collections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Config {

	static WebDriver driver;
	public static WebDriver startBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions chromoption = new ChromeOptions();
			//WebDriverManager.chromedriver().setup();
			chromoption.addArguments("--disable-notifications");
			chromoption.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));
		    
			//driver = new ChromeDriver(chromoption);*/
		    
		    driver = new ChromeDriver(chromoption);
		}
	return driver;
	}
}
