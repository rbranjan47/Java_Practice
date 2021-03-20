package Task;

import java.util.Scanner;

public class Largest_number1
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer");
		
		int num=sc.nextInt();
		int rem=0;
		int largest=0;
		
		while(num!=0)
		{
			rem=num%10;
			if (largest<rem)
			{
				largest=rem;
			}
			num=num/10;
		}
		System.out.println("largest number is: "+largest);
		
		sc.close();
	}

}
