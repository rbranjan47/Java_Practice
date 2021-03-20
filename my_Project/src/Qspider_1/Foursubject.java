package Qspider_1;

import java.util.Scanner;

public class Foursubject 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the four subject marks: ");
		
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		
		/*   if (m1<35 || m2<35 || m3<35 || m4<35)
		{
			System.out.println("fail");
		}
		else
			System.out.println("pass");   */
		
		if (m1>35 && m2>35 && m3>35 && m4>35)
		System.out.println("pass");
		else
			System.out.println("fail");
		sc.close();
	}

}
