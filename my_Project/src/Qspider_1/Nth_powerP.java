package Qspider_1;

//finding value of "p" to power "n" i.e. p^n
//1^5=1*1*1*1*
import java.util.Scanner;

public class Nth_powerP 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of power and base");
		
		int p=sc.nextInt();
		int n=sc.nextInt();
		double pow=1;
		
		while(n>0)
		{
			pow=pow*p;
			p--;
		}
			System.out.println("value is: "+pow);
		
		
		sc.close();
	}

}
