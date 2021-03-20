//n to power p

package Qspider_1;

import java.util.Scanner;

public class Power_method 
{
 public static int getPower(int n , int p)
 {
	 int mul=1;
	 while (p>0)
	 {
		 mul=mul*n;
		 p--;
	 }
	 return mul;
 }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter base and power value");
		
		int base=sc.nextInt();
		int pow=sc.nextInt();
		
		int value=getPower(base,pow);
		System.out.println("value is: "+value);
		sc.close();
	}

}
