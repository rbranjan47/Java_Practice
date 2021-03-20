package Qspider_2;

import java.util.Scanner;

public class String_UpperCase_Without_Method
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an string ");
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='a' && ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		
		str=new String(ch);
		System.out.println(str);

		sc.close();
	}

}
