package UdemyRahulShetty;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Request;
import org.openqa.selenium.devtools.v85.network.model.Response;

import io.github.bonigarcia.wdm.WebDriverManager;

public class networkResponseAPI {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Chrome devtools
		DevTools devtools = driver.getDevTools();
		//creating sesssion
		devtools.createSession();
		
		//Enabling network
		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		//disable network
		//devtools.send(Network.disable());
		
		//getting sent request
		devtools.addListener(Network.requestWillBeSent(), request->{
			Request req = request.getRequest();
			System.out.println(req.getUrl());
		});
		
		
		//firing event
		devtools.addListener(Network.responseReceived(), response->{
			Response res = response.getResponse();
			System.out.println("Status: "+ res.getStatus());
			if(res.getStatus().toString().startsWith("4")) {
				System.out.println(res.getUrl() + "failed with status code "+ res.getStatus());
			}
			System.out.println("url: " + res.getUrl());
			System.out.println("Status Text: "+ res.getStatusText());
		});
		
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("chrome devtools");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
		
	}
}
