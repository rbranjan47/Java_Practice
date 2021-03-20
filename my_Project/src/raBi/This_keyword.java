package raBi;

public class This_keyword
{
	int price = 1000;
	String name = "purce";
	int life=5;
	
	public void product()
	{
		System.out.println("product name is "+this.name+"  and its price is "+this.price+" also life is "+this.life);
	}
	
	public static void main(String[] args)
	{
		This_keyword t=new This_keyword();
		
		//use of this keyword
		t.product();
		
		System.out.println(t.hashCode());
	}

}
