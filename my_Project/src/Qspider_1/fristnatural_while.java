package Qspider_1;

import java.util.Scanner;

public class fristnatural_while 
{

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any natural number");
		
		int n=sc.nextInt();
		
		int i=1;
		
		/*  while (i<n)
		{
			System.out.println(i+" ");    while-- first check condition and then execute
			i++;
		}   */
		
		
		/*   do
		{
			System.out.println(i+" ");   do while---one time executed then check
		}
		while(i<=n);  */
		
		for (i=0;i<=n;i++)
		{
			System.out.println(i+" ");
		}
		
		sc.close();
	}

}
