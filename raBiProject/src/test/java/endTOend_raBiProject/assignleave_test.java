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
import page_data.assignLeave_data;
import page_data.landing_pageData;
import resources.base_class;

public class assignleave_test extends base_class 
{
	landing_pageData page_data;
	assignLeave_data assign_data;
	reusable_methodsClass reusable;
	
	//importing log manager
	public static Logger log = LogManager.getLogger(assignleave_test.class.getName());
	
	public assignleave_test() 
	{
		super();
	}

	public assignleave_test(WebDriver driver)
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
	public void leave_assign() throws InterruptedException
	{
		String web_url = properties.getProperty("url");
		driver.get(web_url);
		Thread.sleep(3000);

		// creating object of the landing page data
		page_data = new landing_pageData(driver);
		
		//creating object of the assign leave page
		assign_data = new assignLeave_data(driver);
		
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
		
		assign_data.assign_leave_btn_element().click();
		//assing name
		String name = properties.getProperty("name");
		
		assign_data.employee_name_field_element().sendKeys(name);
		
		//selecting leave type
		WebElement leave_type = assign_data.select_leave_type_element();
		leave_type.click();
		Select select = new Select(leave_type);
		String leave_name = properties.getProperty("leaveName");
		select.selectByVisibleText(leave_name);
		
		//from date
		assign_data.calender_from_click_element().click();
		/*
		//AS IT IS NOT ACCEPTING VALUE FROM THE GIVEN DATE, WE ARE USING A CLICKING METHOD, USING INDEX TERMINALOGY
		//using date libraries
		String year = prop.getProperty("from_year");
		int year_int = Integer.parseInt(year);
		
		String month = prop.getProperty("from_month");
		int month_int = Integer.parseInt(month);
		
		String day = prop.getProperty("from_date");
		int date_int = Integer.parseInt(day);
		
		String date_in_format = reusable.date(year_int, month_int, date_int);
		String splitdate[] = date_in_format.split("-");
		String month_spliter = splitdate[1];
		String day_splitter = splitdate[0];
		System.out.println(month_spliter);
		System.out.println(day_splitter);
		
		assign_data.calender_from_click_element().sendKeys(date_in_format);
		*/
		//to date
		assign_data.calender_to_click_element().click();
		
		/*
		//using date libraries
		String to_year = prop.getProperty("to_year");
		int to_year_int = Integer.parseInt(to_year);
		
		String to_month = prop.getProperty("to_month");
		int to_month_int = Integer.parseInt(to_month);
		
		String to_day = prop.getProperty("to_date");
		int to_date_int = Integer.parseInt(to_day);
		
		String date_to_format = reusable.date(to_year_int, to_month_int, to_date_int);
		String splitdate_to[] = date_to_format.split("-");
		String month_spliter_to = splitdate_to[1];
		String day_splitter_to = splitdate_to[0];
		System.out.println(month_spliter_to);
		System.out.println(day_splitter_to);
		
		assign_data.calender_from_click_element().sendKeys(date_to_format);
		*/
		assign_data.to_date_click_element().click();
		WebElement month_select = assign_data.from_moth_click_element();
		//waiting for that element
		reusable.webdriverwait(driver, month_select);
		//now using select class
		Select select_month = new Select(month_select);
		String short_month = properties.getProperty("short_month_name");
		select_month.selectByVisibleText(short_month);
		
		assign_data.from_date_click_element().click();
		Thread.sleep(3000);
		String comment = properties.getProperty("comments");
		assign_data.comment_lines_element().sendKeys(comment);
		assign_data.assign_btn_element().click();
	
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
