package AlertsDemos;

import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pac.config.Config;

public class PermissionPopupNotification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_101.0.4951.41\\chromedriver_win32_101.0.4951.41\\chromedriver.exe"; 
//		System.setProperty("webdriver.chrome.driver",ChromeDriver);
//		ChromeOptions chromeoption = new ChromeOptions();
//		chromeoption.addArguments("--disable-notifications");
//		chromeoption.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation")); 
//		WebDriver driver = new ChromeDriver(chromeoption);
		
		WebDriver driver = Config.startBrowser("chrome");
		
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
	}

}
