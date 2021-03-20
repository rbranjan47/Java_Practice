package raBi;

public class Constructor_overloading
{
	int weight;
	int height;
	int width;
	String name;
	
	public Constructor_overloading()
	{
		
	}
	
	public Constructor_overloading(int height, int weight)
	{
		this.height=height;
		this.weight=weight;
		
	}
	
	public Constructor_overloading(int height,int weight, int width)
	{
		this.height=height;
		this.weight=weight;
		this.width=width;
	}
	
	public Constructor_overloading(int height, int weight,int width, String name)
	{
		this.height=height;
		this.weight=weight;
		this.width=width;
		this.name=name;
	}

	public static void main(String[] args)
	{
		//empty constructor
	Constructor_overloading c1=new 	Constructor_overloading();
	System.out.println(c1.height+" "+c1.name+" "+c1.weight+" "+c1.width);
	
	//2 parameter constructor
	Constructor_overloading c2=new 	Constructor_overloading(10,20);
	System.out.println(c2.height+" "+c2.weight);
	
	//3 parameter constructor
	Constructor_overloading c3=new 	Constructor_overloading(10,20,30);
	System.out.println(c3.height+" "+c3.weight+" "+c3.width);
	
	//4 parameter constructor
	Constructor_overloading c4=new 	Constructor_overloading(10,20,30,"Rabi Ranjan");
	System.out.println(c4.height+" "+c4.weight+" "+c4.width+" "+c4.name);
	}
}
