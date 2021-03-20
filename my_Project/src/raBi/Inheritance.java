package raBi;

class Parent_Inheritance 
{
	int z;
	public void addition(int x, int y)
	{
		z=x+y;
		System.out.println("addition is: "+z);
	}
	
	public void subtraction(int x, int y)
	{
		z=x-y;
		System.out.println("subtraction is: "+z);
	}
}

class Child_Inheritance extends Parent_Inheritance
{
	int z;
	public void multiplication(int x,int y)
	{
		z=x*y;
		System.out.println("mulitplication is: "+z);
	}
}
public class Inheritance
{
	public static void main(String[] args) 
	{
		Child_Inheritance c=new Child_Inheritance();
		c.addition(10, 20);
		c.subtraction(20, 10);
		c.multiplication(10, 20);

	}
}

