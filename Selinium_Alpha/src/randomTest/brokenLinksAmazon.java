package randomTest;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brokenLinksAmazon {

	@Test
	public void testBrokenLink() throws IOException, InterruptedException {

		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);

		driver.manage().window().maximize();

		driver.get("https://bstackdemo.com/");

		List<WebElement> webElements = driver.findElements(By.tagName("a"));

	     // verifying link
		for (WebElement elem : webElements) {
			String getURL = elem.getAttribute("href");
			verifyLink(getURL);
		}

		Thread.sleep(5000);

		driver.quit();
	}

	public static void verifyLink(String url) throws IOException {
		URL urlDirect = new URL(url);
		HttpURLConnection httpURL = (HttpURLConnection) urlDirect.openConnection();

		// connecting a setup
		httpURL.connect();

		if (httpURL.getResponseCode() == 200) {
			System.out.println("Link is Active: " + httpURL);
		} else {
			System.out.println("Link is Broken: " + httpURL);
		}
	}
}
