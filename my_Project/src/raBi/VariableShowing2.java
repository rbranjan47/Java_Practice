package raBi;

public class VariableShowing2 
{
	int price=1000;
	String name="Sonata";
	
	public void product()
	{
		int price=1050;
		String name="fastrack";
		System.out.println("Product name is "+name+" and price is "+price);
		
		// to get the global variable also use this keyword
		System.out.println("Old Product name is "+this.name+" and its price is "+this.price);
	}

	public static void main(String[] args) 
	{
		VariableShowing2 v=new VariableShowing2();
		
		v.product(); //here due to variable shadowing the LOCAL VARIABLE are dominated on GLOBAL INSTANCE VARIABLE
	
		
		
	}

}
