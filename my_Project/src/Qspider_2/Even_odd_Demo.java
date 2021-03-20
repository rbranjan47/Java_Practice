package Qspider_2;

import java.util.Scanner;

public class Even_odd_Demo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array ");
		
		int size=sc.nextInt();
		System.out.println("enter the elements of array ");
		int arr[]=new int[size];
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]%2==0)
			{
				System.out.println("even elements "+arr[i]);
			}
				
			else if(arr[i]%2!=0)
			{
				System.out.println("odd elements "+arr[i]);
			}
		}
		
		sc.close();
	}

}
