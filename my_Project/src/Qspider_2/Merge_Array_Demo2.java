package Qspider_2;

import java.util.Scanner;

public class Merge_Array_Demo2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of first array ");
		int s1=sc.nextInt();
		
		System.out.println("enter the elements of array ");
		int arr1[]=new int[s1];
		for (int i=0;i<s1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("enter the size of second array ");
		int s2=sc.nextInt();
		
		System.out.println("enter the elements of array ");
		int arr2[]=new int[s2];
		for (int i=0;i<s2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		System.out.println("after merging two array ");
		int arr3[]=new int[arr1.length+arr2.length];
		for (int i=0;i<arr1.length;i++)
		{
			arr3[i]=arr1[i];
		}
		for (int i=0;i<arr2.length;i++)
		{
			arr3[i+arr1.length]=arr2[i];
		}
		for (int i=0;i<arr3.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
		sc.close();
	}

}
