package Qspider_1;

import java.util.Scanner;

public class Name_ntimes 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name and integer");
		
		String nm=sc.next();
		int n=sc.nextInt();
		
		for (int i=1;i<=n;i++)
		{
			System.out.println(nm);
		}
		
     sc.close();
	}

}
