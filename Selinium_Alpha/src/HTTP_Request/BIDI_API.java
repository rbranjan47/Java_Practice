package HTTP_Request;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.events.DomMutationEvent;
import org.openqa.selenium.logging.HasLogEvents;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BIDI_API {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//driver is casting into HasLogEvents class
		HasLogEvents logger = (HasLogEvents) driver;
		
		//atomic refrence 
		AtomicReference<DomMutationEvent> seen = new AtomicReference<>();
		
		CountDownLatch latch = new CountDownLatch(1);
		
		logger.onLogEvent((mutation -> {
		    seen.set((DomMutationEvent) mutation);
		    latch.countDown();
		}));
		
		driver.get("https://www.google.com");
		WebElement search = driver.findElement(By.cssSelector("input[type='text']"));
		Color search_colour = Color.fromString(search.getCssValue("color"));
		System.out.println(search_colour);
		
		Thread.sleep(3000);
		search.sendKeys("google.com");
		search.sendKeys(Keys.ENTER);
		
	}
}
