package Qspider_2;

import java.util.Scanner;

public class Dec_octal 
{
	public static String decTOoctal(int dec)
	{
		String oct="";
		do
		{
			int rem=dec%8;
			oct=rem+oct;
			
			dec=dec/8;
		}
		while (dec!=0);
			
			return oct;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		
		int num=sc.nextInt();
		
		String b=decTOoctal(num);
		
		System.out.println("octal number is:"+b);
		
		sc.close();
	}

}
