package Qspider_1;

import java.util.Scanner;

public class Palindrome 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		int temp=num;
		while (num!=0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if (sum==temp)
		System.out.println("palindrome number");
		else
			System.out.println("not a palindrome number");
		
		
		sc.close();
	}

}
