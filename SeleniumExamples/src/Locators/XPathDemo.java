package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",ChromeDriver);
		WebDriver driver = new ChromeDriver();
		
		
		/*
		 * WebDriverManager.chromedriver().setup(); ChromeDriver driver = new
		 * ChromeDriver();
		 */
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		
		// XPath with OR operator (Any of one condition shoud be match)
		//driver.findElement(By.xpath("//input[@id='search_query_top'] or //input[@name='search_query']")).sendKeys("Type to search");
		
		// XPath with AND operator (Both condition should be match)
		//driver.findElement(By.xpath("//input[@id='search_query_top'] and //input[@name='search_query']")).sendKeys("Type to search");
		
		// XPath with contains() function/method
		// Very useful in daynamic XPath
		
		//driver.findElement(By.xpath("//input[contains(@id,'search_')]"));
		//driver.findElement(By.xpath("//input[contains(@id,'query_top')]"));
		
		// Xpath with starts-with() function/method
		//driver.findElement(By.xpath("//input[starts-with(@id,'search_')]"));
		
		// Xpath with text() method
		//driver.findElement(By.xpath("//a[text()='Women']")).click();
		
		//Chained XPATH
		driver.findElement(By.xpath("//form[@id='searchbox']//input[4]")).sendKeys("Search any thing");
		
	}
}
