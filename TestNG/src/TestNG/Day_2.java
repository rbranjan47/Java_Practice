//Now, client want to run this test case along 

package TestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day_2 
{
	@Test
	public void home()
	{
		System.out.println("this is the normal home loan");
	}
	
	@Test
	public void mobile_loan()
	{
		System.out.println("this is mobile based home loan");
	}
	
	@AfterTest
	public void web_loan()
	{
		System.out.println("this is web-application home loan");
	}
	
}
