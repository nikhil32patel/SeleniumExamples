package SelectClassDemos;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",ChromeDriver);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		WebElement country = (WebElement) driver.findElement(By.cssSelector("select#input-country.form-control"));
		//Select countryselect = new Select(driver.findElement(By.xpath("//select[@id='input-country']")));
		Select countryselect = new Select(country);
		
		 // countryselect.selectByIndex(0);
		 // countryselect.selectByValue("");
		 // countryselect.selectByVisibleText("");
		 
		
		List<WebElement> countrylist = countryselect.getOptions();
		for (WebElement e : countrylist) {
			String text = e.getText();
			System.out.println(text);
			//accountsList.add(text);
		}
	}
}
