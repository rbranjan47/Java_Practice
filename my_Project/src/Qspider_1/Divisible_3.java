package Qspider_1;

import java.util.Scanner;

public class Divisible_3
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		
		int n=sc.nextInt();
		int count=0;
		for (int i=1;i<=n;i++)
		{
			if (i%3==0)
				count++;
		}
		System.out.println("count of number divisible by 3 are: "+count);
		sc.close();
	}

}
