package Task;

import java.util.Scanner;

public class Fibbonacci_Demo {
	public static void isfibbo(int num)
	{
		int pre=0;
		int cur=1;
		if (num==0)
		{
			System.out.println("enter valid number for fibbonaci series");
		}
		else 
		{
			while (num>0)
			{
				System.out.println(pre+" ");
				int result=pre+cur;
				pre=cur;
				cur=result;
				num--;
			}
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter any number");
		
		int num=sc.nextInt();
		
		isfibbo(num);
		
		sc.close();
	}

}
