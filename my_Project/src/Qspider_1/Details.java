package Qspider_1;

import java.util.*;

public class Details 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Your Name:");
		String name=sc.next();
		System.out.println("Your name is: "+name);
		
		System.out.println("Enter your mobile number");
		long mb=sc.nextLong();
		System.out.println("Your mobile number is: "+mb);
		
		System.out.println("Enter your address");
		String adr=sc.next();
		System.out.println("Your address is: "+adr);
		
		System.out.println("Enter your prefession");
		String pr=sc.next();
		System.out.println("Your profession is: "+pr);
		
		sc.close();
	}

}
