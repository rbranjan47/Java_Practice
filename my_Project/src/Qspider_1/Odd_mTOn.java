package Qspider_1;

import java.util.Scanner;

public class Odd_mTOn 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an range: ");
		
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.println("odd number's: ");

			if (m%2==0)
				m++;
			for (int i=m;i<=n; i=i+2)
			{
				System.out.println(i);
			}
		
		/* if (i%2!=0)
		{
			System.out.println(i);
		}*/
		
		sc.close();
	}

}
