//ARMSTRONG NUMBER
//abc=cube(a)+cube(b)+cube(c)=abc

package Qspider_1;

import java.util.Scanner;

public class Armstrong_number 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer");
		
		int num=sc.nextInt();
		int sum=0;
		int rem=0;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			
				sum=sum+rem*rem*rem;
			
			num=num/10;
		}
		if (sum==temp)
		System.out.println("armstrong number");
		else 
			System.out.println("not a armstrong number");
		
		sc.close();
		
	}

}
