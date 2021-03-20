package Selenium_Q1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rbran\\eclipse-workspace\\Selenium_QSpider\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.get("https://www.google.com");
		System.out.println(driver.getPageSource());
		driver.navigate().to("https://www.gmail.com");
		driver.close();

	}

}
