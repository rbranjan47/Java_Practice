package Qspider_1;

public class overloaded_constructor 
{                                                //1st----no. of parameters
String name;                                     //2nd-----Data type
int pincode;                                     //3rd------sequence

overloaded_constructor()
{
	
}
overloaded_constructor(String name)
{
	this.name=name;
}
overloaded_constructor(int pincode)
{
	this.pincode=pincode;
}
overloaded_constructor (String name, int pincode)
{
	this.name=name;
	this.pincode=pincode;
}
public String toString()
{
	return name+""+pincode;
}
	public static void main(String[] args) 
	{
		overloaded_constructor c1=new overloaded_constructor();
		System.out.println(c1);
		
		overloaded_constructor c2=new overloaded_constructor("dhanbad");
		System.out.println(c2);
		
		overloaded_constructor c3=new overloaded_constructor(828104);
		System.out.println(c3);
		
		overloaded_constructor c4=new overloaded_constructor("dhanbad",828104);
		System.out.println(c4);
	}

}
