package Qspider_1;

public class constructor 
{
	constructor()
	{
		System.out.println("this is default constructor");
	}
	constructor( String s)
	{
		
		System.out.println("this is parameterized constructor" +s);
	}

	
	public static void main(String[] args) 
	{
		constructor c1=new constructor();
		constructor c2=new constructor("red");
		System.out.println(c1);
		System.out.println(c2);
	}

}

// constructor name should be same as class name
// no modifiers for constructor