package Qspider_1;

import java.util.Scanner;
public class value 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 2 different value");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("entered number is:" +a+" and "+b);
		
		System.out.println("Sum is:"+(a+b));
		System.out.println("subtract is "+(a-b));
		System.out.println("multiplication is "+(a*b));
		System.out.println("division is"+(a/b));
		
	    sc.close();
		
	}

}
