package Qspider_1;

import java.util.Scanner;

public class Factorial_Demo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any natural number");
		
		int n=sc.nextInt();
		double fact = 1;
		
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
		}

		System.out.println(fact);
		
		sc.close();
		
	}

}
