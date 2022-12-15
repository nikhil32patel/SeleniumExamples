package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pac.config.Config;

public class PageScreenShot {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\ChromeDriver 94.0.4606.41\\chromedriver.exe");
//		System.setProperty("webdriver.chrome.driver",""
//				+ "S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\New folder\\96.0.4664.45\\chromedriver.exe");
		//driver = new ChromeDriver();
		driver = Config.startBrowser("chrome");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		takeScreenShot("GoogleHome");
	}

	public static void takeScreenShot(String filename) throws IOException {

		// 1. take screenshot and store it as file format
		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		
		// 2. now copy the screenshot to desired location using copyfile method.
		FileUtils.copyFile(screenshot,new File("S:\\TESTING\\WEB\\Eclipse\\SeleniumExamples\\src\\SeleniumSessions"
				+filename+".JPG"));
		System.out.println("Refresh project and verify file name in project");
	}
}
