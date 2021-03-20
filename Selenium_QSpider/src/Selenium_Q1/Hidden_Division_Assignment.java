//Bangalore to Goa 1jan 20201 in makemytrip 

package Selenium_Q1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Division_Assignment 
{

	public static void main(String[] args) 
	{
		//set the environment
				System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				//implicit wait
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//enter the URL
				driver.get("https://www.makemytrip.com/");
				
				driver.findElement(By.className("wewidgeticon we_close")).click();
				
				
				
				
	}

}
