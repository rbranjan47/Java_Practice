package Qspider_2;

import java.util.Scanner;

public class Array_Elements_Words 
{

	public static void nToword(int n, String str)
	{
		String one[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","thirteen","fourteen","fifteen","sixteen",
				"seventeen","eighteen","ninteen"};
		
		String two[]= {"","","tewenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		
		if (n<20)
			System.out.println(one[n]+" ");
		
		else 
			System.out.println(two[n/10]+one[n%10]+" ");
		
		if (n!=0)
			System.out.println(str+" ");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int num=sc.nextInt();
		nToword(num/10000000, "crore");
		
		
		sc.close();
	}

}
