package SeleniumIMPConcept1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import io.github.bonigarcia.wdm.WebDriverManager;

public class geoLocations {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("test-type");
		options.addArguments("enable-strict-powerful-feature-restrictions");
		options.addArguments("disable-geolocation");

		ChromeDriver driver = new ChromeDriver(options);

		// CDP
		DevTools devTools = driver.getDevTools();
		devTools.createSession();

		// storing latiude, longitude, and accuracy in Map and sending
		Map<String, Object> coordinates = new HashMap<String, Object>();
		coordinates.put("latitude", 40);
		coordinates.put("longitude", 3);
		coordinates.put("accuracy", 1);

		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);

		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("netflix");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();

		List<WebElement> titleTexts = driver.findElements(By.cssSelector(".our-story-card-title"));
		for (int i = 0; i < titleTexts.size(); i++) {
			System.out.println(titleTexts.get(i).getText());
		}

	}
}
