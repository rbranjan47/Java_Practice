package Qspider_1;

import java.util.Scanner;

public class ArmStrong_NumberDemo 
{

	public static boolean isArmStrong(int n)
	{
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		return sum==temp;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		
		int num=sc.nextInt();
		
		boolean result=isArmStrong(num);
		if(result==true)
		{
			System.out.println("armstrong number");
		}
		else
		{
			System.out.println("not a armstrong number");
		}
		
		
		sc.close();

	}

}
