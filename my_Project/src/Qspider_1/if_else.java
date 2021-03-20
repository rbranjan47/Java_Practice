package Qspider_1;

import java.util.Scanner;
public class if_else
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the first number:");
	int a=sc.nextInt();
	
	System.out.println("Enter the second number:");
	int b=sc.nextInt();
	
	System.out.println("Entered number is:"+a+" "+b);
	if (a>b)
	{
		System.out.println("Greater number is:"+a);
	}
	System.out.println("Greater number is:"+b);	
	sc.close();
	}

}
