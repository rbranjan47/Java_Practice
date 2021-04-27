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

public class createJob extends base_class
{
	landing_pageData page_data;
	createJob_data create_data;
	//using constructor calling base class
	public createJob()
	{
		super();
	}
	
	//assigning driver for this class
	public createJob(WebDriver driver)
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
		
		//verifying admin button
		Assert.assertTrue(page_data.admin_btn().isEnabled());
		// Searching user in the admin
		page_data.admin_btn().click();
		
		
		WebElement job_btn = create_data.job_element();
		Actions act = new Actions(driver);
		act.moveToElement(job_btn).build().perform();
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(job_btn));
		WebElement job_title_click = create_data.job_title_element();
		reusable_methodsClass.jsclick(job_title_click);
		Thread.sleep(3000);
		create_data.add_job().click();
		//passing title in add job
		String title = prop.getProperty("title");
		create_data.add_job_title_element().sendKeys(title);
		
		//passing the description 
		String description = prop.getProperty("descritption");
		create_data.add_job_description_element().sendKeys(description);
		
		//passing files 
		String file_choosen = prop.getProperty("file_path");
		create_data.add_job_file_element().sendKeys(file_choosen);
		
		//passing note
		String note = prop.getProperty("note");
		create_data.add_job_note_element().sendKeys(note);
		//clicking on Add button
		create_data.add_job_savebtn_element().click();
	}
	
	@AfterMethod
	public void exitup()
	{
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
