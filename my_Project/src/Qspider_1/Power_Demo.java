//WAJP to get power of any number

package Qspider_1;

import java.util.Scanner;

public class Power_Demo
{

	public static int topower(int pow, int base)
	{
		int multi=1;
		while (pow>0)
		{
			multi=multi*base;
			pow--;
		}
		return multi;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the base and and power ");
		
		int base=sc.nextInt();
		int pow=sc.nextInt();
		
		int result=topower(pow, base);
		System.out.println("value is "+result);

		sc.close();
	}

}
