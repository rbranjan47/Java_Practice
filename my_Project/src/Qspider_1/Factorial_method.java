package Qspider_1;

public class Factorial_method 
{

	static int fact(int n)
	{
		int fc=1;
		while (n>1)
		{
			fc=fc*n;
			n--;
		}
		return fc;
	}
	public static void main(String[] args) 
	{
		int f1=fact(6);  //calling statement
		System.out.println("factorial of 6 is: "+f1);
		
		int a=9;
		int f2=fact(a); //calling statement
		System.out.println("factorial of "+a+"is :"+f2);
		
		System.out.println("factorial of 4 is: "+fact(4)); //calling static
 
	}

}
