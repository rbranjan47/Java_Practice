package raBi;

public class with_try_catch 
{

	public static void main(String[] args) 
	{
		System.out.println("hello world");
		try
		{
		System.out.println(10/0);  //Risky code inside try block
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/2); //handling code inside catch block
		}
		System.out.println("using try-catch, termination is normal");
	}

}
