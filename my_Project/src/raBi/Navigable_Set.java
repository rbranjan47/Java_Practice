package raBi;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigable_Set {

	public static void main(String[] args)
	{
		NavigableSet<Integer> n=new TreeSet<>();
		n.add(1000);
		n.add(2000);
		n.add(3000);
		n.add(4000);
		n.add(5000);
		
		System.out.println(n);
		System.out.println(n.ceiling(2000)); //2000
		System.out.println(n.higher(2000)); //3000
		System.out.println(n.floor(3000)); //3000
		System.out.println(n.lower(3000));  //2000
		System.out.println(n.descendingSet());
		System.out.println(n.pollFirst()); //1000
		System.out.println(n.pollLast()); //5000

		System.out.println(n);
	}

}
