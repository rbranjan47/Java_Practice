package Methods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import resources.base_class;

public class reusable_methodsClass extends base_class
{
	public static WebElement element;
	public reusable_methodsClass(WebDriver driver) 
	{
		base_class.driver = driver;
	}
	   // javascript click
		public static void jsclick(WebElement element)
		{
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", element);
		
		}
}
