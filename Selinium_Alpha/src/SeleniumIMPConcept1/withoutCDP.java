package SeleniumIMPConcept1;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class withoutCDP {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// CDP
		DevTools devTools = driver.getDevTools();
		devTools.createSession();

		// As setDeviceMetricesOverrirde doing the same methods,
		// It collects all the parameters in the hashmap and Pass the executeCDPcommand
		Map value = new HashMap();
		value.put("width", 400);
		value.put("height", 600);
		value.put("deviceScaleFactor", 100);
		value.put("mobile", true);

		driver.executeCdpCommand("Emulation.setDeviceMetricsOverride", value);

		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chrome devtools");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
	}
}
