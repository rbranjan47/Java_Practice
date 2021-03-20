package Selenium_Q1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();

		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		
		System.out.println(title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		if (title==url)
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
	}
}