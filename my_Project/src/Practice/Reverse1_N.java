package Practice;

import java.util.Scanner;

public class Reverse1_N {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the range");
		int num=sc.nextInt();
		for (int i=num;i>0;i--)
		{
			System.out.println(i);
		}
		
		sc.close();

	}

}
