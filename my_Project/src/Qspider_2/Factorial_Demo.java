package Qspider_2;

import java.util.Scanner;

public class Factorial_Demo 
{

	public static double mul(int n)
	{
		double fact=1;
		while(n>=1 && n<=18)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number ");
		int num=sc.nextInt();
		
		double result=mul(num);
		System.out.println(result);
		sc.close();
	}

}
