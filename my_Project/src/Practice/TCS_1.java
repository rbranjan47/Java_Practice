package Practice;

import java.util.Scanner;


public class TCS_1 
{
	public static void fibbonacci(int n)
	{
		int t1=0, t2=1, nextterm;
		for (int i=0;i<=n;i++)
		{
			nextterm=t1+t2;
			t2=nextterm;
			t1=t2;
		}
		System.out.print(t1);
	}
	
	public static void isprime(int n)
	{
		int flag, count=0;
		for(int i=2;i<=n;i++)
		{
			flag=0;
			for(int j=2;j<=n;j++)
			{
				if (i%j==0)
				{
					flag=1;
					break;
				}
			}
			if (flag==0)
			if (++count==n)
			{
				System.out.print(i);
				break;
			}
		}
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number ");
		
		int num=sc.nextInt();
		
		if (num%2==1)
			fibbonacci(num);
		else
			isprime(num);
			
		
		sc.close();
	}

}
