package AlertsDemos;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pac.config.Config;

public class AuthenticatePopups {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		 * String ChromeDriver
		 * ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe";
		 * System.setProperty("webdriver.chrome.driver",ChromeDriver); WebDriver driver
		 * = new ChromeDriver();
		 */
		
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		
	}

}
