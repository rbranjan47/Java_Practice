package Task;

import java.util.Scanner;

public class User_Array_Reverse1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 arrray's element: ");
		
		int array[]=new int[10];
		for(int i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
		}
		int brray[]=new int[10];
		int j=0;
		for (int i=9;i>=0;i--)
		{
			brray[i]=array[j];
			j++;
		}
		for (int i=0;i<10;i++)
		{
			System.out.println("the value of b["+i+"]"+ brray[i]);
		}
		
		
		sc.close();
	}

}
