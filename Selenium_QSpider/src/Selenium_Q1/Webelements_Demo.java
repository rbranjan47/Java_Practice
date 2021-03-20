//WAS to print number of check box and to select all the check box present in t
//the web page.
//URL should be taken from the user


//WAS to print the number of elements and to print all the elements present in
//the web table
package Selenium_Q1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements_Demo
{

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the url");
		String URL=sc.next();
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println(count);
		
		for (int i=0;i<count;i++)
		{
			WebElement link=links.get(i);
			String link_text=link.getText();
			System.out.println(link_text);
		}

		driver.close();
		sc.close();
	}

}

/*1.Automate the following scenario
1. Open chrome browser
2. Go to www.flipkart.com
3. Type ‘iphone ‘ in search text box
4. Find all the auto suggestions and print count of auto suggestion.
5. print the text of auto suggestion.(Note you have use for each loop)
6. click the Last auto suggestion*/
