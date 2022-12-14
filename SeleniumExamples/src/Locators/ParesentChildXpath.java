package Locators;

import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ParesentChildXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
		
		ChromeOptions chromeoption = new ChromeOptions();
		chromeoption.addArguments("--disable-notifications");
		chromeoption.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation")); 
		
		System.setProperty("webdriver.chrome.driver",ChromeDriver);
		WebDriver driver = new ChromeDriver(chromeoption);
		//driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim']/descendant::input[1]")).click();
		
		// Using xpath axeses
		//driver.findElement(By.xpath("//div[contains(text(),'Ajmer')]/ancestor::div[@class='css-1dbjc4n r-b5h31w r-95jzfe']")).click();
		
		// Using Parent child xpath
		// Parent ://div[@class='css-1dbjc4n r-b5h31w r-95jzfe']
		// Child ://div[contains(text(),'Agra')]
		
		//driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[text()='Agra']"));
		//driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		
		
	}

}
