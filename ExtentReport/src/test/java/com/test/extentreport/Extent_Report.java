package com.test.extentreport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_Report 
{
	@Test
	public void extentreport()
	{
		//Creating Reports
		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("index.html");  //project report location, i.e. index.html
		extent.attachReporter(spark);
		//setting theme
		spark.config().setTheme(Theme.DARK);
		//setting report name
		spark.config().setReportName("extent_report");
		//setting document name
		spark.config().setDocumentTitle("reportraBi");
		extent.attachReporter(spark);
		
		//Creatin Test Cases
		ExtentTest a=extent.createTest("Login");   //Creating Test
		a.pass("Logged In Successfully");
		a.info("user also options to signup");  //these all are NODES of the Tests
		a.fail("Not able to see profile picture");
		a.pass("Abled to logged out");
		
		//We can also directly pass or fail in a flow
		@SuppressWarnings("unused")
		ExtentTest b=extent.createTest("Home_Page").pass("Entere succesfully in the Home Page");
		//Creating a node of the Test Cases
		ExtentTest nodeExtentTest=extent.createTest("Home_Page").createNode("Profile_View");
		nodeExtentTest.pass("Profile Pictured Viewed");
		
		//We can also add DETAILS/LOG
		ExtentTest details=extent.createTest("Logged_Out");
		details.pass("logged out successfully");
		details.log(Status.PASS	, "logged out successfully");
		details.log(Status.FAIL, "not abled to delete user account");
		
		//We can also Run Our Exception
		Throwable t=new RuntimeException("Account Delete Exception");
		ExtentTest test=extent.createTest("Delete Account");
		test.fail(t);
		//or
		test.log(Status.FAIL, t);
		
		
		//We can also Take Screen Shot
		ExtentTest ext=extent.createTest("Logged In");
		ext.pass(MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/Lenovo/Pictures", "report_pic").build());
		ext.fail(MediaEntityBuilder.createScreenCaptureFromPath("C:/Users/Lenovo/Pictures").build());
		
		//Final Information about herereports ended and now you got report
		extent.flush();
		
	}
}
