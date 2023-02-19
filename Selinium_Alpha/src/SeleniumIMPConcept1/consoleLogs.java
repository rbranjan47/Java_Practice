package SeleniumIMPConcept1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.log.Log;
import io.github.bonigarcia.wdm.WebDriverManager;

public class consoleLogs {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		DevTools devtools = driver.getDevTools();
		devtools.createSession();

		devtools.send(Log.enable());

		devtools.addListener(Log.entryAdded(), entries -> {
			System.out.println(entries.getText());
			System.out.println(entries.getLevel());
		});

		driver.get("https://qa.myresman.com/");
		driver.findElement(By.id("Username")).sendKeys("sjadmin");
		driver.findElement(By.id("Password")).sendKeys("tester2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.quit();
	}
}
