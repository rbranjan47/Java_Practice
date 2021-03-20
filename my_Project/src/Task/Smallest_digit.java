package Task;

import java.util.Scanner;

public class Smallest_digit 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer");
		
		int num=sc.nextInt();
		int rem=0;
		int smallest=9;
		while(num!=0)
		{
			rem=num%10;
			{
				if (smallest>rem)
					smallest=rem;
			}
			num=num/10;
		}
		System.out.println("smallest digit is: "+smallest);
		sc.close();

	}

}
