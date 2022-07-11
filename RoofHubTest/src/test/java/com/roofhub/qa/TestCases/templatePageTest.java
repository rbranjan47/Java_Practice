package com.roofhub.qa.TestCases;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.roofhub.qa.base.BaseClass;
import com.roofhub.qa.base.Config;
import com.roofhub.qa.pages.HomePage;
import com.roofhub.qa.pages.LoginPage;
import com.roofhub.qa.pages.templatePage;
import com.roofhub.qa.utils.GenerateReport;
import com.roofhub.qa.utils.HelperFunctions;
import com.roofhub.qa.utils.Reusable;

public class templatePageTest extends BaseClass{
	LoginPage loginpage;
	HomePage homepage;
	templatePage templatepage;
	HelperFunctions helper;
	Reusable reusablemethods;
	
	
	public templatePageTest()
	{
		super();
	}
	
	@Test(alwaysRun = true)
	public void CreateTemplate() throws InterruptedException {
		
		test=createTest("Verify Create Template");
		ExtentTest  NodeType = test;
		
		loginpage = new LoginPage();
		homepage= new HomePage();
		templatepage = new templatePage();
		reusablemethods = new Reusable(getDriver());
		helper = new HelperFunctions(getDriver());
		WebDriver driver = BaseClass.getDriver();
		
	
		
        
        JavascriptExecutor js = (JavascriptExecutor) getDriver();

    	homepage=loginpage.login(Config.Username, Config.Password);
    	
    	GenerateReport.Logger_EnterData(NodeType,"ValidCredentials","LoginCredentials");
    	
    	WebElement templateHomeButtom=homepage.NewOrderTemplate;
    	helper.explicitWait(templateHomeButtom);
    	homepage.newTemplate();
		
		/*
		 * Storing template button in logger
		 */
    	GenerateReport.Logger_click(NodeType,"New Template Button");
    	WebElement templateName = templatepage.TempName;
    	reusablemethods.webDriverwait(templateName);
    	
    	
        
        templateName.sendKeys("Template"+reusablemethods.randomStrings());
        GenerateReport.Logger_click(NodeType,"Entered Template Name");
        
        reusablemethods.webDriverwait(templatepage.desc);
        templatepage.Templatedesc();
        GenerateReport.Logger_click(NodeType,"Entered Template Brief Description");
        
        
        Thread.sleep(3000);
        templatepage.TemplateQTYCHL();
        
        Thread.sleep(2000);
        GenerateReport.Logger_click(NodeType,"Quality Checked");
        
        helper.explicitWait(templatepage.item1);
       try {
    	   templatepage.tempitm1();
       }
       catch(Exception e) {
    	   System.out.println("Item1 not selected");
       }
        
       helper.explicitWait(templatepage.item2);
       try {
    	   templatepage.tempitm2();
       }
       catch(Exception e) {
    	   System.out.println("Item2 not selected");
       }
       
       helper.explicitWait(templatepage.item3);
       try {
    	   templatepage.tempitm3();
       }
       catch(Exception e) {
    	   System.out.println("Item3 not selected");
       }
       
       helper.explicitWait(templatepage.item4);
       try {
    	   templatepage.tempitm4();
       }
       catch(Exception e) {
    	   System.out.println("Item4 not selected");
       }
       GenerateReport.Logger_click(NodeType,"Entered Item Description & Quantities");
      /* 
       for(int i=1; i<=4; i++) {
    	  WebElement quantyValue = driver.findElement(By.xpath("(//*[@data-vv-as='Quantity'])["+i+"]"));
    	  quantyValue.sendKeys(""+i);
       }  */
       
       //js.executeScript("arguments[0].scrollIntoView();", templatepage.Email);
       templatepage.TempEmail();
       Thread.sleep(2000);
       templatepage.TempSave();
       
       
       System.out.println("Template Saved Successfully");
       GenerateReport.Logger_click(NodeType,"Template Saved Successfully");
       
       Thread.sleep(5000);
       getDriver().close();
       getDriver().quit();
	}
}
