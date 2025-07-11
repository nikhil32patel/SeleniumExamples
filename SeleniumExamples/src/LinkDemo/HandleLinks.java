package LinkDemo;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pac.config.Config;

public class HandleLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * String ChromeDriver
		 * ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe";
		 * System.setProperty("webdriver.chrome.driver",ChromeDriver); WebDriver driver
		 * = new ChromeDriver();
		 */
		
		WebDriver driver = Config.startBrowser("chrome");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Using linkText
		//driver.findElement(By.linkText("Baby")).click();
		
		// Using Prtial link text
		//driver.findElement(By.partialLinkText("Baby"));
		
	 	List<WebElement> alllinkofpage = driver.findElements(By.tagName("a"));
	 	System.out.println("Total links of Page are " + alllinkofpage.size());
		
	 	/*
		 * for(int i =1;i<=alllinkofpage.size()-1;i++) {
		 * //System.out.println(alllinkofpage.get(i).getText());
		 * System.out.println(alllinkofpage.get(i).getAttribute("href")); }
		 */
	 	
	 	for(WebElement link:alllinkofpage)
	 	{
	 		System.out.println(link.getText());
	 		System.out.println(link.getAttribute("href"));
	 		
	 	}
	 	
	}

}
