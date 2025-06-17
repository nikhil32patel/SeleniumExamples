package SelectClassDemos;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pac.config.Config;

public class AutoSelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
//		System.setProperty("webdriver.chrome.driver",ChromeDriver);
//		WebDriver driver = new ChromeDriver();
		
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("http://3.110.88.201/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		List<WebElement> selectlist = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for( WebElement eachitem :selectlist )
		{
			if(eachitem.getText().equalsIgnoreCase("India"))
			{
				eachitem.click();
			}
		}
	}

}
