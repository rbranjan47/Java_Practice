package Qspider_2;

import java.util.Scanner;

public class Sum_digit_String {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string along with some digits ");
		
		String str=sc.nextLine();
		
		int digsum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch>='0'&& ch<='9')
			{
				digsum=digsum+ch-48;
		}
		}
		System.out.println(digsum);
		sc.close();
	}

}
