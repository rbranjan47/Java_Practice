package Qspider_1;

import java.util.Scanner;

public class dateValid 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter valid date in format dd:mm:yyyy");
		
		int dd=sc.nextInt();
		int mm=sc.nextInt();
		int yy=sc.nextInt();
		
		if (dd<1|| dd>31 || mm<1 || mm>12 ||yy<1)
		{
			System.out.println("Invalid date");
		}
		else if (mm==2)
		{
			if (yy%400==0 || yy%4==0 && yy%100!=0)
			{
				if(dd>29)
					System.out.println("Invalid date");
			}
			else if (dd>28)
				System.out.println("invalid date");
		}
		else if ((mm==4 ||mm==6 || mm==9 || mm==12) && dd>30)
			System.out.println("Invalid Date");
		
		else
			System.out.println("Valid Date");
		
		sc.close();
	}

}
