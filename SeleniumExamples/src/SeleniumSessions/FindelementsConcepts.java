package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindelementsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\ChromeDriver 93.0.4577.63\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.half.ebay.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		//daynamic wait
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		 List<WebElement> linklist =  driver.findElements(By.tagName("a"));
		 System.out.println(linklist.size());
		 
		 for(int i=0;i<linklist.size();i++)
		 {
			 System.out.println(linklist.get(i).getText());
		 }
		 
		 
		 
		 
	}

}
