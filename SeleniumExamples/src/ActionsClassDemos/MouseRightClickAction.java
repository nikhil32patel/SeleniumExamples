package ActionsClassDemos;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",ChromeDriver);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement button = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		Actions act = new Actions(driver);
		//act.contextClick(button).build().perform();
		act.contextClick(button).perform();
	}

}
