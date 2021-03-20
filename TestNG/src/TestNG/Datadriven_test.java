package TestNG;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Datadriven_test 
{
	WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?registerenterinfo&usage=2943&ru=");
	}
	
	
	
	@Test()
	public void test_actions(String firstname, String lastname, String address1, String address2, String city, String state, String zipcode, String emailaddress)
	{
		//first_name
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys(firstname);
		
		//last_name
		driver.findElement(By.id("lastname")).clear();
		driver.findElement(By.id("lastname")).sendKeys(lastname);
		
		//address1
		driver.findElement(By.id("address1")).clear();
		driver.findElement(By.id("address1")).sendKeys(address1);
		
		//address2
		driver.findElement(By.id("address2")).clear();
		driver.findElement(By.id("address2")).sendKeys(address2);
		
		//city
		driver.findElement(By.id("city")).clear();
		driver.findElement(By.id("city")).sendKeys(city);
		
		//state
		driver.findElement(By.id("state")).clear();
		driver.findElement(By.id("state")).sendKeys(state);
		
		//zipCode
		driver.findElement(By.id("zipcode")).clear();
		driver.findElement(By.id("zipcode")).sendKeys(zipcode);
		
		//emailaddress
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(emailaddress);
	}
	
	@AfterMethod
	public void close()
	{
		System.out.println("test cases is over");
		driver.quit();
	}
	
}
