package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import net.bytebuddy.utility.RandomString;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class CuteBaby {

		
	static WebDriver driver;
	public static void main(String[] args) {
		 
		
		  double d = Math.round(Math.random()*10000); 
		  String randomNumbers = "720810"+Double.valueOf(d);
		  String mobileno = randomNumbers.substring(0, 10);
		  System.out.println(mobileno);
		  
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\ChromeDriver 97.0.4692.71\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",ChromeDriver);
		//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver(opt);
		driver.get("https://www.cutestbabyofindia.com/dashboard/contest/vote/6968515");
		driver.manage().window().maximize();
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
		driver.findElement(By.id("vote_name")).sendKeys("Jayana");
		driver.findElement(By.id("phone_number")).sendKeys(mobileno);
		driver.findElement(By.id("tap_vote")).click();
		
	}
}
