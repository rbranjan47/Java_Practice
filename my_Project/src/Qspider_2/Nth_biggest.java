package Qspider_2;

import java.util.Scanner;

public class Nth_biggest 
{
	static int nthBiggest(int ar[],int n)
	{
		for(int i=0;i<ar.length;i++)
		{
		   int count=0;
		  for(int j=0;j<ar.length;j++)
		  	{
			  if(ar[j]>ar[i])
				count++;
			}
		   if(count==n-1)
			return ar[i];	
		}
	return 0;	
	}
	public static void main(String arg[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size of an array: ");
	
	int size=sc.nextInt();
	System.out.println("enter the elements: ");
	int x[]=new int[size];
	for (int i=0;i<size;i++)
	
		x[i]=sc.nextInt();
		int bg=nthBiggest(x,4);
		System.out.println("4th Biggest is: "+bg);
		 
	sc.close();
	}
}
