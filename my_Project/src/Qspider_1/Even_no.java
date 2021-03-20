package Qspider_1;

import java.util.Scanner;

public class Even_no 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		
		int n=sc.nextInt();
		System.out.println("even numbers are: ");
		for (int i=1;i<n;i++)
		{
			if (i%2==0)
				System.out.println(i);
		}
		
		sc.close();
	}

}
