package Selenium_Q1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllList_MTR {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///F:/Automation_%20%20QSpider/MultiSelect.html");
		
		WebElement select=driver.findElement(By.id("mtr"));
		Select s=new Select(select);
		s.selectByVisibleText("Idly");
		s.selectByIndex(3);
		
		s.selectByValue("Dosa");
		s.selectByVisibleText("Poori");
		s.selectByVisibleText("ChowChowbath");
		s.selectByIndex(10);
		
		//all items using enhanced for loop
		List<WebElement> options=s.getAllSelectedOptions();
		for(WebElement option :options)
		{
			String text=option.getText();
			System.out.println(text);
		}
		//first items
		WebElement option=s.getFirstSelectedOption();
		System.out.println(option.getText());
		
		
	}

}

//WAS to print all the options, without duplicates 
//WAS to print all the options, with duplicates only
//WAS to print all the options, in alphabetical order
