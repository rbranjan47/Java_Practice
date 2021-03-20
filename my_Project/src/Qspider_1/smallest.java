package Qspider_1;

import java.util.Scanner;

public class smallest 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first number:");
		int a=sc.nextInt();
		
		System.out.println("Enter the second number:");
		int b=sc.nextInt();
		
		System.out.println("Entered number is:"+a+" "+b);
		if (a<b)
		{
			System.out.println("Smaller number is:"+a);
		}
		else if (b<a)
			{
			System.out.println("Smaller number is:"+b);	
			}
		sc.close();
		}
	}
