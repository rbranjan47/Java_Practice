//Sort using integer, by using Comparator interface which contains two methods, compare and equals

package raBi;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Comparable_Demo1 implements Comparable<Comparable_Demo1>
{
	int roll;
	String name;
	int id;
	//constructor
	Comparable_Demo1(int roll, String name, int id)
	{
		this.roll=roll;
		this.name=name;
		this.id=id;
	}
	
	//override of toString method
	public String toString()
	{
		return this.roll+" "+this.id+" "+this.name;
	}

	//override of Comparator abstract methods
	public int compareTo(Comparable_Demo1 c)
	{
		if (this.roll==c.roll)
			return 0;
		else if (this.roll>c.roll)
			return +1;
		else
			return -1;
	}
	public static void main(String[] args) 
	{
		Comparable_Demo1 c11=new Comparable_Demo1(101, "Jharkhand", 1234);
		Comparable_Demo1 c12=new Comparable_Demo1(99, "Dhanbad", 2345);
		Comparable_Demo1 c13=new Comparable_Demo1(104, "Ranchi", 4567);
		Comparable_Demo1 c14=new Comparable_Demo1(118, "Bokaro", 56781);
		Comparable_Demo1 c15=new Comparable_Demo1(120, "Jamshedpur", 78901);
		
		
		List<Comparable_Demo1> l=new ArrayList<Comparable_Demo1>();
		l.add(c11);
		l.add(c12);
		l.add(c13);
		l.add(c14);
		l.add(c15);
		
		for (Comparable_Demo1 cr: l)
		{
			System.out.println(cr);
		}
		
		Collections.sort(l);
		
		for (Comparable_Demo1 cr: l)
		{
			System.out.println(cr);
		}

	}

}
