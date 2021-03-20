package Qspider_2;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted_merge2 

{static int[] Array_a()
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of first array: ");
	int size=sc.nextInt();
	
	int a[]=new int[size];
	System.out.println("enter the elements of first array: ");
	for(int i=0;i<a.length;i++)
	{
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	return a;
}

static int[] Array_b()
{
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of first array: ");
	int size=sc.nextInt();
	
	int b[]=new int[size];
	System.out.println("enter the elements of first array: ");
	for(int i=0;i<b.length;i++)
	{
		b[i]=sc.nextInt();
	}
	Arrays.sort(b);
	return b;
}
//merging the sorted array's
static int[] mergeSortedArray(int a[], int b[]) 
{
	int c[]=new int[a.length+b.length];
	
	int i=0, j=0, k=0;
	while(i<a.length && j<b.length)
	{
		if (a[i]<b[j])
			c[k++]=a[i++];
		else
			c[k++]=b[j++];
	}
	
	while (i<a.length)
	{
		c[k++]=a[j++];
	}
	while(j<b.length)
	{
		c[k++]=b[j++];
	}
	return c;
}
//displaying the array
static void display_Array(int ar[])
{
for(int i=0;i<ar.length;i++)
{
System.out.print(ar[i]+" ");
}
System.out.println();
   }
//main method
public static void main(String[] args) 
{
	System.out.println("reading the first array: ");
	int arr[]=Array_a();
	
	System.out.println("Reading second array: ");
	int brr[]=Array_b();
	
	int crr[]=mergeSortedArray(arr, brr);
	
	System.out.println("merged array be: ");
	display_Array(crr);
}

	}
