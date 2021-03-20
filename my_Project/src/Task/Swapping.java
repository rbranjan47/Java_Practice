package Task;

import java.util.Arrays;
import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array ");
		int size=sc.nextInt();
		
		System.out.println("enter arrray's element: ");
		int array[]=new int[size];
		
		for(int i=0;i<size;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("given array is  "+Arrays.toString(array));
		//storing last value in an integer
		int x=array[size-1];
		
		for (int i=(size-1);i>0;i--)
		{
			array[i]=array[i-1];
		}
		array[0]=x;
		
		System.out.println("roatetd array is  "+Arrays.toString(array));
		
		sc.close();
	}

}
