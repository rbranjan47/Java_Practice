package raBi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTo_movie implements Comparable<CompareTo_movie>
{
	String name;
	int coupan;
	String movname;
	
	//defining constructor to initialize the object
	CompareTo_movie (String name, int coupan, String movname)
	{
		this.name=name;
		this.coupan=coupan;
		this.movname=movname;
	}
//over-riding with toString method
	public String toString()
	{
		return this.name+" "+this.coupan+" "+this.movname;
	}
	
	//overriding for sorting
	@Override
	public int compareTo(CompareTo_movie m)
	{
		if(this.coupan==m.coupan)
		{
			return 0;
		}
		else if(this.coupan>m.coupan)
		{
			return 1;
		}
		else 
		{
			return -1;
		}
	}
	
	public static void main(String[] args) 
	{
	CompareTo_movie m1=new CompareTo_movie("Rahul", 2234, "DDLG");
	CompareTo_movie m2=new CompareTo_movie("Visal", 1245, "Dangal");
	CompareTo_movie m3=new CompareTo_movie("Prince", 2256, "Titanic");
	CompareTo_movie m4=new CompareTo_movie("Vivek", 3267, "Ashiqui 3");
	CompareTo_movie m5=new CompareTo_movie("Dhiraj", 9289, "Timon and Pumba");
	
	List<CompareTo_movie> l=new ArrayList<CompareTo_movie>();
	l.add(m1);
	l.add(m2);
	l.add(m3);
	l.add(m4);
	l.add(m5);
	
	//now sorting using ENhanced for loop
	System.out.println("before sorting");
	System.out.println();
	
	for(CompareTo_movie mov : l)
	{
		System.out.println(mov);
	}
	
	System.out.println("------------------------------");
	System.out.println("after sorting");
	System.out.println();
	
	Collections.sort(l);
	for(CompareTo_movie mov : l)
	{
		System.out.println(mov);
	}
	}

}
