package Qspider_1;

import java.util.Scanner;

public class Count_String 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string: ");
		
		String s=sc.next();
		int count=0;
		for (int i=0;i<s.length();i++)
	
			if (Character.isDigit(s.charAt(i)))
			{
				count++;
			}
		System.out.println(count);
sc.close();
	}

}
