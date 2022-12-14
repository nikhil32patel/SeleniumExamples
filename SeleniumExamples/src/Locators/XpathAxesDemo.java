package Locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",ChromeDriver);

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.practo.com/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-locality']")).click();
		driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-locality']")).clear();
		driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-locality']")).sendKeys("Bangalore");
		
		List<WebElement> allitemslocation = driver.findElements(By.xpath("//div[@class='c-omni-suggestion-item__content__title']"));

		for(WebElement eachitem:allitemslocation)
		{
			if(eachitem.getText().equalsIgnoreCase("Bangalore"))
			{
				//eachitem.sendKeys("Bangalore");
				eachitem.click();
			}
			
			System.out.println(eachitem.getText());
			
		}
		
		driver.findElement(By.xpath("//input[@data-qa-id='omni-searchbox-keyword']")).click();

		//driver.findElement(By.xpath("//h2[contains(text(),'Dr. Shantala M.N')]/ancestor::div[@class='listing-doctor-card']/descendant::button[text()='Book Appointment']")).click();

		List<WebElement> allitems = driver.findElements(By.xpath("//div[@class='c-omni-suggestion-item__content__title']"));

		for(WebElement eachitem:allitems)
		{
			if(eachitem.getText().equalsIgnoreCase("Ear Nose Throat Specialist"))
			{
				eachitem.sendKeys("Ear Nose Throat Specialist");
				eachitem.click();
			}
			System.out.println(eachitem.getText());
		}

	}

}
