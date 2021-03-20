package Selenium_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Source_Billing 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("http://demo.opensourcebilling.org/en/users/sign_in");
		
		WebElement tick=driver.findElement(By.xpath("//label[text()='Keep me signed in']"));
		
		if (tick.isSelected())
			System.out.println("it is checked");
		else 
			System.out.println("it is not checked");
		
		
		Thread.sleep(3000);
		
		WebElement tick1=driver.findElement(By.xpath("//label[text()='Keep me signed in']"));
		tick1.click();
		Thread.sleep(5000);
		
		if (tick1.isSelected())
			System.out.println("it is checked");
		else 
			System.out.println("it is not checked");
		
		driver.close();
		

	}

}
