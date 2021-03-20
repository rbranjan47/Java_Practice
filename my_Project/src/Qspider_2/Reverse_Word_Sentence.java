//WAJP reverse the word in the sentence?
//"rama and laxmana"
//"amar dna anamxal"

package Qspider_2;

import java.util.Scanner;

public class Reverse_Word_Sentence 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string ");
		String str=sc.nextLine();
		
		char ch[]=str.toCharArray();
		String rs="";
		
		for(int i=0;i<ch.length;i++)
		{
			int k=i;  //k=i=0
			while(i<ch.length && ch[i]!=' ')
			{
				i++;
			}
			int j=i-1; //j=5-1=4
			while(j>=k) //4>0 and change continuously
			{
				rs=rs+ch[j];
				j--;
			}
			if (i<ch.length)
				rs=rs+" ";
		}
		System.out.println(rs);
		
		sc.close();
	}

}
