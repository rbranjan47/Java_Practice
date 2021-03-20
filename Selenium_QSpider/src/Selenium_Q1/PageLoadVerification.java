package Selenium_Q1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadVerification
{

	public static void main(String[] args) throws InterruptedException
	{
       WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		{
			try 
			{
				driver.get("https://demo.actitime.com/login.do");
				System.out.println("page is getting load in 10 seconds");
			}
			catch(Exception e)
			{
				System.out.println("page is not getting load in 10 seconds");
			}
	}
		driver.close();
}
}
