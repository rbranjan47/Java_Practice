package Qspider_2;

import java.util.Scanner;

public class Name_Logic_Demo 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string ");

		String str=sc.nextLine();
		int size=str.length();
		for(int i=1;i<size;i++)
		{
			for (int j=1;j<=size-i;j++)
			{
				System.out.print(" ");
			}
			for (int j=0;j<i;j++) //taking index
			{
				System.out.print(str.charAt(j)+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
