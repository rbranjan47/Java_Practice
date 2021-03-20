
package Qspider_2;

import java.util.Scanner;

public class decimalTOhexadecimal 
{

	public static String decTOhexa(int dec)
	{
		String hexa="";
		do
		{
			int rem=dec%16;
			
			if (rem<10) //we remainder less than 10
				hexa=rem+hexa;
			else
				hexa=(char)(rem+55)+hexa;   // BY ASCII value i.e. 
			
			dec=dec/16;                      //A----65=55+10
		}                                   //B----66=55+11
		while (dec!=0);                    //c----67=55+12
		return hexa;                       //We just add remainder in ASCII value
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		
		int num=sc.nextInt();
		
		String hexadecimalnumber=decTOhexa(num);
		System.out.println("hexadecimal number is "+hexadecimalnumber);
		
		sc.close();

	}

}
