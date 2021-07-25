package Java_Gromming;

import java.util.SortedSet;
import java.util.TreeSet;

public class treeset_demo {
	public static void main(String[] args)
	{
		SortedSet<String> ts = new TreeSet<String>();
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		ts.add("a");
		ts.add("b");
		ts.add("h");
		ts.add("m");
		System.out.println(ts);   //removes duplicates items 
		
		//checking
		System.out.println(ts.contains("c"));
		
		//first value
		System.out.println(ts.first());
		
		//is empty or not
		System.out.println(ts.isEmpty());
		
		//last element
		System.out.println(ts.last());
	}
}
