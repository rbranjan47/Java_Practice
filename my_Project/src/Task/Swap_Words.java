package Task;

import java.util.Scanner;

public class Swap_Words 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string ");
		String str = sc.nextLine();

		int first=0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) 
		{
			if (i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
			{
				first=i;
			}
			if (i==ch.length-1 && ch[i]!=' ' || ch[i]!=' ' && ch[i+1]==' ')
			{
				char t=ch[i];
				ch[i]=ch[first];
				ch[first]=t;
			}
		}
		System.out.println(str);
		sc.close();
	}
}
