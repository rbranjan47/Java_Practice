//here, i have to disable the notification, by using the 


package Selenium_Q1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_Popup
{

	public static void main(String[] args) 
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	//Chrome options arguments
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.cleartrip.com/");
	
	

	}

}
