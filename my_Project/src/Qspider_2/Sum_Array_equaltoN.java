package Qspider_2;

import java.util.Scanner;

public class Sum_Array_equaltoN
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array: ");
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements of array: ");
		
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the value of n: ");
		int n=sc.nextInt();
		System.out.println("pair of elements whose sum is equal to "+n+" are: ");
		
		for (int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			{
				if(arr[i]+arr[j]==n)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
		
		sc.close();
	}

}
