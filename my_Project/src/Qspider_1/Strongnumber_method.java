package Qspider_1;

public class Strongnumber_method 
{
	static boolean isStrong(int n)
	{
		int temp=n;
		int sum=0;
		while (n!=0)
		{
			int rem=n%10;
			int fact=1;
			while(fact>1)
			{
				fact=fact*rem;
				rem--;
			}
			sum=sum+fact;
			n=n/10;
		}
		return (sum==temp);
		
	}
	public static void main(String[] args) 
	{
		boolean rs=isStrong(145);
		
		if (rs==true)
			System.out.println("strong number");
		else 
			System.out.println("not a strong number");
	}

}
