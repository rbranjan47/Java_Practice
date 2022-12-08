package randomTest;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bacTrack {
	public WebDriver driver;

	@Test
	public void testBackTrack() throws InterruptedException {
		Random rad = new Random();
		String Email = "retrobactracktest+testA" + rad.nextInt(1000) + "@gmail.com";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://portal.bactrack.com/login/");
		driver.manage().window().maximize();
		driver.findElement(By.id("id_username")).sendKeys("LS_Manager");
		driver.findElement(By.id("id_password")).sendKeys("123456789");
		driver.findElement(By.className("js-login-form-submit")).click();
		driver.findElement(By.xpath("(//a[@href='/users/'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Add Monitored Users')]")).click();

		driver.findElement(By.xpath("(//textarea[@name='emails'])[1]")).sendKeys(Email);
		driver.findElement(By.className("js-submit-add-monitored-users-button")).click();

		loaderWait();
		WebElement ele = driver.findElement(By.className("js-activity-filter"));
		Select sel = new Select(ele);
		sel.selectByValue("Inactive");

		loaderWait();
		List<WebElement> emails = driver
				.findElements(By.xpath("//table[@class='js-table-view-table']/tbody/tr/td[1]/span[2]"));
		for (WebElement email : emails) {
			if (email.getText().equalsIgnoreCase(Email)) {
				email.click();
			}
		}
	}

	public void loaderWait() {
		WebElement loader = driver.findElement(By.xpath("//div[@class='js-spinner js-add-monitored-user-spinner']"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(loader));
		wait.until(ExpectedConditions.invisibilityOf(loader));
	}
}
