package raBi;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet_Demo1 
{

	public static void main(String[] args)
	{
		NavigableSet<Integer> str=new TreeSet<Integer>();
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
		
		System.out.println("-------------------------------------------------");
		
		System.out.println(str);
		System.out.println(str.pollFirst());  //remove and return first element
		System.out.println(str.pollLast());   //remove and return last element
		System.out.println(str.floor(4));  //lower value, in 4 or more than 4, i.e. 4
		System.out.println(str.ceiling(4));   //higher value, in 4 or less than 4 i.e. 4
		System.out.println(str.lower(4));    //lower value than 4 but less than 4 not its equal to
		System.out.println(str.higher(4));    //higher value than 4 but not equal to
		System.out.println(str.descendingSet());  //arrange the all items in descending
		System.out.println(str);
	}

}
