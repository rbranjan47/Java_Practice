package Qspider_1;

import java.util.Scanner;

public class Count_digit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		
		int n=sc.nextInt();
		int count=0;
		
		while(n!=0)
		{
			n=n/10;
		count++;
		}
		System.out.println(count);
		sc.close();
	}

}
