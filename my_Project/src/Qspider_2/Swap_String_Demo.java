package Qspider_2;

import java.util.Scanner;

public class Swap_String_Demo 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string ");
		
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch>='a' && ch<='z')
			{
			str=str.toUpperCase();	
			}
			else if (ch>='A' && ch<='Z')
			{
				str=str.toLowerCase();
			}
		}
		System.out.println(str);
		sc.close();
	}

}
