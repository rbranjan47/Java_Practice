package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;


public class Test_Webdriver_Demo 
{
	@Test
	public void test_webdriver_listener()
	{
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
		//We have to Intialize the Webdriver_list_Demo , though which we can pass WebDriver Listeners
		
		WebDriver driver=new ChromeDriver();
		
		//Create New Object of EventFiringWebDriver 
		EventFiringWebDriver event_fire_driver=new EventFiringWebDriver(driver);
		
		//register the ref. of Event_Firing_webdriver into Web_Driver_Listeners(Listener Class Name)
		Web_Driver_Listeners listener_event=new Web_Driver_Listeners();
		
		event_fire_driver.register(listener_event);
		
		
		event_fire_driver.manage().window().maximize();
		
		event_fire_driver.get("https://www.amazon.in");
		
		event_fire_driver.findElement(By.id("wrong_id")).click();
	}
}
