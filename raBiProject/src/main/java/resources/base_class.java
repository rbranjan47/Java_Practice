package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import Methods.util;

public class base_class
{
	
	public static WebDriver driver=null;
	public static Properties properties;
	public static WebDriverWait wait;
	
	public base_class() 
	{
		try
		{
			properties= new Properties();
			FileInputStream file=new FileInputStream("C:\\Users\\rbran\\git\\Java_Practice\\raBiProject"
					+ "\\src\\main\\java\\resources\\config.properties");
			properties.load(file);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		 catch(IOException e)
		{
			 e.printStackTrace();
		}	
	}
	
	@SuppressWarnings("deprecation")
	public static void InitializerDriver()
	{
		String browsername=properties.getProperty("browser");
		
		if (browsername.equals("chrome"))
		{
			//setting the path of chrome driver
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver =new ChromeDriver();
		}
		
		else if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(browsername.equals("internetexplorer"))
		{
			System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(util.timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(util.pageload, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
}
