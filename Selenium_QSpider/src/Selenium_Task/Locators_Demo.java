package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Demo 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///F:/Automation_%20%20QSpider/Google.html");
		
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("abc123")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.className("google123")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Google")).click();
		driver.navigate().back();
		
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
	}

}