package Qspider_1;

import java.util.Scanner;

public class Square 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the side of square");
		int s=sc.nextInt();
		
		double ar=s*s;
		System.out.println("Area is: "+ar);
		
		sc.close();

	}

}
