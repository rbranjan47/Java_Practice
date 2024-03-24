package randomTest;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollToViewTest {
	@Test
	public void testScrollView() throws InterruptedException {
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.addArguments("--remote-allow-origins=*");

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);

		driver.manage().window().maximize();
		try {
			driver.get("https://peter.sh/experiments/chromium-command-line-switches/");

			String ParentWindow = driver.getWindowHandle();

//			Set<String> windowHandles = driver.getWindowHandles();
//
//			Iterator<String> itrs = windowHandles.iterator();
//
//			while (itrs.hasNext()) {
//				String child_Window = itrs.next();
//
//				// switching to child window on clicking some link
//				if (!child_Window.equals(ParentWindow)) {
//					driver.switchTo().window(child_Window);
//
//					driver.close();
//				}
//			}
			// 4 types of scroll
			// 1. Scroll to Element
			WebElement elementIDE = driver.findElement(By.xpath("//tr[@id='cdm-data-directory']"));

			Actions actions = new Actions(driver);
			// actions.moveToElement(elementIDE).perform();
			actions.scrollToElement(elementIDE).perform();

			// 2. scroll to Given Amount
			driver.switchTo().newWindow(WindowType.WINDOW);
			driver.get("https://docs.oracle.com/javase/7/docs/api/");
			driver.switchTo().frame(driver.findElement(By.name("packageListFrame")));

			WebElement javaXMLELe = driver.findElement(By.xpath("//a[contains(text(),'javax.xml.ws.spi')]"));

			int javaXMLY = javaXMLELe.getRect().y;
			System.out.println(javaXMLY);
			actions.scrollByAmount(0, javaXMLY);

			// 3. Scroll from origin
			driver.switchTo().newWindow(WindowType.WINDOW);

			driver.get("https://www.selenium.dev/documentation/");
			WebElement legacyBtn = driver.findElement(By.xpath("//a[contains(text(),'Legacy')]"));

			// Wheel Action class
			WheelInput.ScrollOrigin scrollOriginEle = WheelInput.ScrollOrigin.fromElement(legacyBtn);

			actions.scrollFromOrigin(scrollOriginEle, 0, 200).perform();

			Thread.sleep(5000);// switching to parent window
			driver.switchTo().window(ParentWindow);
			Thread.sleep(5000);
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}
}
