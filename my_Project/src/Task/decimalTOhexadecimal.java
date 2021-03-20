package Task;

import java.util.Scanner;

public class decimalTOhexadecimal 
{

	public static String decTOhex(int n)
	{
		String dec="";
		do
		{
			int rem=n%16;
			
			if (rem<10)
			dec=rem+dec;
			else 
			 switch(rem)
			 {
			 case 10:
				 dec='A'+dec;
				 break;
			 case 11:
				 dec='B'+dec;
				 break;
			 case 12:
				 dec='C'+dec;
				 break;
			 case 13:
				 dec='D'+dec;
				 break;
			 case 14:
				 dec='E'+dec;
				 break;
			 case 15:
				 dec='F'+dec;
				 break;
			 }
			n=n/16;
		}
		while (n!=0);
		
		return dec;
	}
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=sc.nextInt();
		
		String number=decTOhex(num);
		
		System.out.println("in hexadecimal number: "+number);
		
		sc.next();
	}

}
