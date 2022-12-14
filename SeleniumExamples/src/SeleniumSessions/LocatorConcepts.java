package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorConcepts {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// HOW TO LUNCH FIRE FOX
	    //FOR FIRE FOX LUNCH WE HAVE TO USE GECKO DRIVER
				
	  			
	  System.setProperty("webdriver.gecko.driver","C:\\Users\\NIKHIL BHANVADIYA\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  // FirefoxDriver is Class // WebDriver is Interface. 
	  driver.get("https://community.ebay.com/");
	  //driver.findElement(By.xpath("//a[contains(text(),'Seller News')]")).click();
	  
		/*
		 * try {
		 * //driver.findElement(By.cssSelector("#messageSearchField_1f7596aa04e8e2_0")).
		 * click();
		 * driver.findElement(By.id("messageSearchField_1f7596aa04e8e2_0")).sendKeys("H"
		 * ); } catch (Exception e) { System.out.print(e.getLocalizedMessage()); }
		 */
	  //driver.findElement(By.xpath("//input[@id='messageSearchField_1f7596aa04e8e2_0']")).sendKeys("Hello");
	 
	  //Total 8 Locators
	  /*1 xpath
	   *2 id
	   *3 name
	   *4 linktext
	   *5 partiallink
	   *6 cssSelector
	   *7 class
	   *8 tag name
	  */

	  // Example of hot to select drop down
	  Select dd = new Select(driver.findElement(By.id("community-activity-sorted-by")));
	  dd.selectByVisibleText("Most helpful");
	  //dd.selectByValue("");
	  //dd.selectByIndex(1);
	}

}
