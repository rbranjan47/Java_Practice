package Selenium_Q1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class delete_cookies 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		//deleting all cookies
		driver.manage().deleteAllCookies();
		
		driver.get("https://google.com/");
		
		//finding active elements
		driver.switchTo().activeElement().sendKeys("Selenium");
	}

}
