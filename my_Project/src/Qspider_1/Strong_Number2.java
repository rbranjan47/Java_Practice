package Qspider_1;

import java.util.Scanner;

public class Strong_Number2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for check strong number: ");
		
		int n=sc.nextInt();
		 
		int rem=0;
		int temp=n;
		int sum=0;
		
		while (n!=0)
		{
			rem=n%10;
			int fact=1;
			while (rem>1)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			n=n/10;
		}
		if (sum==temp)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");
		sc.close();
	}

}
