package Task;

import java.util.Scanner;

public class String_Reverse {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter any string");
		
		String str=sc.nextLine();
		String rev="";
		char ch[]=str.toCharArray();
		for (int i=str.length()-1;i>=0;i--)
		{
		rev+=ch[i];
		}
		
		System.out.println(rev);
		sc.close();

	}

}
