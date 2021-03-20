//WAJP to define a method to  return true if the String is Panagram otherwise return false

package Qspider_3;

import java.util.Scanner;

public class Panagram_String
{
	static boolean isPanagram(String st)
	{
		int count[]=new int[26];
		
		for(int i=0;i<st.length();i++)
		{
			char ch=st.charAt(i);
			if(ch>='A' && ch<='Z')
				count[ch-65]++;
			else if (ch>='a' && ch<='z')
				count[ch-97]++;
		}
		for(int i=0;i<26;i++)
		{
			if (count[i]==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence: ");
		String st=sc.nextLine();
		boolean rs=isPanagram(st);
		
		if (rs==true)
			System.out.println("it is an panagram");
		else if (rs==false)
		System.out.println("it is not an panagram");
		
		sc.close();
	}
}
