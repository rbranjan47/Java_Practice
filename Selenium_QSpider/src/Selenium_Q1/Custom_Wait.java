package Selenium_Q1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Custom_Wait 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
       WebDriver driver=new ChromeDriver();
		
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();

		int i=0;
		while(i<10)
		{
			try {
				driver.findElement(By.id("logoutLink")).click();
				System.out.println("hi");
			}
			catch(Exception e)
			{
				i++;
				System.out.println("bye");
			}
		}
		driver.close();
	}

}
