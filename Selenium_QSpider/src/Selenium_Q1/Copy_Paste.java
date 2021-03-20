package Selenium_Q1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_Paste
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.opensourcebilling.org/");
		//selecting and copying text
		driver.findElement(By.id("email")).sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(3000);
		//pasting that copying text
		driver.findElement(By.id("password")).sendKeys(Keys.CONTROL+"v");

		
	}

}
