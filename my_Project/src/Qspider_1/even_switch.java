package Qspider_1;

import java.util.Scanner;

public class even_switch 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter any integer");
		
		int n=s.nextInt();
		switch(n%2)
		{
		case 0: System.out.println("even number");
		break;
			
		case 1 : System.out.println("odd number");
		break;
		}
	s.close();
	}

}
