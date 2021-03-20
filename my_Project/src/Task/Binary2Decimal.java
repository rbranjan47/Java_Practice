package Task;

import java.util.Scanner;

public class Binary2Decimal 
{
	public static int decTbn(int n)
	{
		int sum=0;
		do
		{
			int rem=n%10;
			sum=sum*2+rem;
			
			n=n/10;
		}
		while(n!=0);
		return sum;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=sc.nextInt();
		
		int number=decTbn(num);
		System.out.println("binary number is: "+number);
		
		sc.close();
	}

}
