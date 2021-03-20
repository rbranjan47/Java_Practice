package Qspider_2;

import java.util.Scanner;

public class Name_RowWise 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter string ");
	
	String st=sc.next();
	//reading each character
	int n=st.length();
	for (int i=1;i<=n;i++)
	{
		for (int j=1;j<=n-i;j++)
		{
			System.out.print(" ");
		}
		for (int j=0;j<i;j++) //taking index
		{
			System.out.print(st.charAt(j)+" ");
		}
		System.out.println();
	}
	
	sc.close();
	}

}
