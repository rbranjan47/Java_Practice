package Qspider_2;

import java.util.Scanner;

public class IntitCap_String_Demo 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string ");
		
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if (i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')	
			{
					if (ch[i]>='a' && ch[i]<='z')
				{
					 ch[i]=(char)(ch[i]-'a'+'A');
				}
					else if(ch[i]>='A' && ch[i]<='Z')
					{
						ch[i]=(char)(ch[i]+'a'-'A');
					}
			}
		}
		
		str=new String(ch);
		System.out.println(str);
		sc.close();

	}

}
