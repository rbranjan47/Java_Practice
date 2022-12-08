package HTTP_Request;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HTTP_Request {

	static DevTools devtools;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		// setting devtools with chrome browser
		devtools = ((ChromeDriver) driver).getDevTools();

		// creating sessions
		devtools.createSession();

		// enabling network
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		devtools.addListener(Network.requestWillBeSent(), entry -> {
			System.out.println("Request LOG: " + entry.getRequest().getUrl());
			System.out.println("Request type: " + entry.getRequest().getMethod());
		});

		driver.get("https://google.com/");
	}
}
