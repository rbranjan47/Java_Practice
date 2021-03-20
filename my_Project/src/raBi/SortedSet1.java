//Tree-set is already in sorted map cause Under_line data structure is 
//"Sorting and Set i.e. Balanced tree"


package raBi;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class SortedSet1 
{

	public static void main(String[] args)
	{
		//Set<String> s=new TreeSet<String>();
		Set<String> s=new TreeSet<String>(Collections.reverseOrder());
		//creating a tree-set object using set reference by up-casting
		s.add("red");
		s.add("green");
		s.add("white");
		s.add("purple");
		s.add("pink");
		s.add("blue");
		System.out.println(s);
	}

}
