package Coding_Grooming;

import java.util.Scanner;

public class Voting_Age {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age=sc.nextInt();
		
		if (age>=18)
		{
			System.out.println("you are eligible voting");
		}
		else if (age<18)
		{
			System.out.println("You are not eligibel for voting");
		}
		sc.close();
	}

}
