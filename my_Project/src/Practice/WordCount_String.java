//WAJP to count how many words present in the String

package Practice;

import java.util.Scanner;

public class WordCount_String
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string ");
		
		int worcount=0;
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch>='a' && ch<='z' || ch>='A' && ch<='Z')
			{
				worcount++;
			}
		}
		System.out.println("number of words in given string string are "+worcount);

		sc.close();
	}

}
