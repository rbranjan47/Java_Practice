package Alpha_NewFeatures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window_handles {
	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		driver.findElement(By.xpath("//a[@href='http://www.google.com']")).click();
		//handling by selenium alpha
		driver.switchTo().newWindow(WindowType.WINDOW);
	}
}
