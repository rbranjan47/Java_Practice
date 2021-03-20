//WAS to select specific element from drop-down

package Selenium_Q1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Specific_Options 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		
		WebElement policy_no=driver.findElement(By.id("policynumber"));
		Select s=new Select(policy_no);
		s.selectByIndex(0);
		
		//select tag is working with SELECT tag.
		//otherwise, UNEXPECTEDTAGNAE EXCPETION(unchecked exception) will get.
	}

}
