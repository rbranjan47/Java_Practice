//Strong number means, 145=
//1!+4!+5!=145

package Qspider_1;

import java.util.Scanner;

public class Strong_number 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a number");

		int n = sc.nextInt();

		int temp = n;
		int sum = 0;

		while (n != 0) 
		{
			int rem = n % 10;
			int fact = 1;
			
			   while(rem>1)
			   {
				   fact=fact*rem;  //finding factorial of each digit
				   rem--;
			   }
			   sum=sum+fact;
			   n=n/10;
		}
		if (sum==temp)
		
			System.out.println("strong number");
	
		else 
			System.out.println("not a strong number");
		
		
		sc.close();
	}

}
