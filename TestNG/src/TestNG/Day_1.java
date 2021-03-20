package TestNG;

import org.testng.annotations.Test;

public class Day_1 
{

	@Test
	public void loan() 
	{
		System.out.println("this is normal loan");
	}
	
	@Test
	public void mobile_loan()
	{
		System.out.println("loan will approve by mobile ");
	}
	
	@Test
	public void website_loan()
	{
		System.out.println("loan will web-application");
	}
}
