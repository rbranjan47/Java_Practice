package endTOend.raBiProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base 
{
	public  WebDriver driver;
	
	public WebDriver Initializer() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\raBiProject\\src\\main\\java"
				+ "\\endTOend\\raBiProject\\data.properties");
		
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "G:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		    driver=new FirefoxDriver();
			
		}
		
		else if (browserName.equals("internetexplorer"))
		{
			System.setProperty("webdriver.ie.driver","G:\\IE_Driver\\msedgedriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(util.timeout,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(util.pageload, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		//returning driver so that method can use it again and again
		return driver;
		
	}

}
