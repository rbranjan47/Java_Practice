package Qspider_1;

import java.util.Scanner;

public class Bits_method 
{

	public static int countSettedBits(int n)
	{
		 int count=0;
		 while(n!=0)
		 {
			 int rem=n%2;
			 if (rem==1)
				 count++;
			 n=n/2;
		 }
		 
		 return count;
	}
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a number ");
	
	int num=sc.nextInt();
	
	int c=countSettedBits(num);
	
	System.out.println(c+" bits are setted");
	
	sc.close();
	}

}
