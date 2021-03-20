package raBi;


import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_Demo 
{

	public static void main(String[] args) 
	{
		SortedSet<String> str=new TreeSet<String>();
		str.add("Rabi Ranjan Kumar");
		str.add("Vishal Kumar");
		str.add("Vivek Kumar");
		str.add("Prince Kumar");
		str.add("Rahul Kumar");
		
		System.out.println(str);
		System.out.println(str.first());
		System.out.println(str.last());
		System.out.println(str.tailSet("Rabi Ranjan Kumar"));
		System.out.println(str.subSet("Rabi Ranjan", "Vivek Kumar"));
		System.out.println(str.headSet("Rabi Ranjan Kumar"));
		

	}

}
