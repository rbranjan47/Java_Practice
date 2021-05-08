package endTOend.raBiProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Methods.reusable_methodsClass;
import page_data.createJob_data;
import page_data.landing_pageData;
import resources.base_class;

public class createJob_test extends base_class
{
	landing_pageData page_data;
	createJob_data create_data;
	//using constructor calling base class
	public createJob_test()
	{
		super();
	}
	
	//assigning driver for this class
	public createJob_test(WebDriver driver)
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
		String web_url = properties.getProperty("url");
		driver.get(web_url);
		Thread.sleep(3000);
		
		//creating object of the landing page data
		page_data = new landing_pageData(driver);
		
		//creating object of create_job page
		create_data = new createJob_data(driver);
		
		//Username
		String username = properties.getProperty("username");
		page_data.signin().sendKeys(username);
		//Password
		String password = properties.getProperty("password");
		page_data.passWord().sendKeys(password);
		//logging in
		page_data.login().click();
		
		//verifying the title of the page
		String expected_title = properties.getProperty("title");
		String actual_pagetitle =driver.getTitle();
		Assert.assertEquals(actual_pagetitle, expected_title);
		
		//verifying admin button
		Assert.assertTrue(page_data.admin_btn().isEnabled());
		// Searching user in the admin
		page_data.admin_btn().click();
		
		
		Thread.sleep(3000);
		WebElement job_btn = create_data.job_element();
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(job_btn));
		Actions act = new Actions(driver);
		act.moveToElement(job_btn).build().perform();
		
		WebElement job_title_click = create_data.job_title_element();
		reusable_methodsClass.jsclick(job_title_click);
		Thread.sleep(3000);
		create_data.add_job().click();
		//passing title in add job
		String title = properties.getProperty("title_fill");
		create_data.add_job_title_element().sendKeys(title);
		
		//passing the description 
		String description = properties.getProperty("descritption");
		create_data.add_job_description_element().sendKeys(description);
		
		//passing files 
		String file_string = properties.getProperty("file_path");
		WebElement upload_btn = create_data.add_job_file_element();
		upload_btn.sendKeys(""+file_string+"");
		
		//passing note
		String note = properties.getProperty("note");
		create_data.add_job_note_element().sendKeys(note);
		//clicking on Add button
		create_data.add_job_savebtn_element().click();
	}
	
	@AfterMethod
	public void exitup() throws InterruptedException
	{
		Thread.sleep(4000);
		WebElement logout_click_move = page_data.logoutclick();
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(logout_click_move));
		//logging out
		Actions action = new Actions(driver);
		action.moveToElement(logout_click_move);
		//logout_click_move.click();
		reusable_methodsClass.jsclick(logout_click_move);
		
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
	}
}
