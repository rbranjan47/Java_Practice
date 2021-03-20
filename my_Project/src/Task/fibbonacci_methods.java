package Task;

import java.util.Scanner;

public class fibbonacci_methods 
{
	public static void isFibbonacci(int n)
	{
		int pre=0;
		int cur=1;
		while(n>0)
		{
			System.out.println(pre+" ");
			int res=pre+cur;
			pre=cur;
			cur=res;
			n--;
		}	
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to get fibbonacci series: ");
		
		int num=sc.nextInt();
		
		isFibbonacci(num);
	
		sc.close();
	}

}
