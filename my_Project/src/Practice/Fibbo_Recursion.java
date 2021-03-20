package Practice;

public class Fibbo_Recursion 
{
	public static int fibo(int n)
	{
		if(n<=1)
			return n;
		return fibo(n-1)+fibo(n-2);
	}

	public static void main(String[] args)
	{
		int size=100;
		System.out.println(fibo(size));

	}

}
