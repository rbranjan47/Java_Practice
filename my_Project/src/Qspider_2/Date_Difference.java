package Qspider_2;

import java.util.Scanner;

class Date_Difference 
{
     //storing date , year and month
	int dd;
	int mm;
	int yy;
	
	//storing month
	int month[]= {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public Date_Difference(int dd, int mm, int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
		if (yy%400==0 || yy%4==0 && yy%100!=0)
			month[2]=29;
	}
	
	public int noOFdays()
	{
		int days=0;
		days=dd;
		
		for(int i=0;i<mm;i++)
		{
			days=days+month[i];
		}
		int y=yy-1;
		days=days+y*365;
		
		days=days+(y/400+y/4-y/100);
		
		return days;
	}
	
	public String toString()
	{
		return "("+dd+"/"+mm+"/"+"yy"+")";
	}
	public static Date_Difference readDate()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date:(dd mm yyyy");
		
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		
		return new Date_Difference(d, m, y);

	}

}
