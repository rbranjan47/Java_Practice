package randomTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testLocaters {

	@Test
	public void testLocatersMain() throws InterruptedException {
		ChromeOptions chromeOption = new ChromeOptions();
		chromeOption.addArguments("--remote-allow-origins=*");

		chromeOption.setAcceptInsecureCerts(true);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOption);
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		driver.findElement(By.xpath("//a[contains(text(),'Checkboxes')]")).click();
		
		//Is Displayed
		WebElement checkBoxes = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
		System.out.println(checkBoxes.isDisplayed());
		System.out.println(checkBoxes.isEnabled());
		System.out.println(checkBoxes.isSelected());
		
		checkBoxes.click();
		
		WebElement checkBoxes2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
		System.out.println(checkBoxes2.isDisplayed());
		System.out.println(checkBoxes2.isEnabled());
		System.out.println(checkBoxes2.isSelected());
		
		checkBoxes2.click();
		
		//navigating back
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]")).click();
		
		Actions actionss = new Actions(driver);
		WebElement rightClick = driver.findElement(By.id("hot-spot"));
		actionss.contextClick(rightClick).perform();
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(5000);
		driver.quit();
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
			driver.quit();
		}
	}
}
