package Practice;

import java.util.Scanner;

public class Array_Java 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array ");

		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter array elements ");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("array is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(i);
		}
		sc.close();
	}

}
