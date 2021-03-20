//WAJP to count and print how many alphabet digit and special characters  present in the String?

package Practice;

import java.util.Scanner;

public class Aplhabet_Special_String
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string ");

		String str=sc.nextLine();
		
		
		int alpcount=0, spccount=0, digcount=0;
		for (int i=0;i<str.length();i++)
		{;
			char ch=str.charAt(i);
			if (ch>='a' && ch<='z' || ch>='A' && ch<='Z' )
				alpcount++;
			else if (ch>='0' && ch<='9')
				digcount++;
			else if (ch!=' ')
				spccount++;
				
		}
		System.out.println("alphabet count is: "+alpcount);
		System.out.println("special count is: "+spccount);
		System.out.println("digits present is: "+digcount);
		sc.close();
	}

}
