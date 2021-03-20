package Qspider_2;

import java.util.Scanner;

public class array 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		System.out.println("enter the value ");
		
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("resultant array is: ");
		
		for (int i=0;i<arr.length;i++)
		{
		System.out.print(arr[i]+" ");	
		}
		
		sc.close();
	}

}
