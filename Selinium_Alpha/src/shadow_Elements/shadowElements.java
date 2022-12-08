package shadow_Elements;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class shadowElements {
	@Test
	public void shadowTestElements() throws InterruptedException {
		try {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://books-pwakit.appspot.com/");

			// Shadow Elements -----> Java-Script Executor
			JavascriptExecutor js = (JavascriptExecutor) driver;
			WebElement input = (WebElement) (js.executeScript("return document.querySelector(\"body > book-app\")"
					+ ".shadowRoot" + ".querySelector(\"input\")"));

			input.sendKeys("Ravinder Singh");
			input.sendKeys(Keys.ENTER);

			Thread.sleep(5000);

			driver = (ChromeDriver) driver;
			driver.close();
			driver.quit();
		} catch (Exception e) {
			throw e;
		}
	}
}
