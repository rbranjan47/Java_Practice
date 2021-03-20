package Qspider_2;

import java.util.Scanner;

public class Decimal_Binary 
{
public static String decTObin(int n)
{
	String dec="";
	do
	{
		int rem=n%2;
		dec=rem+dec;
		
		n=n/2;
	}
	while (n!=0);
	return dec;
}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		
		int num=sc.nextInt();
		
		String b=decTObin(num);
		System.out.println("binary umber is :"+b);
		
		sc.close();
	}

}
