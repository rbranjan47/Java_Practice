package SeleniumIMPConcept1;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.fetch.Fetch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class networkMocking {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		DevTools devtools = driver.getDevTools();
		devtools.createSession();

		// Enabling fetch, to listen network
		devtools.send(Fetch.enable(Optional.empty(), Optional.empty()));

		devtools.addListener(Fetch.requestPaused(), request -> {
			if (request.getRequest().getUrl().contains("shetty")) {
				// mocked url into newUrl
				String newUrl = request.getRequest().getUrl().replace("=shetty", "=BadGuy");
				System.out.println(newUrl);

				devtools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(newUrl),
						Optional.of(request.getRequest().getMethod()), Optional.empty(), // request.getRequest().getPostData(),
																							// Don't have POST data here
						Optional.empty())); // Optional.of(request.getRequest().getHeaders(), Don't have HEADERS in the
											// event
			} else {
				devtools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()),
						Optional.of(request.getRequest().getMethod()), Optional.empty(), // request.getRequest().getPostData(),
																							// Don't have POST data here
						Optional.empty())); // Optional.of(request.getRequest().getHeaders(), Don't have HEADERS in the
											// event
			}
		});

		// https://rahulshettyacademy.com/Library/GetBook.php?AuthorName=shetty
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.cssSelector("p")).getText());

	}
}
