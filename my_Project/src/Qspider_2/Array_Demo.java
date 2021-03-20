package Qspider_2;

import java.util.Scanner;

public class Array_Demo 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array ");
		
		int size=sc.nextInt();
		
		int array[]=new int[size];
		System.out.println("enter the elements of array ");
		for (int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		
		for (int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
		

		sc.close();
	}

}
