package ActionsClassDemos;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import pac.config.Config;

public class MouseDragAndDropActions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
//		System.setProperty("webdriver.chrome.driver",ChromeDriver);
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement source = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement destination = driver.findElement(By.xpath("//div[@id='box103']"));
		
		Actions dragnDropAct = new Actions(driver);
		dragnDropAct.dragAndDrop(source, destination).perform();
	}

}
