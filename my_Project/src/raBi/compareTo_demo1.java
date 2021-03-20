package raBi;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class compareTo_demo1 implements Comparable<compareTo_demo1>
{
	String name;
	int milage;
	int mdlno;
	String type;
	
	//constructor
	compareTo_demo1(String name, int milage, int mdlno, String type)
	{
		this.name=name;
		this.milage=milage;
		this.mdlno=mdlno;
		this.type=type;
	}
	
	//override of toString method
	public String toString() 
	{
		return this.name+" "+this.milage+" "+this.mdlno+" "+this.type;
	}

	//override of comparable method
	public int compareTo(compareTo_demo1 c)
	{
		if (this.milage==c.milage)
		{
			return 0;
		}
		else if(this.milage>c.milage)
		{
			return +1;
		}
		else 
		{
			return -1;
		}
	}
	
	public static void main(String[] args) 
	{
	compareTo_demo1 d1=new compareTo_demo1("Honda", 120, 1234, "sport");
	compareTo_demo1 d2=new compareTo_demo1("Hero", 100, 2345, "formal");
	compareTo_demo1 d3=new compareTo_demo1("Royal Enfeild", 200,3456,"classic");
	compareTo_demo1 d4=new compareTo_demo1("Yamaha", 130, 4567, "sports");
	compareTo_demo1 d5=new compareTo_demo1("Suzuki", 120, 6789, "funny");
	
	List<compareTo_demo1> l=new ArrayList<compareTo_demo1>();
	l.add(d1);
	l.add(d2);
	l.add(d3);
	l.add(d4);
	l.add(d5);

	for (compareTo_demo1 com: l) 
	{
		System.out.println(com);
	}
	
	System.out.println("-----------------------------------------------");
	
	Collections.sort(l);
	for (compareTo_demo1 com: l) 
	{
		System.out.println(com);
	}

	}

}
