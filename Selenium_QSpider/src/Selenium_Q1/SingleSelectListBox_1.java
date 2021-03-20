package Selenium_Q1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectListBox_1
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		Thread.sleep(3000);
		
		driver.findElement(By.id("dob")).click();
		Thread.sleep(3000);
		
		WebElement Month_List=driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(Month_List);
		
		s.selectByVisibleText("1994");
		s.selectByIndex(5);
		s.selectByValue("Feb");
	}

}
