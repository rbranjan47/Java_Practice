//was to check whether email check box is empty or not

package Selenium_Q1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Isempty_check {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		/* boolean w=driver.findElement(By.id("email")).getText().isEmpty();
		
		
		if (w==true)
			System.out.println("it is empty");
		else
			System.out.println("it is not empty");
			*/

		String text=driver.findElement(By.id("email")).getAttribute("value");
		
		if(text.isEmpty())
			System.out.println("empty");
		else 
			System.out.println("non empty");
	}

}
