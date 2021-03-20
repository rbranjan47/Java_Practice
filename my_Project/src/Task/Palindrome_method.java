package Task;

import java.util.Scanner;
public class Palindrome_method 
{
	
	public static boolean palindrome(int n)
	{
		int temp=n;
		int sum=0;
		while (n>0)
		{
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		return temp==sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
	
		int num=sc.nextInt();
		
		boolean p=palindrome(num);
		if (p==true)

			System.out.println("palindrome number");
		
		else
			System.out.println("not a palindrome number");
		
		sc.close();
	}
}
