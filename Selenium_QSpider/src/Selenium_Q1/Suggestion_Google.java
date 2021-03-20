//reading suggestive box of google 
//example. JAVA

package Selenium_Q1;

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion_Google 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Scanner sc=new Scanner(System.in);
		String URL=sc.next();
		System.out.println("enter the url ");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(URL);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Java");
		
		Thread.sleep(4000);
		List<WebElement> auto_suggestive=driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		int count=auto_suggestive.size();
		System.out.println(count);
		
		for (int i=0;i<count;i++)
		{
			WebElement auto_sugg_link=auto_suggestive.get(i);
			System.out.println(auto_sugg_link.getText());
		}
		
		auto_suggestive.get(0).click();
		Thread.sleep(8000);
		driver.close();
		
		
		sc.close();
	}

}
