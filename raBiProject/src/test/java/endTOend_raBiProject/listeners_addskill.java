package endTOend_raBiProject;

import org.apache.commons.mail.EmailException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Methods.reusable_methodsClass;
import Methods.util;
import page_data.addSkills_data;
import page_data.landing_pageData;
import resources.base_class;

public class listeners_addskill extends base_class 
{
	landing_pageData page_data;
	addSkills_data addskills;
	reusable_methodsClass reusable;
	util utils;
	
	//importing log manager
	public static Logger log = LogManager.getLogger(assignleave_test.class.getName());
	
	public listeners_addskill() 
	{
		super();
	}

	public listeners_addskill(WebDriver driver)
	{
		base_class.driver = driver;
	}
	
	@BeforeMethod
	public void setup() {
		// callinf methods
		log.info("driver is initialize");
		InitializerDriver();
	}
	

	@Test
	public void add_skills() throws InterruptedException, EmailException
	{
		String web_url = properties.getProperty("url");
		driver.get(web_url);
		Thread.sleep(3000);

		// creating object of the landing page data
		page_data = new landing_pageData(driver);
		
		//creating object of the assign leave page
		addskills = new addSkills_data(driver);
		
		//creating object of reusable class
		reusable = new reusable_methodsClass(driver);
		
		//creating objects of utils class
		utils = new util(driver);
		
		// Username
		String username = properties.getProperty("username");
		page_data.signin().sendKeys(username);
		// Password
		String password = properties.getProperty("password");
		page_data.passWord().sendKeys(password);
		// logging in
		page_data.login().click();
		log.info("User is logging in");
		
		//clikcing on the admin button
		WebElement admin_click = addskills.admin_button_element();
		reusable.webdriverwait(driver, admin_click);
		admin_click.click();
		//hovering mouse on the Qualification
		WebElement qualification_click = addskills.qualifications_element();
		reusable.mouse_hover(driver, qualification_click);
		//clicking on the skills
		WebElement skill_click = addskills.skills_element();
		reusable_methodsClass.jsclick(skill_click);
		
		//passing the values in the new skills
		for(int i=1;i<=3;i++)
		{
			WebElement add_skilss = addskills.add_btn_element();
			reusable.webdriverwait(driver, add_skilss);
			add_skilss.click();
			
			WebElement name = addskills.name_element();
			reusable.webdriverwait(driver, name);
			name.sendKeys(properties.getProperty("add_skill_name"+i));
			
			WebElement description = addskills.description_element();
			reusable.webdriverwait(driver, description);
			description.sendKeys(properties.getProperty("add_description"+i));
			
			Thread.sleep(3000);
			//clicking on save button
			addskills.save_btn_element().click();
			Thread.sleep(3000);
		}
		//refreshing the page
		reusable.refresh_page(driver);
		
		//getting text from the table
		String skills_values = addskills.checkbox_table_element().getText();
		System.out.println(skills_values);
		
		//deleting the added skills, as if needed
		int skills_count = skills_values.length();
		for(int j=1; j<skills_count; j++)
			{
				if (skills_values.equalsIgnoreCase(properties.getProperty("delete_skills"+j)))
					{
					WebElement skills_checkBox = addskills.check_box_element();
					skills_checkBox.click();
					//clicking on the delete button
					addskills.delete_btn_element().click();
					Thread.sleep(3000);
					}
			}
		String message = "this is listeners class test";
		utils.emails(message);
		
	}
	
	@AfterMethod
	public void exitup() throws InterruptedException
	{
		Thread.sleep(3000);
		WebElement logout_click_move = page_data.logoutclick();
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(logout_click_move));
		//logging out
		Actions action = new Actions(driver);
		action.moveToElement(logout_click_move);
		//logout_click_move.click();
		reusable_methodsClass.jsclick(logout_click_move);

		page_data.logoutbtn().click();
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
	}
}
