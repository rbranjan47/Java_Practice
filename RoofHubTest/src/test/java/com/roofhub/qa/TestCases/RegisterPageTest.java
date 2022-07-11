package com.roofhub.qa.TestCases;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.roofhub.qa.base.BaseClass;
import com.roofhub.qa.pages.HomePage;
import com.roofhub.qa.pages.LoginPage;
import com.roofhub.qa.pages.RegisterPage;
import com.roofhub.qa.utils.GenerateReport;

public class RegisterPageTest extends BaseClass {
	LoginPage loginpage;
	RegisterPage registerpage;

public RegisterPageTest()
{
	super();
	
}

@Test(alwaysRun=true)
public void verifyRegistration() throws InterruptedException
{
	
	
	test=createTest("verify Registration");
	ExtentTest  NodeType=test;
	
	loginpage = new LoginPage();
	registerpage= new RegisterPage();
	
	String random_email=""+(int)(Math.random()*Integer.MAX_VALUE);
	String email= "testautomation"+random_email+"@gmail.com";
	
	System.out.println(email);
	String password="Testing@123";
	
	
	JavascriptExecutor js=((JavascriptExecutor)getDriver());
	loginpage.registerclick();
	GenerateReport.Logger_click(NodeType,"Register");

//1st Page
	Thread.sleep(10000);
	registerpage.enterAccNo();
	GenerateReport.Logger_EnterData(NodeType,"account No", "account no");
	registerpage.enterinvno1();
	GenerateReport.Logger_EnterData(NodeType,"invno1", "invno1");
	registerpage.enterInvno2();
	GenerateReport.Logger_EnterData(NodeType,"enterInvno2", "enterInvno2");
    registerpage.pickInvDate();
    GenerateReport.Logger_EnterData(NodeType,"pickInvDate", "pickInvDate");
	
	
	WebDriverWait wait= new WebDriverWait(getDriver(),30);
	wait.until(ExpectedConditions.elementToBeClickable(registerpage.NextBtn));
	
	registerpage.NextBtnClick();
	GenerateReport.Logger_click(NodeType,"Next Button");
	
	//2nd Page
	
	registerpage.enterfirstName();
	GenerateReport.Logger_EnterData(NodeType,"firstName", "firstName");
	registerpage.enterlastName();
	GenerateReport.Logger_EnterData(NodeType,"lastName", "lastName");
	registerpage.enterPhoneNo();
	GenerateReport.Logger_EnterData(NodeType,"PhoneNo", "PhoneNo");
	registerpage.selectrole();
	GenerateReport.Logger_EnterData(NodeType,"selectrole", "selectrole");
	
	wait.until(ExpectedConditions.elementToBeClickable(registerpage.NextBtnPage2));
	registerpage.clickNext2();
	
	registerpage.enteremail(email);
	GenerateReport.Logger_EnterData(NodeType,"email", "email");
	registerpage.enterpassword(password);
	GenerateReport.Logger_EnterData(NodeType,"password", "password");
	registerpage.enterconfirmpassword(password);
	GenerateReport.Logger_EnterData(NodeType,"confirmpassword", "confirmpassword");
	
	wait.until(ExpectedConditions.elementToBeClickable(registerpage.finish));
	registerpage.clickfinish();
	GenerateReport.Logger_click(NodeType,"Finish Button");
	
	Thread.sleep(5000);
	String confirmregistration= registerpage.registersuccessfull.getText();
	String expected="Thank you! You have successfully registered.";
	
	try
	{
		Assert.assertEquals(confirmregistration,expected);
		GenerateReport.ValidationPass(NodeType,"confirm registration");
	} catch(AssertionError e)
	{
		System.out.println("User not registered successfully");
		GenerateReport.ValidationFail(NodeType,"confirm registration");
		throw e;
	}
	System.out.println("User registered successfully");
	

getDriver().close();
getDriver().quit();

}


}


