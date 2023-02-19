package selenium4IMPConcept2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class headlessNewSelenium4 {
	public static void main(String[] args) {
		String chromePath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.setProperty("webdriver.chrome.driver", chromePath);

		// chrome options
		ChromeOptions chromeOptions = new ChromeOptions();
		//Previously, chromeOptions.setHeadless(true);
		chromeOptions.addArguments("--headless=new");
		
		//from selenium 4.8.0, we have 3 options:
		/*
		 * --headless
		 * --headless=new
		 * --headless=chrome
		 */

		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("https://myresman.com");

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();
	}
}
