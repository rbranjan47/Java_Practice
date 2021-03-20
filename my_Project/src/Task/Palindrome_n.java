package Task;

import java.util.Scanner;

public class Palindrome_n 
{

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=sc.nextInt();
		int sum=0;
		int i=0;
		for ( i=num;i>=1;i--)
		{
			int temp=i;
			while (i!=0)
			{
				int rem=i%10;
				sum=(sum*10)+rem;
				i=i/10;
			}
			if (sum==temp)
			System.out.println(sum);	
		}
		sc.close(); 
	}
}
