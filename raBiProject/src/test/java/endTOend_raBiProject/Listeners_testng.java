package endTOend_raBiProject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Methods.util;
import resources.base_class;

public class Listeners_testng extends base_class implements ITestListener
{
	util utils;
	//IT WILL EXECUTE ON TEST START
	@Override
	public void onTestStart(ITestResult result)
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}
	
	//IT WILL ON TEST SUCCESS
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
	}
	
	//IT WILL EXECUTE TEST FAILURE
	@Override
	public void onTestFailure(ITestResult result) 
	{
		WebDriver driver =  null;
		String testcaseMethod_Name = result.getMethod().getMethodName();
		
		//getting driver from the base class as Ilisterners is not taking driver 
		 try 
		 {
			driver= (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} 
		 catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e1) 
		 {
			
			e1.printStackTrace();
		}
		try 
		{
			utils.takescreenshot_driver(testcaseMethod_Name, driver);
		} 
		catch (IOException e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace(); 
		}
	}
	
	//IT WILL EXECUTE ON TEST SKIPPED
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	
	//IT WILL EXECUTE BY GIVING RESULT IN PERCENTAGE WITH SUCCESS PERCENT
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}
	
	//IT WILL EXECTE WHEN TEST FAIL WITH TIMEOUT
	@Override
	public void onTestFailedWithTimeout(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}
	
	//IT WILL EXECUTE ON TEST START
	@Override
	public void onStart(ITestContext context) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}
	
	//IT WILL EXECUTE ON TEST FINISH
	@Override
	public void onFinish(ITestContext context)
	{
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
}
