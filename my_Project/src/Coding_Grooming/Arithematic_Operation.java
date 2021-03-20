package Coding_Grooming;

import java.util.Scanner;

public class Arithematic_Operation 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number ");
		int num1=sc.nextInt();
		System.out.println("enter second number");
		int num2=sc.nextInt();
		
		int sum=num1+num2;
		System.out.println("sum is "+sum);
		
		int sub=num1-num2;
		System.out.println("subtract is "+sub);
		
		double mul=num1*num2;
		System.out.println(mul);
		
		double div=num1/num2;
		System.out.println(div);
		
		sc.close();
	}

}
