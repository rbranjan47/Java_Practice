package raBi;

public class Inner_Class2 
{
	public void m1()
	{
	class inner
	{
		public void sum(int x, int y)
		{
			System.out.println("The sum is "+(x+y));
		}
	}
		inner in=new inner();
		in.sum(10, 20);
		in.sum(100, 200);
	}
	public static void main(String[] args)
	{
	Inner_Class2 i=new Inner_Class2();
	i.m1();

	}

}
