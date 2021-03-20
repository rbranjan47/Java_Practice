package Qspider_1;

import java.util.Scanner;

public class Switch_case 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the day number: ");
		
		int dn=sc.nextInt();
		
		switch(dn) 
		{
		case 1: System.out.println("sunday");
		break;
		case 2: System.out.println("monday");
		break;
		case 3: System.out.println("tuesday");
		break;
		case 4: System.out.println("wednesday");
		break;
		case 5: System.out.println("thrusday");
		break;
		case 6: System.out.println("friday");
		break;
		case 7: System.out.println("saturday");
		break;
		
		default: System.out.println("invalid day number");
		break;
		}

		sc.close();
	}

}
