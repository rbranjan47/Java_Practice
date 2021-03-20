package Qspider_1;

import java.util.Scanner;

public class circle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of radius of circle");
		double r=sc.nextDouble();
		
		double pr=2*22/7*r;
		System.out.println("Perimeter is: "+pr);		
		
		double ar=22/7*r*r;
		System.out.println("Area of cirlce is: "+ar);
		
		sc.close();
		

	}

}
