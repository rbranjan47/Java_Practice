package Qspider_1;

import java.util.Scanner;

public class Percentage 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Percentage: ");
		
		double per=s.nextDouble();
		
		if (per>=60.0)
		System.out.println("First Grade");
		
		else if (per>=40.0 && per<60.0)
			System.out.println("Second Grade");
		
		else if (per>=33.0 && per<40.0)
			System.out.println("Just Pass");
		
		else 
			System.out.println("Fail");
		
		
		s.close();
	}

}
