package Qspider_1;

import java.util.Scanner;

public class Sum_EO_while 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		
		int n=sc.nextInt();
		int even_sum=0;
		int odd_sum=0;
		
	for (int i=1;i<=n;i++)
	{
		if (i%2==0)
		{
			even_sum=even_sum+i;
		}
		else if (i%2!=0)
		{
			odd_sum=odd_sum+i;
		}
	}
	System.out.println("sum of even is "+even_sum);
	System.out.println("sum of odd is "+odd_sum);
		sc.close();

	}

}
