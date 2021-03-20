package raBi;

public class Method_overloading1
{
	int first_method(int x, int y)
	{
		return (x+y);
	}
	
	int first_method(int x,int y,int z)
	{
		return (x+y+z);
	}
	
	int first_method(int w,int x,int y,int z)
	{
		return (w+x+y+z);
	}
	public static void main(String[] args) 
	{
		Method_overloading1 m1=new Method_overloading1();
		
		//printing first method
		System.out.println(m1.first_method(10, 20));
		
		//after one override
		System.out.println(m1.first_method(10, 20, 30));
		
		//after second override
		System.out.println(m1.first_method(10, 20, 30, 40));
	}

}
