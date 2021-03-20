package Qspider_2;

import java.util.Scanner;

public class Pattern_Pyramid 
{
	// declare all logics in methods
	public static void Triangle_Pyramid(int n) 
	{
		for (int i = 0; i < n; i++)
		{
			for (int j=n-i; j>1; j--) 
			{
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) 
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of n ");
		int num = sc.nextInt();
		Triangle_Pyramid(num);

		sc.close();
	}
}
