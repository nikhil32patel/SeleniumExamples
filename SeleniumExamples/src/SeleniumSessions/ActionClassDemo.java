package SeleniumSessions;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import pac.config.Config;


public class ActionClassDemo {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		/*
		 * String ChromeDriver
		 * ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe";
		 * System.setProperty("webdriver.chrome.driver",ChromeDriver);
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * //options.addArguments("disable-extensions");
		 * //options.setExperimentalOption("useAutomationExtension", false);
		 * 
		 * //chrome is being controled by automated software
		 * options.setExperimentalOption("excludeSwitches",Collections.singletonList(
		 * "enable-automation")); WebDriver driver = new ChromeDriver(options);
		 */
	
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("http://mrbool.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// TO MOUSE HOVER
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		act.contextClick();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
	}
}
