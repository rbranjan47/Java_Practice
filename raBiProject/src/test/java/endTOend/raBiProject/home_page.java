package endTOend.raBiProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page_data.landing_pageData;
import resources.base_class;

public class home_page extends base_class
{
	landing_pageData page_data;
	//using constructor calling base class
	public home_page()
	{
		super();
	}
	
	//assigning driver for this class
	public home_page(WebDriver driver)
	{
			base_class.driver = driver;
	}
	@BeforeMethod
	public void setup()
	{
		//callinf methods
		InitializerDriver();
	}
	
	@Test
	public void pageNavigation() throws IOException, InterruptedException
	{
		String web_url = prop.getProperty("url");
		driver.get(web_url);
		Thread.sleep(3000);
		
		//creating object of the landing page data
		page_data = new landing_pageData(driver);
		//Username
		String username = prop.getProperty("username");
		page_data.signin().sendKeys(username);
		//Password
		String password = prop.getProperty("password");
		page_data.passWord().sendKeys(password);
		//logging in
		page_data.login().click();
		//logging out
		WebElement logout_click_move = page_data.logoutclick();
		Actions action = new Actions(driver);
		action.moveToElement(logout_click_move);
		logout_click_move.click();
		
		page_data.logoutbtn().click();
	}
	
	@AfterMethod
	public void exitup()
	{
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
	}
}
