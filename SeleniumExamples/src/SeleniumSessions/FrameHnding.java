package SeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import pac.config.Config;

public class FrameHnding {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--disable-notifications");
//		
//		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\ChromeDriver 97.0.4692.71\\chromedriver.exe"; 
//		System.setProperty("webdriver.chrome.driver",ChromeDriver);
//		driver = new ChromeDriver(opt);
		
		driver = Config.startBrowser("chrome");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		
		driver.get("https://classic.freecrm.com");
		
		
		
	}

}
