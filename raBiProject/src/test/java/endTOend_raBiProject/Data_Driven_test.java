package endTOend_raBiProject;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Methods.reusable_methodsClass;
import page_data.landing_pageData;
import resources.base_class;

public class Data_Driven_test extends base_class 
{
	landing_pageData page_data;
	reusable_methodsClass reusableMethods;

	// using constructor calling base class
	public Data_Driven_test() 
	{
		super();
	}

	// assigning driver for this class
	public Data_Driven_test(WebDriver driver)
	{
		base_class.driver = driver;
	}

	@BeforeMethod
	public void setup() 
	{
		// callinf methods
		InitializerDriver();
	}

	@Test(dataProvider = "data_provider")
	public void pageNavigation(String username_data, String employeename_data) throws IOException, InterruptedException 
	{
		String web_url = properties.getProperty("url");
		driver.get(web_url);
		Thread.sleep(3000);
		//validating title of the page
		String expected_title = properties.getProperty("title");
		String actual_pagetitle =driver.getTitle();
		Assert.assertEquals(actual_pagetitle, expected_title);
		
		// creating object of the landing page data
		page_data = new landing_pageData(driver);
		// Username
		String username = properties.getProperty("username");
		page_data.signin().sendKeys(username);
		// Password
		String password = properties.getProperty("password");
		page_data.passWord().sendKeys(password);
		//validating the login button is present or not
		Assert.assertTrue(page_data.login().isEnabled());
		
		// logging in
		page_data.login().click();
		Assert.assertEquals(actual_pagetitle, expected_title);
		//verifying admin button
		Assert.assertTrue(page_data.admin_btn().isEnabled());
		// Searching user in the admin
		page_data.admin_btn().click();

		// passing value in the admin_username
		page_data.adminusername().sendKeys(username_data);
		// selecting value in the admin_userrole
		WebElement userrole = page_data.adminuserrole();
		Actions action = new Actions(driver);
		action.moveToElement(userrole).build().perform();
		userrole.click();
		// selecting ESS
		WebElement ess_role = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']/option[3]"));
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(ess_role));
		ess_role.click();
		// passing value in the employeename
		page_data.adminemployeenname().sendKeys(employeename_data);
		// selecting the value in the admin status
		WebElement adminStatus = page_data.adminstatus();
		Actions act = new Actions(driver);
		act.moveToElement(adminStatus).build().perform();
		adminStatus.click();
		// clicking on the search btn
		page_data.searchbtn().click();
		//printing the information
		System.out.println(page_data.search_infoText());

	}

	@DataProvider(name = "data_provider")
	public Object[][] datavalues() {
		// rows-----> How many data should have to run
		// cloumn---> How many different tests cases should run
		Object[][] obj_data = new Object[3][2];
		//0th row
		obj_data[0][0] = "Maggie.Manning";
		obj_data[0][1] = "Maggie Manning";
		//1st row
		obj_data[1][0] = "Nina.Patel";
		obj_data[1][1] = "Nina Patel";
		//2nd row
		obj_data[2][0] = "Charlie.Carter";
		obj_data[2][1] = "Charlie Carter";

		return obj_data;
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

		page_data.logoutbtn().click();
		driver.manage().deleteAllCookies();
		driver.close();
		driver.quit();
	}

}
