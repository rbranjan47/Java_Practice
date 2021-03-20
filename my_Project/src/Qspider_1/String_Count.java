package Qspider_1;

import java.util.Scanner;

public class String_Count
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string ");
		String str=sc.nextLine();
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(i))
			{
				count++;
			}
		}
		
		System.out.println("count is "+count);
		sc.close();

	}

}
