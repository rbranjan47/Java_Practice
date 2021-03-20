package Qspider_1;

import java.util.Scanner;

public class Name_Times 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string ");
		String str=sc.nextLine();
		System.out.println("enter any number ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			System.out.println(str);
		}
		
		sc.close();

	}

}
