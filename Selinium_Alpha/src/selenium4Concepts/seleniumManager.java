package selenium4Concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.manager.SeleniumManager;

public class seleniumManager {

	public static void main(String[] args) {
		// chrome
		String chromePath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		// firefox
		String firefoxPath = SeleniumManager.getInstance().getDriverPath("geckodriver");
		// edge
		String edgePath = SeleniumManager.getInstance().getDriverPath("msedgedriver");

		// chorme driver
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver chromeDriver = new ChromeDriver();

		chromeDriver.get("https://google.com");
		chromeDriver.close();

		// firefox driver
		System.setProperty("webdriver.gecko.driver", firefoxPath);
		WebDriver firefoxDriver = new FirefoxDriver();

		firefoxDriver.get("https://google.com");
		firefoxDriver.close();

		// edge driver
		System.setProperty("webdriver.msedge.driver", edgePath);
		WebDriver edgeDriver = new EdgeDriver();

		edgeDriver.get("https://google.com");
		edgeDriver.close();

	}
}
