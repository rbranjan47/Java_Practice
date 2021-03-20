package Qspider_1;

import java.util.Scanner;

public class Return 
{
	public static void main (String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a=sc.nextInt();
		
		if(a>0)
			System.out.print("Positive number");
		else
			System.out.println("Error");
		
		sc.close();
	}
}
