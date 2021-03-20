package Selenium_Q1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allignment {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		int x1=driver.findElement(By.id("email")).getLocation().getX();
		
		int x2=driver.findElement(By.id("pass")).getLocation().getX();
		
		if (x1==x2)
			System.out.println("both email and password properly aligned"+x1+x2);
		else
			System.out.println("not properly aligned"+x1+x2);
	}

}
