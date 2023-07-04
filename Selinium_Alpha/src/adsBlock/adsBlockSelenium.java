package adsBlock;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.testng.annotations.Test;

public class adsBlockSelenium {

	@Test
	public void adsBlocksUsingExtensions() {
		// Issue with chrome launch websocket
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addExtensions(new File("./extensions/AdBlock_extension_5_8_0_0.crx"));
		String chromePath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.setProperty("webdriver.chrome.driver", chromePath);

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/java-tutorial");

	}
}
