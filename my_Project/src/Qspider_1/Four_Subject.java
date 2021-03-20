package Qspider_1;

import java.util.Scanner;

public class Four_Subject 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Four Subject Marks: ");
		
		int m1=sc.nextInt();
		int m2=sc.nextInt();
		int m3=sc.nextInt();
		int m4=sc.nextInt();
		
		if (m1<35 || m2<35 || m3<35 || m4<35 )
			
			System.out.println("Fail");
			else
				System.out.println("Pass");
			
		/*	if (m1>35 && m2>35 && m3>35 && m4>35)
				System.out.println("Pass");
			else 
				System.out.println("Fail");*/
	sc.close();
	}

}
