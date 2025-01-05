package randomTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class monkeyTesting {
	@Test
	public void monkeyTestingRandomClick() throws InterruptedException {
		ChromeOptions chrmOpt = new ChromeOptions();
		chrmOpt.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chrmOpt);

		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Javascript Executor
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<WebElement> footerLinks = driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));
		// scolling down

		int footerLinksSize = footerLinks.size();
		System.out.println(footerLinksSize);

		// Performing monkey testing
		for (int i = 0; i < footerLinksSize; i++) {
			// Generating random numbers
			int randomNumber = (int) Math.floor(Math.random() * footerLinksSize);

			js.executeScript("arguments[0].scrollIntoView(true);", footerLinks.get(randomNumber));
			Thread.sleep(2000);
			// footer link texts
			String footerLinkText = footerLinks.get(randomNumber).getText();
			try {
				Assert.assertEquals(true, footerLinks.get(randomNumber).isEnabled());
				footerLinks.get(randomNumber).click();
				System.out.println(footerLinkText + " is clickable!");
			} catch (Exception e) {
				System.out.println(footerLinkText + " is not clickable!");
			}

			driver.navigate().back();

			Thread.sleep(2000);
			// Store the same webelement again to not to get StaleElement
			footerLinks = driver.findElements(By.cssSelector("div.navFooterVerticalRow li a"));

		}
		driver.close();
	}
}
