package Qspider_1;

import java.util.Scanner;

public class Count_EO {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an integer: ");
		
		int even=0;
		int odd=0;
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if (i%2==0)
			{
				even++;
			}
			else if (i%2!=0)
			{
				odd++;
			}		
		}
		System.out.println("even numbers are: "+even);
		System.out.println("odd numbers are: "+odd);
		
		
		sc.close();
	}

}
