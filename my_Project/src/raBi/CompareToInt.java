package raBi;

public class CompareToInt 
{
	public static void main(String[] args) 
	{
		int i1=25;
		int i2=15;
		
		//---------->  we can't directly pass primitive into methods  <--------
		Integer  I1=i1;
		Integer I2=i2;
		System.out.println(I1.compareTo(I2));
		
		//-----------> we  can't directly pass primitive into methods   <--------
		
		double d1=32.5;
		double d2=22.5;
		
		//-----------> we  can't directly pass primitive into methods   <--------
		Double D1=d1;
		Double D2=d2;
		
		System.out.println(D1.compareTo(D2));
	}
}
