package Practice;

import java.util.Scanner;

public class Number1_N 
{

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the range");
	int num=sc.nextInt();
	for (int i=1;i<=num;i++)
	{
		System.out.println(i);
	}
	
	sc.close();
	}

}
