package Selenium_Q1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links_WebPage 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://google.com");
		List<WebElement> l=driver.findElements(By.tagName("a"));
		int count=l.size();
		System.out.println(count);
	}

}
