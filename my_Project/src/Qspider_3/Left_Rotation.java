//https://mymapit.in/#/login
package Qspider_3;

import java.util.Scanner;

public class Left_Rotation 
{

	public static int[] leftrotation(int arr[],int size)
	{
		int brr[]=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if (i<size)
				brr[arr.length-size+i]=arr[i];
			else 
				brr[i-size]=arr[i];
		}
		return brr;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size=sc.nextInt();
		System.out.println("enter the elements of array ");
		int arr[]=new int [size];
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int result[]=leftrotation(arr, size);
		System.out.println(result);
		sc.close();
	}

}
