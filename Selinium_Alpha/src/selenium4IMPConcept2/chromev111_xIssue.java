package selenium4IMPConcept2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class chromev111_xIssue {
	public static void main(String[] args) throws InterruptedException {
		// Issue with chrome Version: 111.0.5563.65 (Official Build) (64-bit)
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		String chromePath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.setProperty("webDriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.quit();
	}
}
