package Task;

import java.util.Scanner;

public class Initcap_String 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string ");
		String str=sc.nextLine();
		
		char[] ch=str.toCharArray();
		for (int i=0;i<str.length();i++)
		{
			if (ch[i]>='a' && ch[i]<='z')
			{
				if (i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')  
				{
					//ch[i]=(char)(ch[i]-'a'+'A');
					  ch[i]=(char)(ch[i]-32);                              //R-114 r-82
				}                                                         //82-65+97=114
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				//ch[i]=(char)(ch[i]-'a'+'A');
				ch[i]=(char)(ch[i]+32);
			}
		}
	
		str=new String(ch);
		System.out.println(str);
		sc.close();
	}

}
