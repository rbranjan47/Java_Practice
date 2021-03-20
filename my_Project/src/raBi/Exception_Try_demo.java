package raBi;

public class Exception_Try_demo {

	public static void main(String[] args)
	{
		int a=50/10;
		System.out.println(a);
		
		try {
		int b=50/0;
		System.out.println(b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e+"any number can't be divide by 0");
			e.printStackTrace();
			e.getMessage();
			}
		
		int c=50/5;
		System.out.println(c);
		
		System.out.println("use the exception in try block");

	}

}
