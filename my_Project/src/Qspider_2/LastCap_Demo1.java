package Qspider_2;

import java.util.Scanner;

public class LastCap_Demo1 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any String ");
		String str=sc.nextLine();
		
		//convert given String into char Array to perform operation on it
		char ch[]=str.toCharArray();
		for (int i=0;i<ch.length;i++)
		{
			
			
				if (ch[i]>='a' && ch[i]<='z')
				{
					if (i==str.length()-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
					{
						ch[i]=(char)(ch[i]-'a'+'A');
					}
					
				}
				else if (ch[i]>='A' && ch[i]<='Z')
				{
					ch[i]=(char)(ch[i]+'a'-'A');
				}
			
		}
		str=new String(ch);
		System.out.println(str);
		sc.close();
	}

}
