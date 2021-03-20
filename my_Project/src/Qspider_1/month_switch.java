package Qspider_1;

import java.util.Scanner;

public class month_switch
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month number to know number of days: ");
		
		int mn=sc.nextInt();
		switch(mn)
		{
		
		case 2:	System.out.println("28 0r 29 days");
		break;
		
		case 4:
		case 6:
		case 9: 
		case 11:
			System.out.println("30 days");
			break;
		
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
			default: System.out.println("invalid month number");
			break;

	}
		sc.close();
	}
}
