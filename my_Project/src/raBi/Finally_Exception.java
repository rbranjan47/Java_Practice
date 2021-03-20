package raBi;

public class Finally_Exception {

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
		}
		finally {
		System.out.println("use the exception in try block");
		}
		int c=50/10;
		System.out.println(c);
	}

}
