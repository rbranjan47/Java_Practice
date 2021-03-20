package Qspider_1;

import java.util.Scanner;

public class Month_name 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month number");
		
		int m=sc.nextInt();
		if (m>=1 && m<=12)
		{
			if(m==1)
				System.out.println("January");
			else if (m==2)
				System.out.println("february");
			else if (m==3)
				System.out.println("march");
			else if (m==4)
				System.out.println("april");
			else if (m==5)
				System.out.println("may");
			else if (m==6)
				System.out.println("june");
			else if (m==7)
				System.out.println("july");
			else if (m==8)
				System.out.println("august");
			else if (m==9)
				System.out.println("september");
			else if (m==10)
				System.out.println("october");
			else if (m==11)
				System.out.println("november");
			else if (m==12)
				System.out.println("december");
		}
		else 
		System.out.println("invalid month number");

		sc.close();
	}

}
