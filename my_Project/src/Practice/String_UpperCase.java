//WAJP to convert all the characters in the String to Upper case
package Practice;

import java.util.Scanner;

public class String_UpperCase 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the string: ");
		
		String str=sc.nextLine();
		
		str=str.toUpperCase();
		System.out.println(str);
		
		sc.close();
	}

}
