package raBi;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_Demo 
{

	public static void main(String[] args) 
	{
		SortedSet<Integer> s=new TreeSet<Integer>();
		s.add(1000);
		s.add(2000);
		s.add(3000);
		s.add(4000);
		s.add(5000);
		s.add(6000);
	//  s.add(null);    if we try to add null we will get NULLPOINTER EXCEPTION
		System.out.println(s);
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.tailSet(4000)); //4000
		System.out.println(s.subSet(1000, 5000));
		System.out.println(s.headSet(4000));
	}

}
