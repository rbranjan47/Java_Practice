//write a java program to count how many divisor are there for user entered number?

package Qspider_1;

import java.util.Scanner;

public class No_divisior 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		
		int n=sc.nextInt();
		int count=0;
		//int count=1; //here, we are finding upto n/2 so it is not counting 'n' i.e. n/n=1

		for (int i=1;i<=n;i++)
		//for (int i=1li<n/2;i++)	
			
		{
			if (n%i==0) 
				count++;  //if modulus given o, then it will count
		}
		
		System.out.println("number of divisors= "+count);
		sc.close();
	}

}
