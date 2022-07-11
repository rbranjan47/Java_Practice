package com.roofhub.qa.TestCases;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.roofhub.qa.base.BaseClass;
import com.roofhub.qa.base.Config;
import com.roofhub.qa.pages.HomePage;
import com.roofhub.qa.pages.LoginPage;
import com.roofhub.qa.utils.GenerateReport;
import com.roofhub.qa.utils.HelperFunctions;
import com.roofhub.qa.utils.Reusable;
import com.roofhub.qa.pages.*;

public class OrderPageTest extends BaseClass{

	
	NewOrderPage order1;
	NewOrderPage2 order2;
	LoginPageTest loginpagetest;
	Reusable reusablemethods;
	
	
public OrderPageTest()
{
	super();
	
}

@Test
public void verifyplaceorder() throws InterruptedException
{
	
	test=createTest("verify place order");
	ExtentTest  NodeType=test;
	
	LoginPage loginpage = new LoginPage();
	HomePage homepage= new HomePage();
	reusablemethods = new Reusable(getDriver());
	HelperFunctions helper=new HelperFunctions(getDriver());
	order1= new NewOrderPage();
	order2 =new NewOrderPage2();
	
	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	homepage=loginpage.login(Config.Username, Config.Password);
	
	GenerateReport.Logger_EnterData(NodeType,"ValidCredentials","LoginCredentials");
	
	WebElement button=order1.OrderButton();
	helper.explicitWait(button);
	
	
//	WebDriverWait wait= new WebDriverWait(getDriver(),30);
//	
//	WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dashboard-side-panel']/div[1]/div[2]//div[@class='row']/div[1]/div/span[2]")));
	homepage= new HomePage();
	homepage.NewOrder(); 
	
	GenerateReport.Logger_click(NodeType,"New Order Button");
	
	Thread.sleep(8000);
	if(order1.Discard.isDisplayed())
	{
	order1.discardautosaveOrder();
	GenerateReport.Logger_click(NodeType,"discard auto save Order");
	}
	
	order1.pickUpClick();
	GenerateReport.Logger_click(NodeType,"Pick Up");
	
	
	order1.PO.sendKeys("PO"+reusablemethods.randomStrings());
	GenerateReport.Logger_click(NodeType,"PO");
	
	order1.JobName.sendKeys("JOB"+reusablemethods.randomStrings());
	GenerateReport.Logger_click(NodeType,"Job Name");
	
	WebElement continueToStep2Button=order1.continueToStep2Button();
	helper.explicitWait(continueToStep2Button); 
	
//	wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.id("continueToStep2Button"))));
	order1.NextClick(); 
	
	GenerateReport.Logger_click(NodeType,"Next Button"); 
	
	Thread.sleep(2000);
	
	//order2.selectBranch();
	order2.selectJobAccount();
	reusablemethods.implicitWait(5);
	getDriver().findElement(By.xpath("//html")).click();
	
	order2.PickupDates();
	reusablemethods.implicitWait(5);
	
	order2.selectArrivaltime();
	reusablemethods.implicitWait(5);
	getDriver().findElement(By.xpath("//html")).click();
	
	order2.instructionsInput();
	order2.emailAdd();
	
	js.executeScript("window.scrollBy(0,400)");
	order2.clickOrderTemplate();
	order2.selectTemplate();
	
	
	//helper.explicitWait(order2.ReviewOrderBtn);
	Thread.sleep(5000);
	
	//wait.until(ExpectedConditions.elementToBeClickable(order2.ReviewOrderBtn));
	order2.ReviewOrderClick();
	GenerateReport.Logger_click(NodeType,"Review Order");
	
	order2.PlaceOrderClick();
	GenerateReport.Logger_click(NodeType,"Place Order");
	
	String o1=order2.OrderSuccess.getText();
	String expected="Order Successful";
	
	try
	{
		Assert.assertEquals(o1,expected);
		GenerateReport.ValidationPass(NodeType,o1);
		
	} catch(AssertionError e)
	{
		
		GenerateReport.ValidationFail(NodeType,o1);
		System.out.println("Order not placed");
		throw e;
	}
	System.out.println("Order placed successfully");
	
	getDriver().close();
	getDriver().quit();

	
}
/*
@Test(priority = 2,alwaysRun=true)
public void verifyCancelOrder() throws InterruptedException
{
	
	LoginPage loginpage = new LoginPage();
	HomePage homepage= new HomePage();
	HelperFunctions helper=new HelperFunctions(getDriver());
	
	test=createTest("verify cancel order");
	ExtentTest  NodeType=test;
	
	order1= new NewOrderPage();
	order2 =new NewOrderPage2();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	homepage=loginpage.login(Config.Username, Config.Password);
	
	GenerateReport.Logger_EnterData(NodeType,"ValidCredentials","LoginCredentials");
	
	WebElement username_panel=order1.username_panel();
	helper.explicitWait(username_panel);
	
//	WebDriverWait wait= new WebDriverWait(getDriver(),30);
//	wait.until(ExpectedConditions.visibilityOf(username_panel));
	
	homepage= new HomePage();
	homepage.NewOrder();
	
	
	GenerateReport.Logger_click(NodeType,"New Order Button");
	
	Thread.sleep(8000);
	if(order1.Discard.isDisplayed())
	{
	order1.discardautosaveOrder();
	GenerateReport.Logger_click(NodeType,"discard auto save Order");
	}
	order1.pickUpClick();
	GenerateReport.Logger_click(NodeType,"Pick Up");
	
	WebElement continueToStep2Button=order1.continueToStep2Button();
	helper.explicitWait(continueToStep2Button);
	
	//wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.id("continueToStep2Button"))));
	order1.NextClick();
	GenerateReport.Logger_click(NodeType,"Next");
	
	Thread.sleep(2000);
	//order2.selectBranch();
	
	order2.selectJobAccount();
	
	getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	js.executeScript("window.scrollBy(0,400)");
	order2.PickupDates();
	order2.selectArrivaltime();
	order2.clickOrderTemplate();
	order2.selectTemplate();
js.executeScript("arguments[0].scrollIntoView(true);", order2.Cancel);


Thread.sleep(10000);
	order2.CancelOrder();
	Thread.sleep(4000);
	WebElement logo=order2.Logo(); 
	
if(logo.isDisplayed())
{
	GenerateReport.ValidationPass(NodeType,"Order Cancelled successfully");
	System.out.println("Order Cancelled successfully");
}

else 
{
	GenerateReport.ValidationFail(NodeType,"Order cancellation");
	System.out.println("Test Fail: Order not cancelled");
}
getDriver().close();
getDriver().quit();
}

@Test(enabled=false,priority=3)

public void verifyDraftOrder() throws InterruptedException
{
	LoginPage loginpage = new LoginPage();
	HomePage homepage= new HomePage();
	HelperFunctions helper=new HelperFunctions(getDriver());
	
	test=createTest("verify Draft order");
	ExtentTest  NodeType=test;
	
	order1= new NewOrderPage();
	order2 =new NewOrderPage2();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;

	homepage=loginpage.login(Config.Username, Config.Password);
	GenerateReport.Logger_EnterData(NodeType,"ValidCredentials","LoginCredentials");
	
	WebDriverWait wait= new WebDriverWait(getDriver(),30);
	WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dashboard-side-panel']/div[1]/div[2]//div[@class='row']/div[1]/div/span[2]")));
	homepage= new HomePage();
	
	homepage.NewOrder();
	GenerateReport.Logger_click(NodeType,"New Order Button");
	
	order1.pickUpClick();
	GenerateReport.Logger_click(NodeType,"Pick Up Button");
	
	wait.until(ExpectedConditions.elementToBeClickable(getDriver().findElement(By.id("continueToStep2Button"))));
	
	order1.NextClick();
	GenerateReport.Logger_click(NodeType,"Next");
	Thread.sleep(2000);
	//order2.selectBranch();
	order2.selectJobAccount();
	getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	js.executeScript("window.scrollBy(0,400)");
	order2.PickupDates();
	order2.selectArrivaltime();
	order2.clickOrderTemplate();
	order2.selectTemplate();
js.executeScript("arguments[0].scrollIntoView(true);", order2.DraftOrder);

order2.DraftOrder();

getDriver().close();
getDriver().quit();
}
*/
	
}
