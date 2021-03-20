//sometimes, only particular test cases we have to run all testcases EXCLUDING one or two cases
package TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day_3 
{
	@Test
	public void gold() 
	{
		System.out.println("this is normal loan");
	}
	
	@BeforeTest
	public void mobile_gold()  //Excluding this testNG method, by Using "Exclude" method
	{
		System.out.println("loan will approve by mobile ");
	}
	
	@Test
	public void website_gold()
	{
		System.out.println("loan will web-application");
	}
	@BeforeSuite
	public void cash_gold()
	{
		System.out.println("this is gold loan in cash mode/before Suite");
	}
	@AfterSuite
	public void upi_gold()
	{
		System.out.println("this is gold loan in upi mode/after Suite");
	}
}
