//Bigger among 3 inputed number

/*  TIP:- &&-----logical AND
          ||-----logical OR */
package Qspider_1;

import java.util.Scanner;
public class nmber3Bigger 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		System.out.println("Entered Number is: "+a+" "+b+" "+c);
		
		if (a>b && a>c)
		System.out.println("Bigger number is: "+a);
		
		else if (b>a && b>c)
			System.out.println("Bigger number is: "+b);
		else 
			System.out.println("Bigger number is: "+c);
		
		sc.close();

	}
}
