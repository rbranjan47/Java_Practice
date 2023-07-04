package selenium4IMPConcept2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.manager.SeleniumManager;

public class Dimension_webelement {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		//https://www.youtube.com/watch?v=YMvb1xbc2LU
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("--remote-allow-origins=*");
		String chromePath = SeleniumManager.getInstance().getDriverPath("chromedriver");
		System.setProperty("webdriver.chrome.driver", chromePath);
		WebDriver driver = new ChromeDriver(chromeoptions);

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.manage().window().maximize(); // if you maximize width will increase

		// opening new window
		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> handles = driver.getWindowHandles();
		// reading by ITERATOR
		Iterator<String> itr = handles.iterator();

		String parent_window_Id = itr.next();

		String child_window_Id = itr.next();

		driver.switchTo().window(child_window_Id);

		// performing operation on child window
		driver.get("https://rahulshettyacademy.com/#/index");

		String ouput_child = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']"))
				.get(1).getText();
		System.out.println(ouput_child);

		// switching back to PARENT
		driver.switchTo().window(parent_window_Id);

		WebElement output_name = driver.findElement(By.cssSelector("input[name='name']"));
		output_name.sendKeys(ouput_child);

		// height and width of web-element /dimension

		System.out.println(output_name.getRect().getDimension().getHeight()); // ----height

		System.out.println(output_name.getRect().getDimension().getWidth()); // ---width

		/*
		 * Thread.sleep(5000); driver.switchTo().newWindow(WindowType.WINDOW);
		 */

	}

}
