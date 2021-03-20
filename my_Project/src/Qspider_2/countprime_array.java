package Qspider_2;

public class countprime_array 
{
	static boolean isprime(int n)
	{
		for (int i=2;i<n/2;i++)
		{
			if (n%i==0)
				return false;
		}
		return true;
	}
	static int countprime(int ar[])
	{
		int count=0;
		for (int i=1;i<ar.length;i++)
		{
			boolean rs=isprime(ar[i]);
			if (rs==true)
				count++;
		}
		return count;
	}

	public static void main(String[] args) 
	{
		int a[]= {2,3,7,11};
		
		int primecount=countprime(a);
		
		System.out.println("number of prime numbers are: "+primecount);

	}

}
