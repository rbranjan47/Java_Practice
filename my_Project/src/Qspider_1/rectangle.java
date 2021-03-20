package Qspider_1;

import java.util.Scanner;

public class rectangle {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Area and Perimeter  of Rectangle");
		
		
		System.out.println("enter the length");
		int a=sc.nextInt();
		
		System.out.println("enter the bredth");
		int b=sc.nextInt();
		
		double pr=2*(a+b);
		double ar=a*b;
		System.out.println("Perimeter is: "+pr);
		System.out.println("area is: "+ ar);
		sc.close();

	}

}
