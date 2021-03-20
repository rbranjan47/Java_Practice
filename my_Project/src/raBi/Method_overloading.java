package raBi;

public class Method_overloading 
{

	public void first_method(int m1, String m2)
	{
		System.out.println("first method:-----"+m1+" "+m2);
	}
	public void first_method(int m1, String m2,String m3)
	{
		System.out.println("first method overloaded:-----"+m1+" "+m2+" "+m3);
	}
	public static void main(String[] args) 
	{
		Method_overloading c1=new Method_overloading();
		c1.first_method(1, "Rabi Ranjan");
		c1.first_method(1, "Rabi Ranjan", "i miss my honda bike");
	}

}
