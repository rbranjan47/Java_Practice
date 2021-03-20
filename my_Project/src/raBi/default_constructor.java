package raBi;

public class default_constructor 
{
	String name;
	int rank;
	default_constructor(String name,int rank)  //overloaded constructor
	{
		this.name=name;
		this.rank=rank;  //use of this, prevent from ambiguity
	}
	public String toString()
	{
		return name+ " "+rank;
	}
	public static void main(String[] args) 
	{
		default_constructor d1=new default_constructor("rabi",12121212);
		default_constructor d2=new default_constructor("avinash",12121212);
		
		System.out.println("Student from jharkhan,india and having rank" + d1);
		System.out.println("Student from odisha,india and having rank" + d2);
	}

}
