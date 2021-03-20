package Qspider_1;

public class sumofdigits_method 
{

	public int digitsum(int n)
	{
		
		int sum=0;
		do
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
		}
		while(n!=0);
		return sum;
	}
	

	public static void main(String[] args) 
	{
		sumofdigits_method s=new sumofdigits_method();
		int sum1=s.digitsum(121);
		System.out.println("sum of digits is:"+sum1);
		
		int sum2=s.digitsum(122);
		System.out.println("sum of digits is:"+sum2);
		
		int sum3=s.digitsum(123);
		System.out.println("sum of digits is:"+sum3);
		
	}

}
