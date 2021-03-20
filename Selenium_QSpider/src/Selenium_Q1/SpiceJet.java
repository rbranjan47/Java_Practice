package Selenium_Q1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		WebElement dep=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		Select s=new Select(dep);
		s.selectByVisibleText(" Bagdogra (IXB)");
		
		WebElement arv=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		Select s1=new Select(arv);
		s1.selectByVisibleText(" Mangaluru (IXE)");
		
		
		WebElement date=driver.findElement(By.id("ctl00$mainContent$view_date1"));
		Select s3=new Select(date);
		s3.selectByVisibleText("18");
		
		
		WebElement datee=driver.findElement(By.id("ctl00_mainContent_view_date2"));
		Select s4=new Select(datee);
		s4.selectByVisibleText("25");

	}

}
