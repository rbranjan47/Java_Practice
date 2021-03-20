package Task;

import java.util.Scanner;

public class User_Array_Reverse {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 arrray's element: ");
		
		int array[]=new int[10];
		for(int i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
		}
		
		System.out.println("given array in reverse order: ");
		for (int i=10-1;i>=0;i--)
		{
			System.out.print(array[i]+" ");
		}
		
		sc.close();
	}

}
