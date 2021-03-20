package raBi;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Comparator_Car implements Comparator<Comparator_Car>
{
	int price;
	String name;
	int power;
	
	//constructor
	Comparator_Car(String name, int price, int power)
	{
		this.name=name;
		this.price=price;
		this.power=power;
	}
	
	@Override
	public String toString() 
	{
		return this.name + this.price+this.power;
	}
	
	public int  compare(Comparator_Car car1, Comparator_Car car2) 
	{
		String s1=name;
		String s2=this.name;
		return s1.compareToIgnoreCase(s2);
		
		/* Integer POW1=this.power;
		Integer POW2=power;
		return POW1.compareTo(POW2);*/
	}
	public static void main(String[] args) 
	{
		Comparator_Car c1=new Comparator_Car("honda",500000,25);
		Comparator_Car c2=new Comparator_Car("maruti",400000,26);
		Comparator_Car c3=new Comparator_Car("ford",600000,28);
		Comparator_Car c4=new Comparator_Car("tata",450000,30);
		
		Set<Comparator_Car> lst=new TreeSet<Comparator_Car>();
		lst.add(c1);
		lst.add(c2);
		lst.add(c3);
		lst.add(c4);
		
		for (Comparator_Car carr : lst) 
		{
			System.out.println(carr.name);
		
		}
	}
}
