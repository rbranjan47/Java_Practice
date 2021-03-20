package Qspider_2;

import java.util.Scanner;

public class Sum_num 
{
	public static int sum(int n)
	{
		int sum=0;
		while (n>=0 && n<=1000)
		{
			sum=sum+n;
			n--;
		}
		return sum;
	}

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number ");
	int num=sc.nextInt();
	
	int result=sum(num);
	System.out.println(result);
	sc.close();
	}

}
