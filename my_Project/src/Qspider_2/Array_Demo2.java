package Qspider_2;

import java.util.Scanner;

public class Array_Demo2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array ");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter the array elements ");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enterd array elements are: ");
		for (int i=0;i<size;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}

}
