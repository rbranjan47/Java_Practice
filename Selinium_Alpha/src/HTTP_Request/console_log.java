package HTTP_Request;

import java.time.Duration;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.devtools.v85.network.Network;

import io.github.bonigarcia.wdm.WebDriverManager;

public class console_log {
static DevTools devtools;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//setting devtools with chrome browser
		devtools = ((ChromeDriver)driver).getDevTools();
		
		//creating sessions
		devtools.createSession();
		
		//enabling network
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		//enabling log
		devtools.send(Log.enable());
		
		//logging log
		devtools.addListener(Log.entryAdded(), entry->{
			System.out.println("Log text: "+ entry.getText());
			System.out.println("Log level: "+ entry.getLevel());
		});
		
		driver.get("https:amazon.in");
	}
}
