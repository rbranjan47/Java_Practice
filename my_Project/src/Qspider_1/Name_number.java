package Qspider_1;

import java.util.Scanner;

public class Name_number 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number to get name: ");
		
		int n=sc.nextInt();
		if (n%3==0 && n%5==0)
		{
			System.out.println("Sanju weds geeta");
		}
		else if (n%5==0)
		{
			System.out.println("Geeta");
		}
		else if (n%3==0)
		{
			System.out.println("Sanju");
		}
		else 
			System.out.println("Break up");
		
		sc.close();
	}

}
