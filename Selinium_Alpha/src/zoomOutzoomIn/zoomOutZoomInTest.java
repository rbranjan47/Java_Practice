package zoomOutzoomIn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.manager.SeleniumManager;
import org.testng.annotations.Test;

public class zoomOutZoomInTest {
	@Test
	public void zoomoutzoominBrowser() throws InterruptedException {
		String chromePath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.setProperty("webdriver.chrome.driver", chromePath);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.get("https://www.youtube.com/");
		
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Narendra Modi");
		 driver.findElement(By.xpath("//input[@id='search']")).sendKeys(Keys.ENTER);
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 String zoomOutChrome = "document.body.style.zoom='50%'";
		 js.executeScript(zoomOutChrome);
		 Thread.sleep(5000);
		String zoomInChrome = "document.body.style.zoom='200%'";
		 js.executeScript(zoomInChrome);
		 Thread.sleep(5000);
		 driver.quit();
	}
}
