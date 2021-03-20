package Task;

import java.util.Scanner;

public class Smallest_digit1 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		
		int num=sc.nextInt();
		int smallest=num%10;
		int rem=0;
		
		while(num!=0)
		{
			rem=num%10;
			if (smallest>rem)
			{
				smallest=rem;
			}
			num=num/10;
		}
		System.out.println("smallest number: "+smallest);
		sc.close();
	}

}
