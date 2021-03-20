package raBi;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet_Demo1 
{

	public static void main(String[] args) 
	{
		SortedSet<Integer> str=new TreeSet<Integer>();
		str.add(1);
		str.add(2);
		str.add(3);
		str.add(4);
		str.add(5);
		System.out.println(str);
		
		System.out.println(str.last());
		System.out.println(str.first());
		System.out.println(str.tailSet(4));
		System.out.println(str.headSet(4));
		System.out.println(str.subSet(1, 5));
	}

}
