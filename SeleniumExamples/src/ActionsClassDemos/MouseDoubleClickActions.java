package ActionsClassDemos;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pac.config.*;
public class MouseDoubleClickActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * String ChromeDriver
		 * ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe";
		 * System.setProperty("webdriver.chrome.driver",ChromeDriver); WebDriver driver
		 * = new ChromeDriver();
		 */
		 
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("https://www.w3schools.com/jquery/tryit.asp?filename=tryjquery_event_dblclick");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		driver.switchTo().frame("iframeResult");
		
		WebElement ptext = driver.findElement(By.xpath("//body//p"));
		
		Actions mouseAct = new Actions(driver);
		mouseAct.doubleClick(ptext).perform();
		Alert alertwindow = driver.switchTo().alert();
		alertwindow.accept();
		
		
	}

}
