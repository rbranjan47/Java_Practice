package Selenium_Q1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hidden_Calender 
{

	public static void main(String[] args) 
	{
		//set the environment
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//enter the URL
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		//enter policy number
		driver.findElement(By.id("dob")).click();
		//select the required date ,month and year
		WebElement monthlistbox=driver.findElement(By.className("ui-datepicker-month"));
		Select s=new Select(monthlistbox);
		s.selectByVisibleText("Jun");
		driver.findElement(By.xpath("//a[text()='5']")).click();
		//specify the contact number
		driver.findElement(By.id("alternative_number")).sendKeys("1234567890");
		//click lets renew button
		driver.findElement(By.id("renew_policy_submit")).click();
		
		driver.close();
	}

}
