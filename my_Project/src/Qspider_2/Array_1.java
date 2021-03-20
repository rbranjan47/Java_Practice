package Qspider_2;

import java.util.Scanner;

public class Array_1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		int array[]=new int[size];
		System.out.println("enter the elements: ");
		for (int i=0;i<size;i++)
		{
			array [i]=sc.nextInt();
		}
		
		System.out.println("in array form: ");
		for (int i=0;i<size;i++)
		{
			System.out.print(array[i]+" ");
		}
		
		sc.close();
	}

}
