package Selenium_Q1;

import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WithOut_duplicates 
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
			alltext.add(text);
		}
		for (String wtext:alltext)
		{
			System.out.println(wtext);
		}
	}

}
