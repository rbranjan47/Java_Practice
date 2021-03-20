package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_Demo1 
{

	@DataProvider
	public Object[][] run_DOB()
	{
		//to store data,for passing it as Parameters we have to store it in 2-D Array 
		Object[][] data=new Object[5][3];
		
		//1st Set Data
		data[0][0]="Rabi Ranjan";
		data[0][1]="Mechanical";
		data[0][2]="101";
		
		//2nd Set Data
		data[1][0]="Ashish";
		data[1][1]="Etc";
		data[1][2]="102";
		
		//3rd Set Data
		data[2][0]="Monika";
		data[2][1]="EE";
		data[2][2]="103";
		
		
		//4th Set Data
		data[3][0]="Lopamudra";
		data[3][1]="Cse";
		data[3][2]="104";
		
		//extra set data
		data[4][0]="Trident";
		data[4][1]="all_rounder";
		data[4][2]="105";
		
		//returning data (change it into Object Type)
		return data;
	}
	
	@Test(dataProvider="run_DOB")
	public void test(String name, String branch, String RollNo)
	{
		System.out.println(name);
		System.out.println(branch);
		System.out.println(RollNo);
	}
}
