package raBi;

class Parent
{
	int money=1000000;
	String girl="unknown";
	int land=2500000;
	
	void property()
	{
		System.out.println("it is my propeerty and "+money+" "+girl+" "+land);
	}
	
}
class son extends Parent
{
	int bike=2;
	int car=1;
	String girl="Known";
	
	void myproperty()
	{
		System.out.println("this is first son property"+money+" "+bike+" "+girl+" "+land+" "+car);
	}
	
}

class girl extends Parent
{
	int makeupKit=5;
	int bike=1;
	String boy="Unknown";
	
	void thisproperty()
	{
		System.out.println("this is first daughter property"+makeupKit+" "+bike+" "+boy+" "+bike+" "+land);
	}
}
public class Method_Overiding 
{
	public static void main(String[] args) 
	{
		Parent p=new Parent();
		p.property();
		
		Parent s=new son();
		s.property();
		
		son s1=new son();
		s1.myproperty();
		
		son s2=(son)p;
		s2.property();
		
		
	}

}
