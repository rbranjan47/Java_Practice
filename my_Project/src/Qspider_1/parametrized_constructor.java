package Qspider_1;

public class parametrized_constructor 
{
	int price;
	String name;
	parametrized_constructor(int price, String name)
	{
		this.name=name;
		this.price=price;
	}
	public String toString()
	{
		return price+"and" + name;
	}

	public static void main(String[] args) 
	{
		/*parametrized_constructor p1=new parametrized_constructor();
		System.out.println(p1.price + p1.name);
		parametrized_constructor p2=new parametrized_constructor();  //all are taking same parameters 
		System.out.println(p2.price+p2.name);   // this is negative point */
		
		parametrized_constructor p1=new parametrized_constructor(10,"ParleG");
		parametrized_constructor p2=new parametrized_constructor(20,"Britaniaa");
		System.out.println(p1);
		System.out.println(p2);
	}
}


