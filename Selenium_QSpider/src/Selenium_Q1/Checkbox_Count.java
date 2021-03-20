package Selenium_Q1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Count 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("//www.echoecho.com/htmlforms09.htm");
		Thread.sleep(3000);
	List<WebElement> checkbox=	driver.findElements(By.xpath("//input[@type='checkbox']"));
	
	int count =checkbox.size();
	System.out.println(count);
	}

}
