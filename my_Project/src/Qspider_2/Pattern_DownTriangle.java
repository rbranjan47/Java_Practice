package Qspider_2;

import java.util.Scanner;

public class Pattern_DownTriangle 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number ");
		int num=sc.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			for(int j=(num-i);j>0;j--)
			{
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		 
		sc.close();

	}

}
