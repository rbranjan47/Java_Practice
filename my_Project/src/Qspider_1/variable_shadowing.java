package Qspider_1;

public class variable_shadowing 
{
	int i=11;
	{
		System.out.println(i);
		int i=33;  // local variable have more dominance than global
		System.out.println(i);
		System.out.println(this.i);  //to use global, we have to use THIS keyword
	}
	
	public static void main(String[] args) 
	{
		new variable_shadowing();
	}

}
