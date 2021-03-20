package Selenium_Q1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Text2
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.selenium.dev/downloads/");
		String name=driver.findElement(By.xpath("//a[text()='testing']/../../td[2]")).getText();
		
		System.out.println(name);
		
		
		/*price of mi band
		//div[text()='Mi Smart Band 4']/../../div[2]/div[1]/div[1]/div[1] 
		
		//price of iph//one11 amazon
		//span[text()='Apple iPhone 11 (64GB) - White (Includes EarPods, Power Adapter)']/../../../../../../../div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]/span[2]

		//myntra---hrx by hritik roshan 349
		(//h3[1])[text()='HRX by Hrithik Roshan']/../../../../li[1]/a/div[2]/div/span[1]
			
		
		//myntra--price of SOCH kurta present under women section
		 (//h3[1])[text()='Soch Outlet']/../../../../li[1]/a/div[2]/div/span[1]
		 
		//xpath of cherokee jeans present kids section
		 * (//h3[1])[text()='Cherokee']/../../../../li[5]/a/div[2]/div/span[1]
		
		
		*/
		
		/*
		 * https://www.myntra.com/hrx-by-hrithik-roshan-tshirts-men?sort=price_asc
		 * https://www.myntra.com/women-kurtas-kurtis-suits?f=Brand%3ASoch%20Outlet
		 * https://www.myntra.com/boys-jeans-trousers
		 */
	
	}

}
