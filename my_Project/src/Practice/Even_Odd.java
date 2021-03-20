package Practice;

import java.util.Scanner;

public class Even_Odd
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		
		int arr[]=new int[size];
		System.out.println("enter the elements of array "); 
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("even array is ");
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2==0)
			{
				System.out.print(arr[i]);
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.print("odd array is ");
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2!=0)
			{
				System.out.print(arr[i]);
				System.out.println(" ");
			}
		}
		sc.close();
	}

}
