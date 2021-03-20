package Coding_Grooming;

import java.util.Scanner;

public class Even_Odd 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your ");
		int num=sc.nextInt();
		if (num%2==0)
		{
			System.out.println("Even Number");
		}
		else if (num%2!=0)
		{
			System.out.println("odd number");
		}
		
		
		sc.close();
	}

}
