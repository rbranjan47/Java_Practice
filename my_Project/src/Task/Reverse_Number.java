package Task;

import java.util.Scanner;

public class Reverse_Number 
{

	public static int isreverse(int n)
	{
		int sum=0;
		while (n!=0)
		{
			int rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter any number");
		
		int num=sc.nextInt();
		
		int sum=isreverse(num);
		System.out.println(sum);
		
		sc.close();

	}

}
