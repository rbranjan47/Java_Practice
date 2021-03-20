package Task;

import java.util.Scanner;

public class Difference_smallest_greatest 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer");
		
		int num=sc.nextInt();
		int rem=0;
		int largest=0;
		int smallest=9;
		while(num!=0)
		{
			rem=num%10;
			if (largest<rem)
			{
				largest=rem;
			}
			if (smallest>rem)
			{
				smallest=rem;
			}
			num=num/10;
		}
		int diff=largest-smallest;
		System.out.println("difference between: "+diff);
		
		sc.close();
	}

}
