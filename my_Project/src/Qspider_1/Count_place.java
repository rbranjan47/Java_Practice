//count how many digits in user entered number
package Qspider_1;

import java.util.Scanner;

public class Count_place 
{

	public static int main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer: ");
		
		int even=0;
		int odd=0;
		int n=sc.nextInt();
		
		for (int i=0;i<=n;i++)
		{
			int rem=i%10;
			if (rem%2==0)
			{
				even++;
			}
			else
				odd++;
		}
		
		System.out.println("even count: "+even);
		System.out.println("odd count: "+odd);
		
		if (even%2==0)
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	}

}
