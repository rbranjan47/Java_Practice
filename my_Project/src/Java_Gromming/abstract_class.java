package Java_Gromming;
/*
 * >> Declared with Abstract Keyword
 * >> 
 */
abstract class base{
	
	//constructor of abstract class
	base()
	{
		System.out.println("base constaructor called ");
	}
	
	abstract void fun();
}

class Derived extends base {
	
	//conbstructor of Derived class
	Derived()
	{
		System.out.println("Derived Constructor called");
	}
	
	void fun()
	{
		System.out.println("Derived  ");
	}
}
 class abstract_class {
	public static void main(String[] args)
	{
		//when instance of inherited class created then constructor of 
		Derived d = new Derived();
		//Calling the 
		d.fun();
	}
}
