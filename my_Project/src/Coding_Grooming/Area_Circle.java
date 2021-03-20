package Coding_Grooming;

import java.util.Scanner;

public class Area_Circle 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius of circle ");
		double r=sc.nextDouble();
		
		double area=3.14*r*r;
		System.out.println("area of circle is "+area);
		
		sc.close();
	}

}
