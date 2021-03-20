package raBi;

public class object_creation 
{

	String colour;
	int height;
	String use;
	int life;
	
public String toString()
	{
		return colour + " and "+height+" and "+use+" and "+life;
	}
	
	public static void main(String[] args) 
	{
		object_creation o1=new object_creation();
		o1.colour="blue";
		o1.height=50;
		o1.use="songs";
		o1.life=10;
		
		System.out.println("colour is: "+o1.colour+"hieght is: "+o1.height+"uses is: "+o1.use+"life is: "+o1.life);

	}

}
