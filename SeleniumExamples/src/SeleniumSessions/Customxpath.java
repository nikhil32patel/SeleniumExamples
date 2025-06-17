package SeleniumSessions;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pac.config.Config;

public class Customxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\ChromeDriver 93.0.4577.63\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("http://www.half.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//daynamic wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		// Absolute xpath
		//body/div[@id='mainContent']/div[1]/ul[1]/li[13]
		// 1 Performance issue
		// 2 not reliable
		// 3 can be changed at any time in future.
		
		
		// xpath alwayes start with // double slashs
		
		// USING ATTRIBUTE @CLASS
		//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("laptops");
		
		// USING ATTRIBUTE @NAME
		//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("laptops");
		
		// USING CONTAINS FUNCTION WITH @CLASS ATTRIBUTE
		//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("laptops");
		
		// ID IS DAYNAMIC : stats-with()
		// id= test_123
		// id= test_456
		// id= test_555
		// id= test_878
		
		
		// ID IS DAYNAMIC : contains() or ends-with()
		// id = 123_test
		// id = 456_test
		// id = 888_test_t
		
		// TO SOLVE THIS PROBLOM WE HAVE CONTAINS
		// TO HANDEL DAYNAMIC ID WE HAVE contains() FUNCTION OF XPATH LIBRARY
		//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Laptops");
		
		// TO HANDEL DAYNAMIC ID WE HAVE starts-with() FUNCTION OF XPATH LIBRARY
		//driver.findElement(By.xpath("//input[starts-with(@class,'gh-tb ui-')]")).sendKeys("Laptops");
		//driver.findElement(By.xpath("//input[ends-with(@class,'_test_t')]")).sendKeys("Laptops");
		
		// For links: custom xpath
		// Remember all links are represented by <a> html tag
		 driver.findElement(By.xpath("//a[contains(text(),'Motors')]")).click();
		//driver.findElement(By.linkText("Motors")).click();
	}

}
