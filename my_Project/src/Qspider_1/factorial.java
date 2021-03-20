//factorial of n natural number

package Qspider_1;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any natural number");
		
		int n=sc.nextInt();
		double fact = 1;
		
		/*  for (int i=1;i<=n;i++)
		{
			fact=i*fact;
		}
		System.out.println(fact+" ");
             */
		while(n>1)
		{
			fact=fact*n;
			n--;
		}
		System.out.println(fact+" ");
		sc.close();
	}
}
