//WAJP to define a method to  return true if the String is Panagram otherwise return false

package Qspider_3;

import java.util.Scanner;

public class Panagram_String2 
{

	static boolean isPanagram(String st)
	{
		st=st.toUpperCase();
		for(char ch='A' ; ch<='Z';ch++)
		{
			int index_ch=st.indexOf(ch);
			
			if(index_ch==-1)
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
