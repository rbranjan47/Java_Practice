package Qspider_1;

public class globalVar_constructor 
{
	String clr;
	int price;
	
	globalVar_constructor( String clr,int price)
	{
	this.clr=clr;
	this.price=price;
	}
	public static void main(String[] args) 
	{
		globalVar_constructor c1=new globalVar_constructor("red",1000);
		System.out.println(c1.clr + c1.price);
		globalVar_constructor c2=new globalVar_constructor("blue",2000);
		System.out.println(c2.clr +c2.price);

	}

}
