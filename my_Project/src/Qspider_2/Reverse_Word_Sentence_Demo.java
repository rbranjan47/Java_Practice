package Qspider_2;

import java.util.Scanner;

public class Reverse_Word_Sentence_Demo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		
		String str=sc.nextLine();
		char ch[]=str.toCharArray();
		String rs="";
		for(int i=ch.length-1;i>=0;i--)
		{
			int k=i;
			while(i>=0 && ch[i]!=' ')
			{
				i--;
			}
			int j=i+1;
			while(k>=j)
			{
				rs=rs+ch[j];
				j++;
			}
			if (i>0)
				rs=rs+" ";
		}
		System.out.println(rs);
	sc.close();
	}

}
