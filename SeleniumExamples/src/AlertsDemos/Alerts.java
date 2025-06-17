package AlertsDemos;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pac.config.Config;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
//		System.setProperty("webdriver.chrome.driver",ChromeDriver);
        WebDriver driver = new ChromeDriver();
		
		/*WebDriver driver = Config.startBrowser("chrome");*/
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		//Alert window with one OK button
		/*
		 * driver.findElement(By.xpath("//button[contains(text(),'Click for JS Alert')]"
		 * )).click(); Thread.sleep(2000); driver.switchTo().alert().accept();
		 */
		
		//Alert window with onw OK and Cancle button
		
		/*driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Alert alt = driver.switchTo().alert();
		Thread.sleep(2000);
		//alt.dismiss();
		alt.accept();
		
		//Alert window with input box
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]")).click();
		Thread.sleep(3000);
		*/
		
		driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]")).click();
		Alert alertwindow = driver.switchTo().alert();
		
		System.out.println("The message displayed on alert is "+alertwindow.getText());
		alertwindow.sendKeys("Welcome to Goa singham");
		Thread.sleep(3000);
		alertwindow.accept();
		driver.quit();
	
	}

}
