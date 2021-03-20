package Practice;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter a number ");
		int num=sc.nextInt();
		
		boolean flag=false;
		for(int i=2;i<=num/2;++i)
		{
			if(num%i==0)
			{
				flag=true;
				break;
				
			}
			
		}
		
		if (!flag)
		{
			System.out.println("it is prime number"+num);
		}
		else 
			System.out.println("not a prime number");
		sc.close();
	}

}
