package Task;

import java.util.Scanner;

public class Reverse_method 
{
public static int isReverse(int n)
{
	int sum=0;
	while(n!=0)
	{
		int rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	
	return sum;
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number ");
		
		int num= sc.nextInt();
		int rev= isReverse(num);
			System.out.println("reverse is "+rev);
			
			sc.close();
	}

}
