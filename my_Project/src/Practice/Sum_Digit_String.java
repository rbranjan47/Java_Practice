//.WAJP to calculate the sum of Digits in the String?
package Practice;

import java.util.Scanner;

public class Sum_Digit_String 
{
	public static void main (String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string along with some digits ");
		
		String str=sc.nextLine();
		
		int digsum=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if (Character.isDigit(ch))
			{
				int b=Integer.parseInt(String.valueOf(ch));
				digsum=digsum+b;
			}
		}
		System.out.println("sum of digits are "+digsum);
		
		
		sc.close();
	}
}
