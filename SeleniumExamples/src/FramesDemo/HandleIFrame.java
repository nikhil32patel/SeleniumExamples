package FramesDemo;

import java.util.concurrent.TimeUnit;
import pac.config.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleIFrame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Using Traditional way
		/*String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",ChromeDriver);
		WebDriver driver = new ChromeDriver();*/
		
		// USING WebDriverManager
		/*
		 ChromeOptions chromoption = new ChromeOptions();
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver(chromoption);
		*/
		
		WebDriver driver = Config.startBrowser("chrome"); 
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(5);
		driver.findElement(By.xpath("//a[text()='org.openqa.selenium']/parent::li")).click();
		
		
		//driver.switchTo().defaultContent();
		
		//driver.switchTo().frame("packageFrame");
		//driver.findElement(By.xpath("//span[text()='Alert']/parent::a")).click();
		//driver.switchTo().defaultContent();
		
		
		//driver.switchTo().frame("packageListFrame");
		//driver.findElement(By.xpath("//a[text()='org.openqa.selenium']/parent::li")).click();
		//driver.switchTo().defaultContent();
		
		//driver.close();
		
	}

}
