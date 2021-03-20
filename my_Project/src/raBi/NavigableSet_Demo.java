package raBi;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet_Demo 
{

	public static void main(String[] args) 
	{
		NavigableSet< Integer> n=new TreeSet<Integer>();
		n.add(1000);
		n.add(2000);
		n.add(3000);
		n.add(4000);
		n.add(5000);
		System.out.println(n);
		
		System.out.println(n.ceiling(2000));  //return equal to 2000 or after 2000, lowest element i.e. 2000
		
		System.out.println(n.higher(2000));  //return, after 2000 least element i.e. 3000
		
		System.out.println(n.floor(3000));    //return, equal to 3000 or before 3000, highest element i.e. 3000
		                                     
		System.out.println(n.lower(2000));     //return, before 3000 highest element i.e. 2000
		
		System.out.println(n.descendingSet());
		
		System.out.println(n.pollFirst());    // remove and return FIRST element / object
		
		System.out.println(n.pollLast());     // remove and return LAST element / object
		
		System.out.println(n.descendingSet());    //return in REVERSE order
	}

}
