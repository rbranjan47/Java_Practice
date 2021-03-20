package Selenium_Q1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Download_Popup 
{

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		 driver.get("https://www.selenium.dev/downloads/"); 
		 driver.findElement(By.xpath("//td[text()='Java']/../td[6]/a[1]")).click(); 
		 
		 Thread.sleep(2000);
		 
		 Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_ALT);
		  r.keyPress(KeyEvent.VK_S);
		  r.keyRelease(KeyEvent.VK_ALT);
		  Thread.sleep(2000);
		  r.keyPress(KeyEvent.VK_ENTER);
		  r.keyRelease(KeyEvent.VK_ENTER);
		  
		        driver.close();
	}

}
