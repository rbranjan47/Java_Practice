//Accept special character digit
//ab=(a+b)+(a*b)

package Qspider_1;

import java.util.Scanner;

public class accept 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value to check special digit or not");
		
		int n=s.nextInt();
		int d=n/10;
		int r=n%10;
		
		double sum=(d+r)+(d*r);
		
		if (sum==n)
		{
			System.out.println("Special digit number");
			
		}
		else 
			System.out.println("Not a Special digit number");
	s.close();
	}

}
