package Task;

import java.util.Scanner;

public class Product_digits 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an  integer");
		
		int n=sc.nextInt();
		
		int rem=0;
		int prod=1;
		while(n!=0)
		{
			rem=n%10;
			prod=prod*rem;
			n=n/10;
		}
		System.out.println("product is "+prod);
		
		
		sc.close();
	}

}
