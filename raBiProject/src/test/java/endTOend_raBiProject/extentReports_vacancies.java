package endTOend_raBiProject;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Methods.reusable_methodsClass;
import page_data.landing_pageData;
import page_data.vacancies_data;
import resources.base_class;

public class extentReports_vacancies extends base_class
{
	landing_pageData page_data;
	vacancies_data vacancies;
	reusable_methodsClass reusable;
	
	//importing log manager
	public static Logger log = LogManager.getLogger(assignleave_test.class.getName());
	
	// using constructor calling base class
	public extentReports_vacancies() 
	{
		super();
	}

	public extentReports_vacancies(WebDriver driver)
	{
		base_class.driver = driver;
	}
	
	@BeforeMethod
	public void setup() 
	{
		// callinf methods
		log.info("driver is initialize");
		InitializerDriver();
	}
	

	@Test
	public void add_skills() throws InterruptedException
	{
		String web_url = properties.getProperty("url");
		driver.get(web_url);
		Thread.sleep(3000);

		// creating object of the landing page data
		page_data = new landing_pageData(driver);
		
		//creating object of the assign leave page
		vacancies = new vacancies_data(driver);
		
		//creating object of reusable class
		reusable = new reusable_methodsClass(driver);
		
		// Username
		String username = properties.getProperty("username");
		page_data.signin().sendKeys(username);
		// Password
		String password = properties.getProperty("password");
		page_data.passWord().sendKeys(password);
		// logging in
		page_data.login().click();
		log.info("User is logging in");
		
		//clicking on the requirements button
		WebElement requirements = vacancies.requirements_element();
		reusable.webdriverwait(driver, requirements);
		requirements.click();
		
		//clicking on candidate
		vacancies.candidates_element().click();
		
		//clicking on add button,and entering value using for loop
		String candidate_String = properties.getProperty("candidate_count");
		int candidate_count = Integer.parseInt(candidate_String);
		for (int i = 1; i < candidate_count; i++)
		{
			WebElement add_candidiate = vacancies.add_btn_element();
			reusable.webdriverwait(driver, add_candidiate);
			add_candidiate.click();
			
			String firstname = properties.getProperty("firstname"+i);
			String middlename = properties.getProperty("middlename"+i);
			String lastname = properties.getProperty("lastname"+i);
			String email_address = properties.getProperty("email"+i);
			String contactNo = properties.getProperty("contactNo"+i);
			String jobvacancy = properties.getProperty("jobvacancy"+i);
			String file_string = properties.getProperty("file_path");
			String keywords = properties.getProperty("keywords"+i);
			String comment = properties.getProperty("comment"+i);
			String date = properties.getProperty("date"+i);
			
			//firstname
			vacancies.first_name_element().sendKeys(firstname);
			
			//middlename
			vacancies.middle_name_element().sendKeys(middlename);
			
			//lastname
			vacancies.last_name_element().sendKeys(lastname);
			
			//email_address
			vacancies.email_element().sendKeys(email_address);
			
			//contact_No
			vacancies.contact_no_element().sendKeys(contactNo);
			
			//job vacancy
			WebElement vacancy = vacancies.job_vacancy_element();
			vacancy.click();
			Select select = new Select(vacancy);
			select.selectByVisibleText(jobvacancy);
			
			//uploadinf resume
			WebElement upload_btn = vacancies.resume_upload_element();
			upload_btn.sendKeys(""+file_string+"");
			
			//keywords
			vacancies.keywords_element().sendKeys(keywords);
			
			//comments
			vacancies.comments_element().sendKeys(comment);
			
			//calender date and selecting it
			vacancies.calender_feild_element().click();
			vacancies.enroll_date_element(date).click();
			
			//Consent_keep_data Check box
			vacancies.consent_keep_data_element().click();
			
			//saving the date
			vacancies.save_button_element().click();
			
			//checking the date and printing it
			WebElement saved_details = vacancies.saved_details_element();
			String details = saved_details.getText();
			System.out.println(details);
			
			//clicking on back button
			vacancies.back_button_element().click();
			Thread.sleep(3000);
		}
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
