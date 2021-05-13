package Methods;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import resources.base_class;

public class util extends base_class
{
	public static long timeout=10;
	public static long pageload=15;
	WebDriver driver;
	
	public util(WebDriver driver)
	{
		base_class.driver = driver;
	}
	
	public String takescreenshot_driver(String testcasename, WebDriver driver) throws IOException
	{
		TakesScreenshot screen_shot = (TakesScreenshot)driver;
		File input_source = screen_shot.getScreenshotAs(OutputType.FILE);
		
		String filePathname = properties.getProperty("user.dir")+"\\reports"+testcasename+".png";
		File output_source = new File(filePathname);
		//file utils
		FileUtils.copyFile(input_source, output_source);
		
		return filePathname;
	}
	
	
}
