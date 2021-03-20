//WAS to print all the options, in alphabetical order

package Selenium_Q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ascending_List {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///F:/Automation_%20%20QSpider/MultiSelect.html");
		
		WebElement select=driver.findElement(By.id("mtr"));
		Select s=new Select(select);
		
		
		
		//all items using enhanced for loop
		List<WebElement> options=s.getAllSelectedOptions();
		ArrayList<String> ar_list=new ArrayList<String>();
		int count=options.size();
		System.out.println(count);
		for(WebElement option :options)
		{
			String text=option.getText();
			System.out.println(text);
			ar_list.add(text);
		}
		
		Collections.sort(ar_list);
		
		for(String Sorted_Text:ar_list)
		{
			System.out.println(Sorted_Text);
		}
		
	}

}
