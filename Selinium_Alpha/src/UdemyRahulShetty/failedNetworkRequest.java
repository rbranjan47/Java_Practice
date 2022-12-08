//package UdemyRahulShetty;
//
////FailRequest, method is used to fail the 
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v96.fetch.model.RequestPattern;
//import org.openqa.selenium.devtools.v96.network.model.ErrorReason;
//import org.openqa.selenium.devtools.v96.fetch.Fetch;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class failedNetworkRequest {
//	public static void main(String[] args) throws InterruptedException {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//
//		DevTools devtools = driver.getDevTools();
//		devtools.createSession();
//
//		// Enabling fetch, to listen network
//		/*
//		 * Creating Class of request pattern, as
//		 *
//		 * urlPattern--->
//		 *
//		 * resourceType---> Resource type as it was perceived by the rendering engine.
//		 * Allowed Values: Document, Stylesheet, Image, Media, Font, Script, TextTrack,
//		 * XHR, Fetch, EventSource, WebSocket, Manifest, SignedExchange, Ping,
//		 * CSPViolationReport, Preflight, Other.
//		 * 
//		 * requestStage---> Stages of the request to handle. Request will intercept
//		 * before the request is sent. Response will intercept after the response is
//		 * received (but before response body is received).
//		 * 
//		 * Now, Convert into List, As it is expecting requestpattern into list
//		 */
//
//		Optional<List<RequestPattern>> patterns = Optional
//				.of(Arrays.asList(new RequestPattern(Optional.of("*GetBook*"), Optional.empty(), Optional.empty())));
//		devtools.send(Fetch.enable(patterns, Optional.empty()));
//
//		/*
//		 * 1st Parameter---> Pattern, [for particular API request] 2nd Parameter--->
//		 * Handle Auth Parameter
//		 */
//		devtools.addListener(Fetch.requestPaused(), request -> {
//
//			// Failing the request
//			devtools.send(Fetch.failRequest(request.getRequestId(), ErrorReason.ACCESSDENIED));
//		});
//
//		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
//		Thread.sleep(4000);
//		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//		driver.navigate().refresh();
//		System.out.println(driver.findElement(By.xpath("//body")).getText());
//
//	}
//}
