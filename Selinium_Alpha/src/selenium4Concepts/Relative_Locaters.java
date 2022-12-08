package selenium4Concepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

class Relative_Locaters {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		// ABOVE web-element
		WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
		String result = driver.findElement(RelativeLocator.with(By.tagName("Name")).above(name)).getText();
		System.out.println(result);

		// BELOW web-element
		WebElement DOB = driver.findElement(By.cssSelector("label[for='dateofBirth']"));
		driver.findElement(RelativeLocator.with(By.tagName("Date of Birth")).below(DOB)).sendKeys("10/10/2020");

		// near web-element
		WebElement checkbox_1 = driver.findElement(By.id("inlineRadio2"));
		driver.findElement(RelativeLocator.with(By.tagName("Employed")).near(checkbox_1)).getText();

		// to Right of
		WebElement right = driver.findElement(By.id("inlineRadio1"));
		System.out.println(
				driver.findElement(RelativeLocator.with(By.tagName("Employment Status")).toRightOf(right)).getText());

		// to Left of
		WebElement left = driver.findElement(By.id("exampleCheck1"));
		driver.findElement(RelativeLocator.with(By.tagName("Check me out if you Love IceCreams!")).toLeftOf(left))
				.click();
	}
}
