package LinkDemo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLinks {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String ChromeDriver ="S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\Chromedriver_99.0.4844.51\\chromedriver.exe"; 
		System.setProperty("webdriver.chrome.driver",ChromeDriver);
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		int brokenlink = 0;
		
		for(WebElement element : links)
		{
			String url = element.getAttribute("href");
			if(url == null || url.isEmpty())
			{
				System.out.println("url is emapty");
			}
			
			URL Urllink = new URL(url);
			
			try
			{
				HttpURLConnection httpconn = (HttpURLConnection) Urllink.openConnection();
				httpconn.connect();
				
				if(httpconn.getResponseCode()>400)
				{
					System.out.println(httpconn.getResponseCode()+url+ " is "+" broken link ");
					brokenlink++;
				}
				else
				{
					System.out.println(httpconn.getResponseCode()+url+ " is "+" Normal link or Valid link ");
				}
			}
			catch(Exception e)
			{
				System.out.println(e.getLocalizedMessage());
				
			}
		}
		System.out.println("No of broken links"+brokenlink);
		driver.close();
	}

}
