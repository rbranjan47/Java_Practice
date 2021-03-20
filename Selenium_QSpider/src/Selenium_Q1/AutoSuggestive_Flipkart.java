/*1.Automate the following scenario
1. Open chrome browser
2. Go to www.flipkart.com
3. Type ‘iphone ‘ in search text box
4. Find all the auto suggestions and print count of auto suggestion.
5. print the text of auto suggestion.(Note you have use for each loop)
6. click the Last auto suggestion*/

package Selenium_Q1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AutoSuggestive_Flipkart
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("iphone");
		
		java.util.List<WebElement> links=driver.findElements(By.xpath("//span[contains(text(),'iphone')]"));
		
		int count=links.size();
		for(int i=0;i<count;i++)
		{
			WebElement auto_links=links.get(i);
			String auto_links_sugg=auto_links.getText();
			System.out.println(auto_links_sugg);
		}

	}

}
