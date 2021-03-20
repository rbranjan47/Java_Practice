//if our string is, "baBa@123"-----
//then, A->2 B->2

package Qspider_2;

import java.util.Scanner;

public class Frequency_Alphabet_String 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string ");
		String str=sc.nextLine();

		int count[]=new int[26];
	
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
					
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if (ch>='a' && ch<='z')
				count[ch-97]++;
		}
		
		for (int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			System.out.println((char)(i+97)/*(i+65)*/+"->"+count[i]); // to print 0 to alphabet
		}
		
		sc.close();
	}

}
