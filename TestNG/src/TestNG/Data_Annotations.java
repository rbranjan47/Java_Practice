/*  Data Driven Framework with TestNG
 *Case-1: Login Test( Let it have 2 parameters, UserName and Password)
 *Case-2: Similarly we have set of Data like US, PW and many things
 *So, we can write many and each times.
 *
 *We can Pass the data from excel file, then we use methods name here.
*/
package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Data_Annotations {

	WebDriver driver;

	@BeforeMethod
	public void first() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://google.com");

		driver.get("https://www.ebay.com/");
	}

	@Test
	public void testing() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobile Phone");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@aria-label='Samsung']")).click();
		// System.out.println(driver.findElement(By.xpath("//h3[contains
		// (text(),'Samsung Galaxy S7 Edge G935 32GB GSM Unlocked Android Smartphone
		// AT&T T-Mobile')]/../../div[3]/div[1]/span")).getText());

		String price = driver.findElement(By.xpath("//span[@class='s-item__price']/../../../../div[2]/div[3]/div[1]"))
				.getText();
		System.out.println(price);

	}

	@AfterMethod
	public void second() {
		driver.quit();
	}
}
