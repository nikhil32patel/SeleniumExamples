package ActionsClassDemos;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import pac.config.Config;

public class RightAndDoubleClickByMukesh {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver",""
//				+ "S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\New folder\\96.0.4664.45\\chromedriver.exe");
//		ChromeOptions options = new ChromeOptions();
//		//chrome is being controled by automated software
//		options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
//		WebDriver driver = new ChromeDriver(options);
		
		
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// FOR RIGHT CLICK
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		
		
		
		// AFTER RIGHT CLICK NEED TO CLICK ON COPY
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		//driver.switchTo().frame(0);
		//driver.switchTo().frame(nameOrId)
		
		
	}
}
