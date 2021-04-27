package page_data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class landing_pageData
{
	public WebDriver driver;
	
	
	public static By signIn = By.xpath("//input[@id='txtUsername']");
	public static By password = By.xpath("//input[@id='txtPassword']");
	public static By login_btn = By.xpath("//input[@id='btnLogin']");
	public static By logout_click = By.id("welcome");
	public static By logout_btn = By.xpath("//a[contains(text(),'Logout')]");
	public static By admin_btn = By.xpath("//b[contains(text(),'Admin')]");
	public static By admin_username = By.xpath("//input[@id='searchSystemUser_userName']");
	public static By admin_userrole = By.id("searchSystemUser_userType");
	public static By admin_employeename = By.xpath("//input[@id='searchSystemUser_employeeName_empName']");
	public static By admin_status = By.id("searchSystemUser_status");
	public static By search_btn = By.xpath("//input[@id='searchBtn']");
	public static By search_information = By.xpath("//tr[@class='odd']");
	
	//assigning driver for this class
	public landing_pageData(WebDriver driver)
	{
		this.driver = driver;
	}
	public WebElement signin()
	{
		return driver.findElement(signIn);
	}
	
	public WebElement passWord()
	{
		return driver.findElement(password);
	}
	
	public WebElement login()
	{
		return driver.findElement(login_btn);
	}
	public WebElement logoutclick()
	{
		return driver.findElement(logout_click);
	}
	
	public WebElement logoutbtn()
	{
		return driver.findElement(logout_btn);
	}
	
	public WebElement admin_btn()
	{
		return driver.findElement(admin_btn);
	}
	
	public WebElement adminusername()
	{
		return driver.findElement(admin_username);
	}
	
	public WebElement adminuserrole()
	{
		return driver.findElement(admin_userrole);
	}
	
	public WebElement adminemployeenname()
	{
		return driver.findElement(admin_employeename);
	}
	
	public WebElement adminstatus()
	{
		return driver.findElement(admin_status);
	}
	
	public WebElement searchbtn()
	{
		return driver.findElement(search_btn);
	}
	
	public WebElement search_info()
	{
		return driver.findElement(search_information);
	}
	//getting search info text
	public String search_infoText()
	{
		return search_info().getText();
	}
}

