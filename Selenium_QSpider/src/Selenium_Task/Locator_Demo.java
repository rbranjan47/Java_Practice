package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_Demo 
{
	static 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/hp/Desktop/HTML/selenium.html");
		WebElement e= driver.findElement(By.tagName("a"));
		e.click();
	}
}
