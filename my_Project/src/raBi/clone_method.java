package raBi;

public class clone_method implements Cloneable
{
	int i=10;
	int j=20;
	
	public static void main(String[] args) throws CloneNotSupportedException
	{
		clone_method c1=new clone_method();
		clone_method c2=(clone_method)c1.clone();
		
		c2.i=888;
		c2.j=222;
		
		System.out.println(c1.i+"   "+c1.j); //output is 10 and 20 as we can't change parent object after clone
		System.out.println(c2.i+"   "+c2.j);  //output is 888 and 222, as we can access in clone object with new data
	}

}
