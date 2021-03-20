package Qspider_2;

import java.util.Scanner;

public class float_array 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many products you have ");
		
		int n=sc.nextInt();
		
		double price[]=new double[n];
		
		System.out.println("enter the "+n+" product price");
		for (int i=0;i<price.length;i++)
		{
			price[i]=sc.nextDouble();
		}
		
		double sum=0;
		for (int i=0;i<price.length;i++)
		{
			sum=sum+price[i];
		}
		System.out.println("sum of all product price is: "+sum);
		sc.close();
	}

}
