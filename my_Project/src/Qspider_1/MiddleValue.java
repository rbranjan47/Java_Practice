package Qspider_1;

import java.util.Scanner;

public class MiddleValue 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 3 integer: ");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if (a>b && a<c || a>c && a<b)
			System.out.println("middle value is: "+a);
		
		else if (b>a && b<c || b>c && b<a)
			System.out.println("middle value is: "+b);
		
		else 
			System.out.println("middle value is: "+c);
		
		sc.close();
	}

}
