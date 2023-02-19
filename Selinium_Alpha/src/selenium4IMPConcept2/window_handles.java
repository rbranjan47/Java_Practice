package selenium4IMPConcept2;

import java.time.Duration;
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

		// handling by selenium alpha
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://google.com");
	}
}
