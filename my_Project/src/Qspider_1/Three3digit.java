package Qspider_1;

import java.util.Scanner;

public class Three3digit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int n=sc.nextInt();
		
		if (n>99 && n<1000 || n<-99 && n>-1000)
			System.out.println("3-digit number");
		
		else 
			System.out.println("not a 3-digit number");
		
		sc.close();

	}

}
