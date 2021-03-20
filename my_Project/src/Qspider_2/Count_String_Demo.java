package Qspider_2;

import java.util.Scanner;

public class Count_String_Demo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an string ");
		String str=sc.nextLine();
		
		int word=1;
		char ch[]=str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
				word++;
		}
		
		System.out.println("number of words is: "+word);
		sc.close();
	}

}
