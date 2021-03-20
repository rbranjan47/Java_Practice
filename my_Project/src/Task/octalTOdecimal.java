package Task;

import java.util.Scanner;

public class octalTOdecimal 
{

	public static int octTOdec(int dec)
	{
		int sum=0;
		int pow=1;
		do
		{
			int rem=dec%10;
			sum=sum+rem*pow;
			pow=pow*8;
			
			dec=dec/10;
		}
		while (dec!=0);
			return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		
		int num=sc.nextInt();
		int number=octTOdec(num);
		
		System.out.println("in decimal form: "+number);
		sc.close();
	}

}
