package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpopuphandel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\NIKHIL BHANVADIYA\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver",""
				+ "S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\New folder\\96.0.4664.45\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// HOW TO LUNCH CHROME BROWSWER
		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","S:\\SOFTWARES\\Selenium\\WebDrivers\\Chrome\\ChromeDriver 91.0.4472.19\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		 */
		
		// To handle alerts and windows pop up messaages using alert API
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000);
		
		 Alert alertObj = driver.switchTo().alert();
		 String alertmsg = alertObj.getText();
		 
		 
		 
		 if(alertmsg.equalsIgnoreCase("Please enter a valid user name")) {
			 System.out.println("correct alert message");
			 
		 }
		 else
		 {
			 System.out.println("In correct alert message");
		 }
		
		 alertObj.accept(); // when need to click on "ok" button.
		 //alertObj.dismiss(); // when cancel button is available.
	}

}
