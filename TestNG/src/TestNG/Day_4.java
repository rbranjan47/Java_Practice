package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day_4 
{
	@Test(groups= {"smoke"})  //to run in groups ,which will use by Using , Groups, Run and Include tag between Class and Test.
	                          //we can also Exclude that Group by using tag Exclude.
	public void test_1()
	{
		System.out.println("this is a test first method");
	}
	
	@Test(enabled = false) //testNG will skip this test method,let suppose BUG is in this test case.
	public void test_2()
	{
		System.out.println("this is test second method");
	}
	
	@Test(groups= {"smoke"})
	public void test_3()
	{
		System.out.println("this is third test case method");
	}
	
	@Parameters({"URL"})
	@Test(groups= {"smoke"})
	public void test_4()
	{
		System.out.println("this is the fourth test case method");
	}
	//@BeforeTestSuite , runs tests before all the test suites.
	@BeforeSuite(timeOut = 4000) //in milli-seconds,just like thread.sleep method
	public void before_suite()
	{
		System.out.println("Before Suite");
	}
	
	//@AfterTestSuite, annotated method will run after all the tests suites.
	@AfterSuite
	public void after_suite()
	{
		System.out.println("after suite");
	}
	
	//@BeforeTest, annotated method will run before the test.
	@BeforeTest
	public void before_test()
	{
		System.out.println("before test");
	}
	
	//@AfterTest, annotated method will run after the test.
	@AfterTest
	public void after_test()
	{
		System.out.println("after test");
	}
	
	//@BeforeClass, annotated method will run before all the test method in the invoked class.
	@BeforeClass
	public void before_class()
	{
		System.out.println("before class");
	}
	
	//@AfterClass, annotated method will run after all the test method in the invoked class.
	@AfterClass
	public void after_class()
	{
		System.out.println("after class");
	}
	
	//@BeforeMethod, annotated test method will run before each test methods.
	@BeforeMethod
	public void before_method()
	{
		System.out.println("before method");
	}
	
	//@AfterMethod, annotated test method will run after each test methods.
	@AfterMethod(timeOut =4000)
	public void after_method()
	{
		System.out.println("after method");
	}
	
}

//we can also use "DependOnmethods" way to run the methods.and also many ways like dependsOn groups.

