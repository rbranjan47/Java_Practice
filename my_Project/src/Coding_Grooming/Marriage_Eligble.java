package Coding_Grooming;

import java.util.Scanner;

public class Marriage_Eligble 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		
		if (age>=21)
		{
			System.out.println("you are eligible for marriage");
		}
		else if (age<18)
		{
			System.out.println("You are not eligible for marriage");
		}
		sc.close();

	}

}
