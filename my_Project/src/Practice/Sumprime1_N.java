package Practice;

import java.util.Scanner;

public class Sumprime1_N 
{
public static boolean isPrime(int n)
{
	
	if (n==1)
		return false;
	for (int i=2;i<n;i++)
	{
	if (n%i==0)
		return false;
	}
	return true;
}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range");
		
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(isPrime(i))
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		sc.close();
	}

}
