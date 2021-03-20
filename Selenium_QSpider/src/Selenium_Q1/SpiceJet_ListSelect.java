package Selenium_Q1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet_ListSelect 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.spicejet.com/");
		Thread.sleep(3000);
		

		WebElement Currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(Currency);
		
		s.selectByVisibleText("USD");

		Thread.sleep(3000);
		s.selectByIndex(2);
		
		Thread.sleep(3000);
		s.selectByVisibleText("GBP");
	}

}
