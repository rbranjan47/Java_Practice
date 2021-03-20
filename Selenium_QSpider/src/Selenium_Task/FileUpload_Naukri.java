//script for uploading resume in naukri.com, after login

package Selenium_Task;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload_Naukri 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//span[text()='Later']")).click();
		
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys("rbranjan47@gmail.com");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter your password']")).sendKeys("Rabi8936@#");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@class='col s12 dp-wrapper center']")).click();
	
		
		File f=new File("./Data/Rabi_Ranjan_Resume.pdf");
		String absolute_Path=f.getAbsolutePath();
		
		driver.findElement(By.id("attachCV")).sendKeys(absolute_Path);
		Thread.sleep(5000);
		
		//Moving cursor
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//div[text()='My Naukri']"))).build().perform();
		
		driver.findElement(By.xpath("//a[@title='Logout']")).click();
		
		Thread.sleep(5000);
		 
		// driver.close();
		

	}

}
