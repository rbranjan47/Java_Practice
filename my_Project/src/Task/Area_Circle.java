package Task;

import java.util.Scanner;

public class Area_Circle 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value of radius ");
		int radius=sc.nextInt();
		double area=3.14*radius*radius;
		
		System.out.println("Area is "+area);
		sc.close();

	}

}
