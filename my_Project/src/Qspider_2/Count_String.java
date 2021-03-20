//program how many digits, special, vowels, consonants, upper case and lower case

package Qspider_2;

import java.util.Scanner;

public class Count_String 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string: ");
		
		String str=sc.nextLine();
		
		int digcount=0, spccount=0, vowcount=0, concount=0, uppcount=0, lowcount=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (ch>='A' && ch<='Z')
			{
				uppcount++;
				if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
					vowcount++;
				else 
					concount++;
			}
			else if (ch>='a' && ch<='z')
			{
				lowcount++;
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
					vowcount++;
				else 
					concount++;
			}
			else if (ch>='0' && ch<='9')
				digcount++;
			else 
				spccount++;

	     }
		
		System.out.println("digit count: "+digcount);
		System.out.println("special character count: "+spccount);
		System.out.println("vowels count: "+vowcount);
		System.out.println("consonants count: "+concount);
		System.out.println("upper case count: "+uppcount);
		System.out.println("lower case count: "+lowcount);
		sc.close();
	}
}
