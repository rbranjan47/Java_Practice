package Task;

import java.util.Scanner;

public class Biggest_Array {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of ");
		
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("enter the elements ");
		for (int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int big=arr[0];
		for (int i=0;i<size;i++)
		{
			if (big<arr[i])
				big=arr[i];
		}
		System.out.println("biggest element is: "+big);
		sc.close();
	}

}
