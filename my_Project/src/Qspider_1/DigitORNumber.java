//write a java program to check input number is digit or number ?
/* -9-----digit
   35-----number
 */

package Qspider_1;

import java.util.Scanner;

public class DigitORNumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer");
		
		int n=sc.nextInt();
		
		if (n>=-9 && n<=9)
			System.out.println("It is digit");
		else 
			System.out.println("It is number");
		
		sc.close();
}

}
