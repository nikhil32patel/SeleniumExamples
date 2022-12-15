package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import pac.config.Config;

public class WebDriverBasic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// HOW TO LUNCH FIRE FOX
		//  FOR FIRE FOX LUNCH WE HAVE TO USE GECKO DRIVER
		
		/*
		 * System.setProperty(
		 * "webdriver.gecko.driver","C:\\Users\\NIKHIL BHANVADIYA\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe"
		 * ); WebDriver driver = new FirefoxDriver(); // FirefoxDriver is Class //
		 * WebDriver is Interface. driver.get("https://www.google.co.in");
		 */
		
		// HOW TO LUNCH CHROME BROWSWER
//		System.setProperty("webdriver.chrome.driver","S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\ChromeDriver 91.0.4472.19\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("https://www.google.co.in");
		
		String sitetitial = driver.getTitle();
		System.out.println(sitetitial);
		
		if(sitetitial.equalsIgnoreCase("Google"))
		{
			System.out.println("Correct Title");
			
		}
		else
		{
			System.out.println("In Correct Title");
		}
		
		WebElement login = driver.findElement(By.xpath("//a[@href='/login']"));
		login.click();
		//System.out.println(driver.getPageSource());
		
		//driver.quit();
		
		/*
		 * How to launch Safari Browser with Selenium:
		 * 
		 * Steps: 1 – Set Up WebDriver Extension for Safari browser 
		 * 2 -- Install the Safari Browser Extension 
		 * 3 -- Restart your Safari Browser 
		 * 4 -- Enable "Allow Remote Automation" option from Develop tab 
		 * 5 -- Run your script
		 */
		
		/*
		 WebDriver driver = new SafariDriver();
		 driver.get("https://www.google.co.in"); 
		 */
	}
}
