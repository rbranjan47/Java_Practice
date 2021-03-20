package Qspider_1;

import java.util.Scanner;

public class GCD_Number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any natural number");
		
		int gcd=0;
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for (int i=1;i<a &&i<b ;i++)
		{
			if ((a%i==0) && (b%i==0))
				 gcd=i;
		}
		System.out.println(gcd);
		
		sc.close();
	}

}
