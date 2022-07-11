package com.roofhub.qa.TestCases;

import com.aventstack.extentreports.ExtentTest;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.roofhub.qa.base.BaseClass;
import com.roofhub.qa.base.Config;
import com.roofhub.qa.pages.HomePage;
import com.roofhub.qa.pages.LoginPage;
import com.roofhub.qa.utils.GenerateReport;

public class LoginPageTest extends BaseClass {
	

@Test
public void verifyloginwithvalidcredentials()
{
	
	LoginPage loginpage = new LoginPage();
	HomePage homepage= new HomePage();
	
	test=createTest("verify login with valid credentials");
	ExtentTest  NodeType=test;
	
	String expected="Rishabh 12 Singh 12";
	homepage=loginpage.login(Config.Username, Config.Password);
	
	GenerateReport.Logger_EnterData(NodeType,"ValidCredentials","LoginCredentials");
	
	WebDriverWait wait= new WebDriverWait(getDriver(),30);
	wait.until(ExpectedConditions.visibilityOf(homepage.username_side_panel));
	
    String welcome=homepage.WelcomeDisplayText();
    
try
{
	Assert.assertEquals(welcome, expected);
	GenerateReport.ValidationPass(NodeType,"welcome Text");
} catch(AssertionError e)
{
	System.out.println("User not able to login with valid credentials");
	GenerateReport.ValidationFail(NodeType,"welcome Text");
	throw e;
}
System.out.println("User logged in successfully with valid credentials");
	GenerateReport.Logger_Info(NodeType,"User logged in successfully with valid credentials");
	
	getDriver().close();
	getDriver().quit();
	
}


@Test(alwaysRun=false)
public void verifyloginwithinvalidcredentials()
{
	test=createTest("verify login with Invalid credentials");
	ExtentTest  NodeType=test;
	
	LoginPage loginpage = new LoginPage();
	HomePage homepage= new HomePage();
	
	String actual=loginpage.incorrectdetails.getAttribute("innerHTML");
    String expected="The username or password is incorrect.";
    
	homepage=loginpage.login(Config.Username, "test");
	
	GenerateReport.Logger_EnterData(NodeType,"InvalidCredentials","LoginCredentials");
	
	WebDriverWait wait1= new WebDriverWait(getDriver(),30);
	wait1.until(ExpectedConditions.visibilityOf(loginpage.incorrectdetails));
	System.out.println(actual);
	
	GenerateReport.ValidationPass(NodeType,"validated the invalid Login");
	
	getDriver().close();
	getDriver().quit();	
}

@Test(alwaysRun=false)
public void verifylogout()
{
	
	test=createTest("verify logout");
	ExtentTest  NodeType=test;
	
	LoginPage loginpage = new LoginPage();
	HomePage homepage= new HomePage();

	homepage=loginpage.login(Config.Username, Config.Password);
	
	GenerateReport.Logger_EnterData(NodeType,"Valid Credentials","LoginCredentials");
	
	WebDriverWait wait= new WebDriverWait(getDriver(),30);
	wait.until(ExpectedConditions.visibilityOf(homepage.username_side_panel));
	
	homepage.clickProfilemenu();
	GenerateReport.Logger_click(NodeType,"Profile Menu");
	
	homepage.clicklogout();
	GenerateReport.Logger_click(NodeType,"Logout Button");
	
	
	getDriver().close();
	getDriver().quit();
	
	
}
    }


