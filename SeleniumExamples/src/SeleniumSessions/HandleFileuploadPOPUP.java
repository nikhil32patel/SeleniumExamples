package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleFileuploadPOPUP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\NIKHIL BHANVADIYA\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		 WebDriver driver = new FirefoxDriver();
		
		// HOW TO LUNCH CHROME BROWSWER
		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\ChromeDriver 91.0.4472.19\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 */
		
		// To handle alerts and windows pop up messaages using alert API
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\NIKHIL BHANVADIYA\\Desktop\\Test.html");
		
	}

}
