package Coding_Grooming;

import java.util.Scanner;

public class Area_Triangle 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the height of traingle");
		int height=sc.nextInt();
		System.out.println("enter the base of traingle");
		int base=sc.nextInt();
		
		double area=(height*base)/2;
		System.out.println("Area of triangle is "+area);
		sc.close();

	}

}
