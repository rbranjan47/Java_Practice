//package UdemyRahulShetty;
//
//import java.util.Optional;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.DevTools;
//import org.openqa.selenium.devtools.v96.network.Network;
//import org.openqa.selenium.devtools.v96.network.model.ConnectionType;
//
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class speedNetwork {
//	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver = new ChromeDriver();
//
//		DevTools devtools = driver.getDevTools();
//		devtools.createSession();
//
//		devtools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
//
//		devtools.send(
//				Network.emulateNetworkConditions(true, 3000, 1100000, 1100000, Optional.of(ConnectionType.CELLULAR3G)));
//
//		/*
//		 * WE ARE FAILING, BY NETWORK OFFLINE-----> TRUE
//		 * 
//		 * requestId RequestId Request identifier. timestamp MonotonicTime Timestamp.
//		 * type ResourceType Resource type. errorText string User friendly error
//		 * message. canceled boolean True if loading was canceled. blockedReason
//		 * BlockedReason The reason why loading was blocked, if any. corsErrorStatus
//		 * CorsErrorStatus The reason why loading was blocked by CORS, if any.
//		 */
//		devtools.addListener(Network.loadingFailed(), loadingFails -> {
//			System.out.println(loadingFails.getCorsErrorStatus());
//			System.out.println(loadingFails.getErrorText());
//			System.out.println(loadingFails.getBlockedReason());
//			System.out.println(loadingFails.getType());
//		});
//
//		/*
//		 * offline boolean True to emulate internet disconnection. latency number
//		 * Minimum latency from request sent to response headers received (ms).
//		 * downloadThroughput number Maximal aggregated download throughput (bytes/sec).
//		 * -1 disables download throttling. uploadThroughput number Maximal aggregated
//		 * upload throughput (bytes/sec). -1 disables upload throttling. connectionType
//		 * ConnectionType Connection type if known.
//		 */
//
//		try {
//			long requestTime = System.currentTimeMillis();
//			driver.get("https://rahulshettyacademy.com/angularAppdemo/");
//			driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//			System.out.println(driver.findElement(By.xpath("//body")).getText());
//			long responseTime = System.currentTimeMillis();
//			// time spent in different time
//			System.out.println((responseTime - requestTime) / 1000 + " seconds");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//		}
//
//		driver.close();
//	}
//}
