package Selenium_Q1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locaters_Demo1 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("file:///F:/Automation_%20%20QSpider/Locater_Demo1.html");
		
		//text at first text-box
		driver.findElement(By.xpath("//input[@type='text' and @value='A']")).sendKeys("Hello");
		
		//text at second text-box
		driver.findElement(By.xpath("//input[@type='text' and @value='B']")).sendKeys("World");
		
		//getting text of both box
		System.out.println(driver.findElement(By.xpath("//input[@type='text']")).getText());
		
		//getting text of first button
		System.out.println(driver.findElement(By.xpath("//input[@type='button' and @value='A']")).getText());
		
		//getting text of second button
		System.out.println(driver.findElement(By.xpath("//input[@type='button' and @value='B']")).getText());
		
		//getting text of both box
		System.out.println(driver.findElement(By.xpath("//input[@type='button']")).getText());
		
		//checking unchecked box
		driver.findElement(By.xpath("//input[@checked] ")).click();
		
		//Un-checking checked box
		driver.findElement(By.xpath("//input[@type='checkbox' and not(@checked)]")).click();
	}

}
