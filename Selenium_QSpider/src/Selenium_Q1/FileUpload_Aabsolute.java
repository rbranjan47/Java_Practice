

package Selenium_Q1;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Aabsolute 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("file:///F:/Automation_%20%20QSpider/File_Upload.html");
		Thread.sleep(5000);
		
		File f=new File("./Data/Rabi_Ranjan_Resume.pdf");
		String AbsolutePath=f.getAbsolutePath();
		driver.findElement(By.id("myfile_1")).sendKeys(AbsolutePath);

	}

}
