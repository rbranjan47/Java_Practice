package UdemyRahulShetty;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;

import com.google.common.collect.ImmutableList;

import io.github.bonigarcia.wdm.WebDriverManager;

public class blockAPI {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		DevTools devtools = driver.getDevTools();
		devtools.createSession();
		
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		devtools.send(Network.setBlockedURLs(ImmutableList.of("*.gif*", "*jpg*", "*.png*", "*.jpeg*")));
		
		driver.get("https://qa.myresman.com/");
		driver.findElement(By.id("Username")).sendKeys("sjadmin");
		driver.findElement(By.id("Password")).sendKeys("tester2");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
