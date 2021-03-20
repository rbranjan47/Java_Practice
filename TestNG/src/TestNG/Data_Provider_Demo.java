package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Demo
{
	@DataProvider
	public Object[][] data_driven()
	{
		
		//1st Combination, Username & Password with Good Credit History
		//2nd Combination, Username &Password with Bad Credit History
		//3rd Combination, Username & Password with Fraud Account
		 
		Object[][] data=new Object[3][2];
		//here 3, refers to the number of Combinations and 2, refers to the Parameters.
		//Row is for the number of the combinations.
		//Column, is for the Value of the combinations.
		
		//1st Combination
		data[0][0]="firstname";
		data[0][1]="firstpassword";
		
		//2nd Combination
		data[1][0]="secondname";
		data[1][1]="secondpassword";
		
		//3rd Combination
		data[2][0]="thirdname";
		data[2][1]="thirdpassword";
		
		
		//Sending back Data
		return data;
		
	}
	
	@Test(dataProvider="data_driven")
	public void run_dataProvider(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
}
