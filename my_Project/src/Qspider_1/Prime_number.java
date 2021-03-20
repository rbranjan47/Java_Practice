//write a java to check prime or not

package Qspider_1;

import java.util.Scanner;

public class Prime_number 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an number to check prime or not ");
		
		int n=sc.nextInt();
		int count=1;
		
		for (int i=1;i<=n/2;i++)
		{
			if (n%i==0)
				count++;
		}
			if (count==2)
				System.out.println("prime number");
			else 
				System.out.println("not a prime number");
		
		sc.close();
	}

}
