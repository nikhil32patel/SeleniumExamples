package SeleniumSessions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadInSelenium {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub

		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",ChromeDriver);

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(70,TimeUnit.SECONDS);
		
		
		/*
		 * <input data-v-62af465c="" id="file-upload" name="file" type="file" xpath="1">
		 */
		
		// USING SEND KEYS (WHEN INPUT TYPE IF FILE)
		//driver.findElement(By.xpath("//span[contains(text(),'We will create your profile')]")).click();
		//driver.findElement(By.xpath("//input[@id='file-upload'][1]")).sendKeys("C:\\Users\\NIKHIL BHANVADIYA\\Desktop\\Resume_Sameer.docx");
		
		// USING JAVA SCRIPT EXECUTOR
		driver.findElement(By.xpath("//span[contains(text(),'We will create your profile')]")).click();
		WebElement button = driver.findElement(By.xpath("//input[@id='file-upload'][1]"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",button);
		
		Robot rb = new Robot();
		rb.delay(2000);
		
		// PUT PATH TO FILE CLIPBORD
		StringSelection ss = new StringSelection("C:\\Users\\NIKHIL BHANVADIYA\\Desktop\\Resume_Sameer_Safiya.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		// CTRL+V KEAYS PRESS EVENTS USING ROBOT CLASS OBJECTS
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		// CTRL+V KEAYS Release EVENTS USING ROBOT CLASS OBJECTS
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
		
	}

}
