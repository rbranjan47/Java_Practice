package page_data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class addSkills_data 
{
	WebDriver driver;
	
	//Web-Elements
	public static By admin_button = By.xpath("//b[contains(text(),'Admin')]");
	public static By qualifications = By.xpath("//a[contains(text(),'Qualifications')]");
	public static By skills = By.xpath("//a[contains(text(),'Skills')]");
	public static By checkbox_table = By.xpath("//table[@id='recordsListTable']/tbody[1]");
	public static By check_box = By.xpath("//input[@type='checkbox']");
	public static By add_btn = By.xpath("//input[@id='btnAdd']");
	public static By name = By.xpath("//input[@id='skill_name']");
	public static By description = By.xpath("//textarea[@id='skill_description']");
	public static By save_btn = By.xpath("//input[@id='btnSave']");
	public static By delete_btn = By.xpath("//input[@id='btnDel']");
	
	
	public addSkills_data(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement admin_button_element()
	{
		return driver.findElement(admin_button);
	}
	
	public WebElement add_btn_element()
	{
		return driver.findElement(add_btn);
	}
	
	public WebElement name_element()
	{
		return driver.findElement(name);
	}
	
	public WebElement description_element()
	{
		return driver.findElement(description);
	}
	
	public WebElement save_btn_element()
	{
		return driver.findElement(save_btn);
	}
	
	public WebElement qualifications_element()
	{
		return driver.findElement(qualifications);
	}
	
	public WebElement skills_element()
	{
		return driver.findElement(skills);
	}
	
	public WebElement checkbox_table_element()
	{
		return driver.findElement(checkbox_table);
	}
	
	public WebElement check_box_element()
	{
		return driver.findElement(check_box);
	}
	
	public WebElement delete_btn_element()
	{
		return driver.findElement(delete_btn);
	}
	
}
