package page_data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class assignLeave_data
{
	WebDriver driver;
	
	public static By assign_leave_btn = By.xpath("//span[contains(text(),'Assign Leave')]");
	public static By employee_name_field = By.xpath("//input[@id='assignleave_txtEmployee_empName']");
	public static By select_leave_type = By.xpath("//select[@id='assignleave_txtLeaveType']");
	public static By calender_from_click = By.xpath("//input[@id='assignleave_txtFromDate']");
	public static By to_date_click = By.xpath("//a[@class='ui-state-default']/../../../tr[4]/td[5]");
	public static By from_moth_click = By.xpath("//select[@class='ui-datepicker-month']");
	public static By from_date_click = By.xpath("//a[@class='ui-state-default']/../../../tr[4]/td[6]");
	public static By calender_to_click  = By.xpath("//input[@id='assignleave_txtToDate']");
	public static By comment_lines = By.xpath("//textarea[@id='assignleave_txtComment']");
	public static By assign_btn = By.xpath("//input[@id='assignBtn']");
	
	public assignLeave_data(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement assign_leave_btn_element()
	{
		return driver.findElement(assign_leave_btn);
	}
	
	public WebElement employee_name_field_element()
	{
		return driver.findElement(employee_name_field);
	}
	
	public WebElement select_leave_type_element()
	{
		return driver.findElement(select_leave_type);
	}
	
	public WebElement calender_from_click_element()
	{
		return driver.findElement(calender_from_click);
	}
	public WebElement calender_to_click_element()
	{
		return driver.findElement(calender_to_click);
	}
	
	public WebElement comment_lines_element()
	{
		return driver.findElement(comment_lines);
	}
	
	public WebElement assign_btn_element()
	{
		return driver.findElement(assign_btn);
	}
	
	public WebElement to_date_click_element()
	{
		return driver.findElement(to_date_click);
	}
	
	public WebElement from_moth_click_element()
	{
		return driver.findElement(from_moth_click);
	}
	
	public WebElement from_date_click_element()
	{
		return driver.findElement(from_date_click);
	}
}
