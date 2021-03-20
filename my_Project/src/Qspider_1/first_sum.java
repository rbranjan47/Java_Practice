package Qspider_1;

import java.util.Scanner;

public class first_sum 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any natural number to get its sum");
		
		int n=sc.nextInt();
		int i=0;
		double sum=0;
		for (i=1;i<=n;i++)
		{
			sum=sum+i;
			System.out.println(sum+" ");
		}

		sc.close();
	}

}
