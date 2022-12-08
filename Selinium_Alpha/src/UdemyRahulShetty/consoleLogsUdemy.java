package UdemyRahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class consoleLogsUdemy {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://qa.myresman.com/");
		driver.get("https://qa.myresman.com/");
		driver.findElement(By.id("Username")).sendKeys("avadmin");
		driver.findElement(By.id("Password")).sendKeys("tester");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);

		LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
		// storing al logs in list
		List<org.openqa.selenium.logging.LogEntry> logs = entry.getAll();

		for (org.openqa.selenium.logging.LogEntry consoleLogs : logs) {
			System.out.println(consoleLogs.getMessage());
			System.out.println(consoleLogs.getTimestamp());
		}
		driver.quit();
	}
}
