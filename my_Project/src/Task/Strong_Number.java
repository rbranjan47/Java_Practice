package Task;

import java.util.Scanner;

public class Strong_Number 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a integer");
		
		int num=sc.nextInt();
		int rem=0;
		int sum=0;
		int temp=num;
		while(num!=0)
		{
			rem=num%10;
			int fact=1;
			while(rem>1)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			num=num/10;
		}
		if (sum==temp)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");
		
		sc.close();
	}

}
