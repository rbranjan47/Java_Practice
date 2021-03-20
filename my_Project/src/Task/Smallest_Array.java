package Task;

import java.util.Scanner;

public class Smallest_Array 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
	
		int[] array=new int[size];
		System.out.println("enter the elements: ");
		for (int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		
		int small=array[0];
		
		for (int i=0;i<size;i++)
		{
			if (small>array[i])
				small=array[i];
		}
		
		System.out.println("smallest number is: "+small);
       sc.close();
	}
}
