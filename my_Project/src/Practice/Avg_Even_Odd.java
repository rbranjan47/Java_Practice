package Practice;

import java.util.Scanner;

public class Avg_Even_Odd 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array ");
		int size=sc.nextInt();
		System.out.println("enter the elements of array ");
		int evencount=0, evensum=0,oddcount=0,oddsum=0;
	int arr[]=new int [size];
	for(int i=0;i<size;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	for (int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			evencount++;
			evensum=evensum+arr[i];
		}
		else if (arr[i]%2!=0)
		{
			oddcount++;
			oddsum=oddsum+arr[i];
		}
	}
		System.out.println("even average is "+evensum/evencount);
		System.out.println("odd average is "+oddsum/oddcount);
		sc.close();
	}

}
