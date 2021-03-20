package Qspider_2;

import java.util.Scanner;

public class mergeZigZag_Array 
{
	static int[] ZigZag(int a[],int b[])
	{
		int c[]=new int [a.length+b.length];
		
		int i=0, k=0;  //for a(i) and c(k) array 
		
		while(i<a.length && i<b.length)
		{
			c[k]=a[i];
			k++;
			
			c[k]=b[i];
			k++;
			i++;
		}
		return c;
	}
	
	static int[] readArray_a() 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size=sc.nextInt();
		System.out.println("enter the elements: ");
		int a[]=new int[size];
		for (int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}
	static int[] readArray_b() 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array: ");
		int size=sc.nextInt();
		System.out.println("enter the elements: ");
		int b[]=new int[size];
		for (int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		return b;
	}
	
	static void display_Array(int ar[])
	{
	for(int i=0;i<ar.length;i++)
	{
	System.out.print(ar[i]+" ");
	}
	System.out.println();
       }

	public static void main(String[] args) 
	{
		System.out.println("read the first array element: ");
		int a[]=readArray_a();
		
		System.out.println("read the second array element: ");
		int b[]=readArray_b();
		
		int c[]=ZigZag(a, b);
		System.out.println("after merging the element in zig-zag order: ");
		display_Array(c);
	}
}



/*ASSIGNMENT
 * 1)merge two sorted array in sorted format
	2)define a method to return nth biggest
	3)define a method to return nth smallest
	4)define method to return nth index element
	5)define a method to print pair of elements whose sum is equal to n?
*/
