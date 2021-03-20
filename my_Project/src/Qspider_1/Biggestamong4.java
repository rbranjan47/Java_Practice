package Qspider_1;

import java.util.Scanner;

public class Biggestamong4
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter four different integer");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		System.out.println("entered number is: "+a+" "+b+" "+c+" "+d);
		
		if (a>b && a>c && a>d)
			System.out.println("bigger number is: "+a);
		else if (b>c && b>d)
			System.out.println("bigger number is: "+b);
		else if (c>d)
			System.out.println("bigger number is: "+c);
		else 
			System.out.println("bigger number is: "+d);
		
    sc.close();
	}

}
