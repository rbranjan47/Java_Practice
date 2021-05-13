package rough;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Methods.reusable_methodsClass;
import endTOend_raBiProject.assignleave_test;
import page_data.assignLeave_data;
import page_data.landing_pageData;
import resources.base_class;

public class rough_class extends base_class
{
	landing_pageData page_data;
	assignLeave_data assign_data;
	reusable_methodsClass reusable;
	
	//importing log manager
	public static Logger log = LogManager.getLogger(assignleave_test.class.getName());
	
	public rough_class() 
	{
		super();
	}

	public rough_class(WebDriver driver)
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
	public void leave_assign() throws InterruptedException, ParseException
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
		String Employeename = properties.getProperty("Employeename");
		
		assign_data.employee_name_field_element().sendKeys(Employeename);
		
		//selecting leave type
		WebElement leave_type = assign_data.select_leave_type_element();
		leave_type.click();
		Select select = new Select(leave_type);
		String leave_name = properties.getProperty("leaveName");
		select.selectByVisibleText(leave_name);
		
		//Checking leave balance
		WebElement leave_balance = assign_data.check_leave_balance_element();
		leave_balance.click();
		
		WebElement check_leave_balance = assign_data.balance_leave_balance_element();
		reusable.webdriverwait(driver, check_leave_balance);
		
		//getting leave balance
		String string_leave_balance = check_leave_balance.getText();
		System.out.println(string_leave_balance);
		
		/*
		//normally typecasting
		Double num_leave_balance = Double.parseDouble(string_leave_balance);
		System.out.println(num_leave_balance);
		if(num_leave_balance == 0)
		{
			System.out.println("same");
		}
		*/
		
		NumberFormat format = NumberFormat.getInstance(Locale.ENGLISH);
		Number number = format.parse(string_leave_balance);
		Double double_leave_balance = number.doubleValue();
		System.out.println(double_leave_balance);
		System.out.println(string_leave_balance); 
		
		System.out.println(assign_data.balance_leave_whole_element().getText());
		//clicking on Ok button
		Thread.sleep(4000);
		assign_data.ok_button_element().click();
	}
}
