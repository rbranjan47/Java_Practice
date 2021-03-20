package Qspider_2;

import java.util.Scanner;

public class Logic1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i-1;j++)
				
				System.out.println(j+" ");
		}
		System.out.println();

		sc.close();
	}
}
