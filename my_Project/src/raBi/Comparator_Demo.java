package raBi;

import java.util.*;

public class Comparator_Demo implements Comparable<Comparator_Demo>
{
	int id;
	String name;
	String schl;
	
	//constructor
	Comparator_Demo(int id, String name, String schl)
	{
		this.id=id;
		this.name=name;
		this.schl=schl;
	}

	//override of toString method
	public String toString()
	{
		return this.id+" "+this.name+" "+this.schl;
	}
	
	//override of compareTo method
	public int compareTo(Comparator_Demo c)
	{
		if (this.id==c.id)
		{
			return 0;
		}
		else if (this.id>c.id)
		{
			return +1;
		}
		else 
		{
			return-1;
		}
	}
	
	
	public static void main(String[] args) 
	{
		Comparator_Demo c1=new Comparator_Demo(101,"rabi ranjan", "dav kusunda");
		Comparator_Demo c2=new Comparator_Demo(200, "nitu", "rsvm dhanbad");
		Comparator_Demo c3=new Comparator_Demo(413, "ankit ranjan", "svm bhuli");
		Comparator_Demo c4=new Comparator_Demo(89, "aart", "svm bhuli");
		Comparator_Demo c5=new Comparator_Demo(899, "deepesh", "dav koylanagar");
		
		Set<Comparator_Demo> s=new TreeSet<Comparator_Demo>();
		s.add(c1);
		s.add(c2);
		s.add(c3);
		s.add(c4);
		s.add(c5);
		
		System.out.println(s);
		System.out.println("------------------------------");
		for (Comparator_Demo cr: s)
		{
			System.out.println(cr);
		}
		System.out.println("------------------------------");
		
		Iterator<Comparator_Demo> itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

		
	}

}
