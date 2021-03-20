package Qspider_2;

import java.util.Scanner;

public class Dec_Hexadec 
{
	public static String decTOhexa(int dec)
	{
		String hexa="";
		do
		{
			int rem=dec%16;
			if (rem<10)
			hexa=rem+hexa;
			else 
				switch(rem)
				{
				case 10:
					hexa='A'+hexa;
					break;
				case 11:
					hexa='B'+hexa;
					break;
				case 12:
					hexa='C'+hexa;
					break;
				case 13:
					hexa='D'+hexa;
					break;
				case 14:
					hexa='E'+hexa;
					break;
				case 15:
					hexa='F'+hexa;
					break;
				}
			dec=dec/16;
		}
		while(dec!=0);
		
		return hexa;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		
		int num=sc.nextInt();
		
		String b=decTOhexa(num);
		System.out.println("hexadecimal number is: "+b);

		sc.close();
	}

}
