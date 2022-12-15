package ActionsClassDemos;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pac.config.Config;

public class MouseDragAndDropActionImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
//		System.setProperty("webdriver.chrome.driver",ChromeDriver);
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement imageone = driver.findElement(By.xpath("//li[1]"));
		WebElement imagetwo = driver.findElement(By.xpath("//li[2]"));
		
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions actdrgndrop = new Actions(driver);
		actdrgndrop.dragAndDrop(imageone, trash).perform();
		actdrgndrop.dragAndDrop(imagetwo, trash).perform();
		
	}

}
