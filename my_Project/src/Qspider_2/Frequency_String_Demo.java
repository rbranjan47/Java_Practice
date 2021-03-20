package Qspider_2;
import java.util.Scanner;
public class Frequency_String_Demo
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string ");

		String str=sc.nextLine();
		
		int count[]=new int[128];
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			count[ch]++;
		}
		
		for(int i=0;i<count.length;i++)
		{
			if (count[i]!=0)
			System.out.println((char)i+"->"+count[i]);
		}
		
		sc.close();
	}

}
