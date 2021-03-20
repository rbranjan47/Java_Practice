package Task;

import java.util.Scanner;

public class decTOoctal 
{
	public static String decTOoct(int n) 
	{
		String oct="";
		do
		{
			int rem=n%8;
			oct=rem+oct;
			
			n=n/8;
		}
		while(n!=0);
		
		return oct;
	}

	public static void main(String[] args) 
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a number ");
	 
	 int num=sc.nextInt();
	 
	 String number=decTOoct(num);
	 System.out.println("in octal form number is "+number);

	 sc.close();
	}

}
