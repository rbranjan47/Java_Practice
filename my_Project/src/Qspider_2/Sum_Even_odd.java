package Qspider_2;

import java.util.Scanner;

public class Sum_Even_odd 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int i=1, esum=0, osum=0;
		while(i<=n)
		{
			if (i%2==0)
				esum=esum+i;
			else
				osum=osum+i;
			i++;
		}
System.out.println("sum of even number is: "+esum);
System.out.println("sum of odd number is: "+osum);
		sc.close();
	}

}
