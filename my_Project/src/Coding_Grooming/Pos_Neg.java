package Coding_Grooming;

import java.util.Scanner;

public class Pos_Neg 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any integer number");
		int num=sc.nextInt();
		
		if (num>0)
		{
			System.out.println("It is an positive number");
		}
		else if (num<0)
		{
			System.out.println("It is an Negative number");
		}
		sc.close();

	}

}
