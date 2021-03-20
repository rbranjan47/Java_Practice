package raBi;

public class Method 
{
	int price;
	String name;
	String speed;
	
	void start()
	{
		System.out.println("bike details: ");
	}
	public String toString()
	{
		return price+name+speed;
	}
	public static void main(String[] args) 
	{
		Method m1=new Method();
		m1.start();
		m1.price=25000;
		m1.name="honda dazzler";
		m1.speed="120 km/h";
		
		System.out.println("name: "+m1.name);
		System.out.println("speed is: "+m1.speed);
		System.out.println("price is: "+m1.price);

	}

}
