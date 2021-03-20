package Qspider_1;

import java.util.Scanner;

public class date_valid {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any day in format d:m:yyyy ");
		int day=sc.nextInt();
		int month=sc.nextInt();
		int year=sc.nextInt();
		
		System.out.println("Enterd date,month and year is: "+day+" "+month+" "+year);
		if (month<=12)
		{
			System.out.println("Month is: "+month);
		}
		else if (year%4==0)
		{
			System.out.println("Year is: "+year);
		}
		else if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
		{
			if (day<=31)
			{
				System.out.println("Day is: "+day);
			}
			else 
			{
				System.out.println("Invalid day");
			}
		}
		else if (month==4 || month==6 || month==9 || month==11)
		{
			if (day<=30)
			{
				System.out.println("Day is: "+day);
			}
			else 
			{
				System.out.println("Invalid day");
			}
		}
		else if (month==2)
		{
			if (year%4==0)
			{
				if (day<=29)
				{
					System.out.println("Day is: "+day);
				}
				else 
				{
					System.out.println("invalid day");
				}
			}
			else if (year%4 !=0)
			{
				if (day<=28)
				{
					System.out.println("Day is: "+day);
				}
				else 
				{
					System.out.println("Invalid day");
				}
			}
		}
		sc.close();
	}

}
