package SeleniumIMPConcept1;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.emulation.Emulation;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cooridinateCDP {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		// CDP
		DevTools devTools = driver.getDevTools();
		devTools.createSession();

		devTools.send(Emulation.setDeviceMetricsOverride(400, 650, 100, true, Optional.empty(), Optional.empty(),
				Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
				Optional.empty()));

		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chrome devtools");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
	}
}
