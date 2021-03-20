package Qspider_1;

import java.util.Scanner;

public class Sum_divisior 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an number: ");
		
		int n=sc.nextInt();
		int sum_count=0;
		for (int i=1;i<=n/2;i++)
		{
			if (n%i==0)
				sum_count=sum_count+i;
		}
		
		if (sum_count==n)
		{
			System.out.println("perfect number i.e. "+sum_count+"="+n);
		}
		else 
		{
			System.out.println("not a perfect number");
		}
		sc.close();
	}

}
