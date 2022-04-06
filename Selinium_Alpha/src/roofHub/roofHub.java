package roofHub;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class roofHub {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://qa.roofhub.pro/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		WebElement register = driver.findElement(By.xpath("//button[contains(text(),'Register')]"));
		wait.until(ExpectedConditions.elementToBeClickable(register));
		register.click();

		driver.findElement(By.xpath("//input[@name=\'account-number\']")).sendKeys("COR206");
		driver.findElement(By.xpath("//input[@name=\'invoice-number\']")).sendKeys("16657531");
		driver.findElement(By.xpath("//input[@name=\'invoice-number-part2\']")).sendKeys("001");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");

		driver.findElement(By.xpath("//input[@name='invoice-date']")).click();
		WebElement monthOnClick = driver.findElement(By.xpath("//span[@class='day__month_btn up']"));
		wait.until(ExpectedConditions.elementToBeClickable(monthOnClick));
		monthOnClick.click();

		WebElement yearOnClick = driver.findElement(By.xpath("//span[@class='month__year_btn up']"));
		wait.until(ExpectedConditions.elementToBeClickable(yearOnClick));
		yearOnClick.click();

		List<WebElement> yearsList = driver.findElements(By.xpath("//span[@class='cell year']"));
		//span[@class='cell year']  --> xpath for years
		// div[@class='vdp-datepicker__calendar']  --> xpath for whole column

		int yearSize = yearsList.size();
		for (int i = 0; i < yearSize; i++) {
			String yearValue = yearsList.get(i).getText();
			
			if (yearValue.equalsIgnoreCase("2022")) {
				yearsList.get(i).click();
				break;
			}
		}
		
		List<WebElement> monthsList = driver.findElements(By.xpath("//span[@class='cell month']"));
		int monthSize = yearsList.size();
		for (int i = 0; i < monthSize; i++) {
			String monthValue = monthsList.get(i).getText();
		
			if (monthValue.equalsIgnoreCase("january")) {
				monthsList.get(i).click();
				break;
			}
		}
		
		List<WebElement> weekDaysList = driver.findElements(By.xpath("//span[@class='cell day blank']"));
		int weekDaySize = weekDaysList.size() ;
		for (int i = 0; i < weekDaySize; i++) {
			String weekDayValue = weekDaysList.get(i).getText();
	

			if (weekDayValue.equalsIgnoreCase("30")) {
				Thread.sleep(3000);
				weekDaysList.get(i).click();
				break;
			} 
		}
			
		List<WebElement> weekendSatList = driver.findElements(By.xpath("//span[@class='cell day weekend sat']"));
		int weekEndSatDaySize = weekendSatList.size();
		for (int i = 0; i < weekEndSatDaySize; i++) {
	   String weekDaySatValue = weekendSatList.get(i).getText();

			if (weekDaySatValue.equalsIgnoreCase("30")) {
				Thread.sleep(3000);
				weekendSatList.get(i).click();
				break;
			} 
		}
		List<WebElement> weekendSunList = driver.findElements(By.xpath("//span[@class='cell day weekend sun']"));
		int weekEndSunDaySize = weekendSunList.size();
		for (int i = 0; i < weekEndSunDaySize; i++) {
			String weekDaySunValue = weekDaysList.get(i).getText();
			

			if (weekDaySunValue.equalsIgnoreCase("30")) {
				Thread.sleep(3000);
				weekendSunList.get(i).click();
				break;
			} 
		}
		/*
		 * while (!driver .findElement(By.
		 * xpath("//div[@class='vdp-datepicker__calendar']//span[@class='day__month_btn up']"
		 * )) .getText().contains("Jan 2020")) {
		 * driver.findElement(By.xpath("(//span[@class='prev'])[1]")).click(); }
		 * List<WebElement> dateList = driver.findElements(By.className("cell day"));
		 * int ListSize = dateList.size(); for (int i = 0; i < ListSize; i++) {
		 * 
		 * String value =
		 * driver.findElements(By.className("cell day")).get(i).getText();
		 * System.out.println(value); if (value.equalsIgnoreCase("30")) {
		 * driver.findElements(By.className("cell day")).get(i).click(); break; } }
		 */
	}
}
