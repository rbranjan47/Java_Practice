package Qspider_1;

public class Specialnumber_method 
{

	static boolean isSpecial(int n)
	{
		int d1=n/10;
		int d2=n%10;
		
		int sum=(d1+d2)+(d1*d2);
		
		return sum==n;
	}
	public static void main(String[] args) 
	{
		boolean spec=isSpecial(59);
		if (spec==true)
			System.out.println("strong number");
		else
			System.out.println("not a strong number");

	}

}
