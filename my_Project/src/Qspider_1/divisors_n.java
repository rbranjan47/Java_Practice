package Qspider_1;

import java.util.Scanner;

public class divisors_n 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		
		int n=sc.nextInt();
		System.out.println("divisor of "+n+ " are:");
		for (int i=1;i<=n;i++)
			if (n%i==0)
			{
				System.out.println(i);
			}
		sc.close();
	}

}
