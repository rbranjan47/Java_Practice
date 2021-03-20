package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameters 
{
	
	WebDriver driver;
	
	@Test(priority = 1)
	@org.testng.annotations.Parameters({"emailID","password"})
	public void start(String emailID, String password) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd");
		
		Thread.sleep(3000);
		WebElement login=driver.findElement(By.id("login-username"));
		login.clear();
		login.sendKeys(emailID);
		
		driver.findElement(By.id("login-signin")).click();
		driver.findElement(By.id("login-passwd")).sendKeys(password);
		
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='ybarAccountMenu']")).click();
		
		driver.findElement(By.xpath("//span[text()='Sign out']")).click();
		
	}
	
	
	@Test(priority = 2)
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
}
