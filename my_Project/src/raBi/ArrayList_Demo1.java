package raBi;

import java.util.*;


public class ArrayList_Demo1
{

	public static void main(String[] args) 
	{
		List<Integer> c=new ArrayList<Integer>();
		c.add(1);
		c.add(2);
		c.add(3);
		
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(20);
		l.add(1, 99);
		l.addAll(2, c);
		l.add(10);
		l.add(30);
		l.add(20);
		l.add(20);
		l.add(20);
		l.add(20);
		//l.add(null);
		//l.add(null);
		l.add(10);
		l.add(40);
		System.out.println(l);
		l.set(1, 50);
		
		System.out.println("before removing "+l);
		
		l.remove(0);
		System.out.println("after removing "+l);
		
		System.out.println(l.size());
		
	ArrayList<Integer> l2=new ArrayList<Integer>(l);
		System.out.println("accepting collection as array list"+l2);
		
		Collections.sort(l);
		System.out.println(l);
		
		Collections.reverse(l);
		System.out.println(l);
		
		List<Integer> l3=new ArrayList<Integer>();
		l3.addAll(l);
		System.out.println("new collections "+l3);
		
		System.out.println(l3.containsAll(l));
		System.out.println(l3.containsAll(l2));
	}

}
