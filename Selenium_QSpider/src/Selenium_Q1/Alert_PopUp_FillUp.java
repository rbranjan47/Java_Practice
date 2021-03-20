package Selenium_Q1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_PopUp_FillUp 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		driver.findElement(By.xpath("//button[text()='Click for Prompt Box']")).click();
		
		Thread.sleep(3000);
		
		String text=driver.switchTo().alert().getText();
		
		driver.switchTo().alert().sendKeys("Rabi Ranjan Kumar");
		Thread.sleep(3000);

		driver.switchTo().alert().accept();
		
		System.out.println(text);
		
		driver.close();

	}

}
