package selenium4Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.testng.annotations.Test;

public class selectClass {

	@Test
	public void selectClassTesting() {
		// chrome
		String chromePath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		// chorme driver
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver chromeDriver = new ChromeDriver();
		
		chromeDriver.get(chromePath);
	}
}
