package Qspider_2;

import java.util.Scanner;

public class Even_odd_array 
{

	public static void main(String[] args) 
	
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the size of array");
	int size=sc.nextInt();
	
	System.out.println("enter the elements");
	int arr[]=new int[size];
	for (int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("even numbers are: ");
	for (int i=0;i<size;i++)
	{
		if (arr[i]%2==0)
		{
			System.out.print(arr[i]+" ");
		}
	}
	System.out.println();
	System.out.println("odd numbers are: ");
	for (int i=0;i<size;i++)
		{
			if (arr[i]%2!=0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	sc.close();
	}
}
