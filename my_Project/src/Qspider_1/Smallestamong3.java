package Qspider_1;

import java.util.Scanner;

public class Smallestamong3 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three integers: ");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if (a<c && a<b)
			System.out.println("smallest integer is: "+a);
		
		else if (b<c)
			System.out.println("smallest integer is: "+b);
		
		else
			System.out.println("smallest integer is: "+c);
		
		sc.close();
	}

}
