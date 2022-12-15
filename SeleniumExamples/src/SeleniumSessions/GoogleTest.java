package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pac.config.Config;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
//		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
//		System.setProperty("webdriver.chrome.driver",ChromeDriver);
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	
		driver.switchTo().frame("backgroundImage");
		Thread.sleep(10);
		driver.findElement(By.cssSelector("#input")).sendKeys("type something");
		
		//new WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='q']/parent::form"))).sendKeys("type to search");
		//driver.findElement(By.xpath("//input[@Name='btnI']")).click();
		
		/*List<WebElement> accountsHeaderList = driver.findElements(By.xpath("//input[@Name='btnI']"));

		for (WebElement e : accountsHeaderList) {
			String text = e.getText();
			System.out.println(text);
			//accountsList.add(text);
		}*/
	
	}

}
