package pac.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Config {

	static WebDriver driver;
	public static WebDriver startBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			ChromeOptions chromoption = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver(chromoption);
		}
	return driver;
	}
}
