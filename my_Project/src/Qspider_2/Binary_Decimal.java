package Qspider_2;

import java.util.Scanner;

public class Binary_Decimal 
{
	public static int binTOdec(int bin)
	{
		int sum=0;
		do
		{
			int rem=bin%10;
			/*int power=1;  
			 
			   sum=sum+rem*power;  this is also a method
			power=power*2;    */
			
			sum=sum*2+rem; 
			bin=bin/10;
		}
		while (bin!=0);
			return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		
		int num=sc.nextInt();
		
		int number=binTOdec(num);
		System.out.println("decimal number is: "+number);
		sc.close();
	}

}
