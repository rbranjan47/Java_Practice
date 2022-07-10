package Alpha_NewFeatures;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot_Webelement 
{
	@SuppressWarnings("deprecation")
	public static void main(String[] args)  throws InterruptedException, IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		//opening new window
		driver.switchTo().newWindow(WindowType.TAB);
		
		
		Set<String> handles=driver.getWindowHandles();
		//reading by ITERATOR
		Iterator<String> itr=handles.iterator();
		
		String parent_window_Id=itr.next();
		
		String child_window_Id=itr.next();
		
		driver.switchTo().window(child_window_Id);
		
		//performing operation on child window
		driver.get("https://rahulshettyacademy.com/#/index");
		
		String ouput_child=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		System.out.println(ouput_child);
		
		//switching back to PARENT
		driver.switchTo().window(parent_window_Id);
		
		//in a good format we just converted into web-element to perform some actios
	  WebElement name_output=driver.findElement(By.cssSelector("input[name='name']"));
	  //sending values
	  name_output.sendKeys(ouput_child);
	  
	  //calling screenshot method
	 File file= name_output.getScreenshotAs(OutputType.FILE);  
	//-------now this file is an object, to convert it into normal file we have to import an APACHE MAVEN COMMON IO FILE----
	
	 FileUtils.copyFile(file, new File("webelement_screenshot.png"));
	  
		
	}
}

