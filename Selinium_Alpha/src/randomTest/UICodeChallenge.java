package randomTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UICodeChallenge {

	@Test
	public void testUICountries() throws InterruptedException {
		// https://petdiseasealerts.org/forecast-map#/

		String chromePath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.setProperty("webdriver.chrome.driver", chromePath);

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://petdiseasealerts.org/forecast-map#/");

		WebElement mapFrame = driver.findElement(By.xpath("//div[@class='capc-map-embed']/iframe"));

		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(20));

		waits.until(ExpectedConditions.visibilityOf(mapFrame));
		waits.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(mapFrame));
		Thread.sleep(10000);
		try {
			driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='capc-map-embed']/iframe")));
		} catch (Exception e) {
			driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='capc-map-embed']/iframe")));
		}

		WebElement mapComponent = driver.findElement(By.xpath("//div[@id='map-component']"));
		if (mapComponent.isDisplayed()) {
			System.out.println("element present");
		} else {
			System.out.println("not present!");
		}
	}
}
