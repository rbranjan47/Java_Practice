package Qspider_1;

import java.util.Scanner;
public class pos_neg 
{
public static void main(String[] args) 
	{
       Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int a=sc.nextInt();
		System.out.println("Entered Number is: ");
		if(a>0)
			System.out.print("Positive number");
		else
			System.out.print("Negative Number");
		
        sc.close();
	}

}
