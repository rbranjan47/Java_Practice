package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameters_Demo 
{
	
	WebDriver driver;
	@Parameters({"browser"})
	@Test(priority = 1)
	public void test_Url(String browser)
	{
		System.out.println("running the testng file "+browser);
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		String text=driver.getTitle();
		System.out.println(text);

	}
	@Test(priority = 3)
	public void search_press() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.id("gsr")).click();	
	}
	
	@Test(priority = 2)
	public void text_feild()
	{
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Thinksys");
	}
}
