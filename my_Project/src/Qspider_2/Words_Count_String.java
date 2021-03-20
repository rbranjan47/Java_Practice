package Qspider_2;

import java.util.Scanner;

public class Words_Count_String 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string to get number of words ");
		
		String str=sc.nextLine();
		
		int wordcount=0;
		for(int i=0;i<str.length();i++)
		{
			char[] ch=str.toCharArray();
			if (i==0 && ch[i]!=' ' ||ch[i]!=' ' && ch[i-1]==' ')
				wordcount++;
				
		}
		System.out.println("number of words is "+wordcount);
		sc.close();
	}

}
