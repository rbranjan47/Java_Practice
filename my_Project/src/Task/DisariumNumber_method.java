//Disarium number
//135=1^1+3^2+5^3=135

package Task;

import java.util.Scanner;

public class DisariumNumber_method 
{
	
	static int countdigits(int n)
	{
		int count=0;
		do
		{
			count++;
			n=n/10;
		}
		while(n!=0);
		return count;
	}
		
	static int pow (int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	public static boolean isDisarium(int n)
	{	
		int temp=n;
		int dc=countdigits(n);
		int sum=0;
		do
		{
			int rem=n%10;
			sum=sum+pow(rem, dc);
			dc--;
			n=n/10;
		}
		while (n!=0);
		
			return sum==temp;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=sc.nextInt();
		
		boolean disarium=isDisarium(num);
		if (disarium==true)
			System.out.println("disarium number");
		else
			System.out.println("not a disarium number");
		
		sc.close();
	}

}
