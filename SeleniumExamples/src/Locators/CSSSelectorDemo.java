package Locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pac.config.Config;

public class CSSSelectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
//		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
//		System.setProperty("webdriver.chrome.driver",ChromeDriver);
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = Config.startBrowser("chrome");   
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		/*
		 * <input type="text" class="inputtext _55r1 _6luy" 
		 *   name="email" id="email" data-testid="royal_email" 
		 *    placeholder="Email address or phone number" 
		 *    autofocus="1" aria-label="Email address or phone number">
		 */
		
		// USING CLASS NAME
		//driver.findElement(By.className("inputtext")).sendKeys("nikhil");
		
		/* CCS SELECTOR USING ID ONLY
		 * ID IS ALVAYES REPRESNTED WITH # Symbol in 
		 *  CCS SELECTOR
		 */
		//driver.findElement(By.cssSelector("#email")).sendKeys("nikhil32patel@gmail.com");
		
		/*
		 *  CCS Selector Tag and id
		 *  TAG NAME IS ALWAYES OPTIONAL WHEN WE USE CSS SELECTOR
		 *  WE CAN USE TAG AND ID USING # (USING HAS)
		 *  TAG NAME IS OPTIONAL
		 */
		//driver.findElement(By.cssSelector("input#email")).sendKeys("nikhil32patel@gmail.com");
		
		/* CSS SELECTOR USING TAG
		 *  AFTER SPACE WE CAN SKIP .inputtext( _55r1 _6luy) THIS
		 *  ONE WE CAN SKIP WHILE USING CSS SELECTOR USING CLASS NAME
		 *  
		 */
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("nikhil");
		

		/* CSS SELECTOR USING TAG AND CLASS
		 *  AFTER SPACE WE CAN SKIP .inputtext( _55r1 _6luy) THIS
		 *  ONE WE CAN SKIP WHILE USING CSS SELECTOR USING CLASS NAME
		 *  WHEN WE USE CSS SELECTOR WITH TAG AND CLASS THEN WE USE . (USING dot)
		 *  TAG NAME IS OPTIONAL
		 */
		
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("nikhil");
		
		/* CSS SELECTOR USING ATTRIBUTE
		 *  WE CAN USE ANY OF THE ATTRIBUTE
		 */
		
		//driver.findElement(By.cssSelector("[name=email]")).sendKeys("nikhil");
		
		/* CSS SELECTOR USING TAG AND ATTRIBUTE
		 *  WE CAN USE TAG NAME WITH ATTRIBUTE
		 *  WE CAN USE ANY OF THE ATTRIBUTE
		 *  TAG NAME IS OPTIONAL
		 */
		//driver.findElement(By.cssSelector("input[name=email]")).sendKeys("nikhil");
		
		
		 /*
		  * CSS SELECTOR TAG CLASS AND ATTRIBUTE
		  * 
		  *   
		  */
		
		/* TAG & ID (OR) #ID
		 *  TAG & CLASS (OR) .CLASS
		 *  TAG & ATTRIBUTE (OR) [attribute=value]
		 *  TAG,CLASS AND ARRRIBUTE 
		 */ 
		driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]"));
	}

}
