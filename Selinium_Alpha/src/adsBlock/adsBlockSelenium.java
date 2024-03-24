package adsBlock;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class adsBlockSelenium {

	@Test
	public void adsBlocksUsingExtensions() throws InterruptedException {
		// Issue with chrome launch websocket
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		co.addExtensions(new File("./extensions/AdBlock_extension_5_8_0_0.crx"));
		String chromePath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.setProperty("webdriver.chrome.driver", chromePath);

		WebDriver driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.javatpoint.com/java-tutorial");
		
		
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(20000));
		Alert alerts = waits.until(ExpectedConditions.alertIsPresent());
		
		Thread.sleep(20000);
		driver.quit();

	}
}
