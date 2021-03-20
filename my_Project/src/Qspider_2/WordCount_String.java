package Qspider_2;
//another logic for word count, one more in PRACTCE package
import java.util.Scanner;

public class WordCount_String {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string ");
		
		int worcount=0;
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(i==0 && ch[i]!=' ' || ch[i]!=' ' && ch[i-1]==' ')
		 		worcount++;
		}
		System.out.println("number of words in given string string are "+worcount);

		sc.close();

		
		//i=0 and  ch[0]!=' ' or ch[5] and ch[4]==' '
	}

}
