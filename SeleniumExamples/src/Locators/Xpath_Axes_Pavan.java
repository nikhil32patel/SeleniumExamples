package Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pac.config.Config;

public class Xpath_Axes_Pavan {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
//		System.setProperty("webdriver.chrome.driver",ChromeDriver);
//		WebDriver driver = new ChromeDriver();
		//driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		/*
		//tbody/tr[3]/td[1]/self::td
		//tbody/tr[3]/td[1] */
		
		// Normal xpath using Chropath
		//String text = driver.findElement(By.xpath("//tbody/tr[3]/td[1]")).getText();
		
		//Using Self axes (xpath)
//		String text = driver.findElement(By.xpath("//a[contains(text(),'Poona Dal & Oil')]/self::a")).getText();
//		System.out.println("Using Self: "+text);
//		
//		//Using Parent axes  (Select the parent of current node alwayes one)
//		text = driver.findElement(By.xpath("//a[contains(text(),'Poona Dal & Oil')]/parent::td")).getText();
//		System.out.println("Using Parent: "+text);
		
		/* Using child (Via ancestor 
		( WE CAN ALSO USE 
		
		List<WebElement> child	driver.findElements(By.xpath("//a[contains(text(),'Poona Dal & Oil')]/ancestor::tr/child::td
		System.out.println("Total Child Elements"+child.size());	
		*/  
		// Select all children of the current node (One or many)
//		text = driver.findElement(By.xpath("//a[contains(text(),'Poona Dal & Oil')]/ancestor::tr/child::td[1]")).getText();
//		System.out.println("Using Child: "+text);
//
//		// Ancestor - Select all ancestor (parent,grandparent,etc.)
//		text = driver.findElement(By.xpath("//a[contains(text(),'Poona Dal & Oil')]/ancestor::tr")).getText();
//		System.out.println("Using Ancestor: "+text);
//		
//		// Descendant- Select all descendant (children,grandchildren,etc) of the current node
//		List<WebElement> descendant = driver.findElements(By.xpath("//a[contains(text(),'Poona Dal & Oil')]/ancestor::tr/descendant::*"));
//		System.out.println("No of descendant nodes "+descendant.size());
		
		//Following - Select everything in the document after closing tag of current node
		/*
		 * List<WebElement> followingnodes = driver.findElements(By.
		 * xpath("//a[contains(text(),'B P Capital')]/ancestor::tr/following::tr"));
		 * System.out.println("No of Following nodes "+followingnodes.size());
		 * 
		 * // FOLLOWING-SIBLING Select the all the siblings after the current node
		 * List<WebElement> followingsiblingnodes = driver.findElements(By.
		 * xpath("//a[contains(text(),'B P Capital')]/ancestor::tr/following-sibling::tr"
		 * ));
		 * System.out.println("No of FOLLOWING-SIBLING "+followingsiblingnodes.size());
		 * 
		 * //PRECEDING List<WebElement> Precidingnodes = driver.findElements(By.
		 * xpath("//a[contains(text(),'B P Capital')]/ancestor::tr/preceding::tr"));
		 * System.out.println("No of PRECEDING nodes "+Precidingnodes.size());
		 * 
		 * //PRECEDING-SIBLING List<WebElement> Precidinsiblinggnodes =
		 * driver.findElements(By.
		 * xpath("//a[contains(text(),'B P Capital')]/ancestor::tr/preceding-sibling::tr"
		 * ));
		 * System.out.println("No of PRECEDING-SIBLING nodes "+Precidinsiblinggnodes.
		 * size());
		 */
		
		/* Xpath axes
		 *  Self
		 *  Parent
		 *  Child
		 *  Ancestor
		 *  Descendant
		 *  Following
		 *  Following-sibling
		 *  Preceding
		 *  Preceding-sibling
	   */
		
		
		//div[@class='_1lch']/child::button
		//button[@name='websubmit']
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='_1lch']/child::button/ancestor::div[@id='reg_form_box']/child::div[3]")).sendKeys("Nikhil B");
		
		// Using Xpath axces child
		driver.findElement(By.xpath("//div[@class='_1lch']/child::button")).click();
		
	}

}
