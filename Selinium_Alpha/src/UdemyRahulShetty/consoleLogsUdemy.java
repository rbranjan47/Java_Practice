package UdemyRahulShetty;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class consoleLogsUdemy {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://qa.myresman.com/");
		driver.findElement(By.id("Username")).sendKeys("sjadmin");
		driver.findElement(By.id("Password")).sendKeys("tester2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		LogEntries entry = driver.manage().logs().get(LogType.BROWSER);
		//storing al logs in list
		List<org.openqa.selenium.logging.LogEntry>logs = entry.getAll();
		
		for(org.openqa.selenium.logging.LogEntry consoleLogs : logs) {
			System.out.println(consoleLogs.getMessage());
			System.out.println(consoleLogs.getTimestamp());
		}
		driver.quit();
	}
}
