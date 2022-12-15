package ActionsClassDemos;

import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import pac.config.Config;

public class DoubleClickByMukesh {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		/*
		 * System.setProperty("webdriver.chrome.driver","" +
		 * "S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\New folder\\96.0.4664.45\\chromedriver.exe"
		 * );
		 * 
		 * ChromeOptions options = new ChromeOptions(); //chrome is being controled by
		 * automated software
		 * options.setExperimentalOption("excludeSwitches",Collections.singletonList(
		 * "enable-automation")); WebDriver driver = new ChromeDriver(options);
		 * //WebDriver driver = new ChromeDriver();
		 */		
		
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		// FOR RIGHT CLICK
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		
		// AFTER RIGHT CLICK NEED TO CLICK ON COPY
		driver.findElement(By.xpath("//span[text()='Copy']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("")).click();
		
				
	}
}
