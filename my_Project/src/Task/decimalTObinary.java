package Task;

import java.util.Scanner;

public class decimalTObinary 
{
public static String decTObin(int n)
{
	String dec="";
	do
	{
		int rem=n%2;
		dec=rem+dec;
		
		n=n/2;
	}
	while(n!=0);
	return dec;
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number to convert into binary");
		
		int num=sc.nextInt();
		
		String bin=decTObin(num);
		System.out.println("in binary form :"+bin);
		sc.close();
	}

}
