package Selenium_Q1;

import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dupliactes_List 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///F:/Automation_%20%20QSpider/MultiSelect.html");
		
		WebElement select=driver.findElement(By.id("mtr"));
		Select s=new Select(select);
		List<WebElement> options=s.getOptions();
		HashSet<String> alltext=new HashSet<String>();
		
		for(WebElement option :options)
		{
			String text=option.getText();
			if(alltext.add(text)==false)
			{
				System.out.println(text);
			}
		}
	}

}
